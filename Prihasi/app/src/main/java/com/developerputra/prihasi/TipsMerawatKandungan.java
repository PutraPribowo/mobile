package com.developerputra.prihasi;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TipsMerawatKandungan extends AppCompatActivity {
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<InfolearningModel> data;
    ArrayList<String> namalearninglist1;
    ArrayList<String> deskripsilist1;
    ArrayList<String> link_gambar1;
    SearchView searchView;
    LinkedHashMap namelist;
    LinkedHashMap title;

    private SQLiteDatabase db4;
    private Database2 datalearning;
    private Cursor learningCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_merawat_kandungan);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setQueryHint("Pencarian");
        searchView.setQueryRefinementEnabled(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        data = new ArrayList<InfolearningModel>();
        datalearning = new Database2(this);
        db4 = datalearning.getWritableDatabase();
        datalearning.createTable4(db4);
        datalearning.generateData4(db4);

        fetchData();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {return  false; }

            @Override
            public boolean onQueryTextChange(String newText) {
                newText = newText.toLowerCase();
                final ArrayList<InfolearningModel> filteredList = new ArrayList<InfolearningModel>();
                for (int i = 0; i < namalearninglist1.size(); i++) {
                    final String text = namalearninglist1.get(i).toLowerCase();
                    if (text.contains(newText)) {
                        filteredList.add(new InfolearningModel(namalearninglist1.get(i),deskripsilist1.get(i),link_gambar1.get(i)));
                    }
                }
                adapter = new CustomMerawatKandungan(filteredList);
                recyclerView.setAdapter(adapter);
                return true;
            }
        });
    }

    public void fetchData() {

        namelist=new LinkedHashMap<>();
        title=new LinkedHashMap<>();

        int a,b,c;
        learningCursor = db4.query("merawat" ,null, null, null, null, null, null);
        a=learningCursor.getColumnIndex("nama_merawat");
        b=learningCursor.getColumnIndex("deskripsi_merawat");
        c=learningCursor.getColumnIndex("referensi_merawat");

        namalearninglist1=new ArrayList<String>();
        deskripsilist1= new ArrayList<String>();
        link_gambar1= new ArrayList<String>();

        while (learningCursor.moveToNext()){
            title.put(learningCursor.getString(a),"");
            namelist.put(learningCursor.getString(b), learningCursor.getString(c));
        }
        Iterator entry = title.entrySet().iterator();
        Iterator entries = namelist.entrySet().iterator();

        while (entries.hasNext()&& entry.hasNext()) {
            Map.Entry thisEntry = (Map.Entry) entries.next();
            Map.Entry thatEntry = (Map.Entry) entry.next();
            namalearninglist1.add(String.valueOf(thatEntry.getKey()));
            deskripsilist1.add(String.valueOf(thisEntry.getKey()));
            link_gambar1.add(String.valueOf(thisEntry.getValue()));
        }

        for (int i = 0; i < namalearninglist1.size(); i++) {
            data.add(new InfolearningModel(namalearninglist1.get(i), deskripsilist1.get(i), link_gambar1.get(i)));
        }
        adapter = new CustomMerawatKandungan(data);
        recyclerView.setAdapter(adapter);
    }
}
