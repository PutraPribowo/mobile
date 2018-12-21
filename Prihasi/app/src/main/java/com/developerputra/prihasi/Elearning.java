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

public class Elearning extends AppCompatActivity {
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    public static ArrayList<InfolearningModel> data;
    ArrayList<String> namalearninglist;
    ArrayList<String> deskripsilist;
    ArrayList<String> link_gambar;
    SearchView searchView;
    LinkedHashMap namelist;
    LinkedHashMap title;

    private SQLiteDatabase db3;
    private Database2 datalearning;
    private Cursor learningCursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearning);

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
        db3 = datalearning.getWritableDatabase();
        datalearning.createTable3(db3);
        datalearning.generateData3(db3);

        fetchData();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {return  false; }

            @Override
            public boolean onQueryTextChange(String newText) {
                newText = newText.toLowerCase();
                final ArrayList<InfolearningModel> filteredList = new ArrayList<InfolearningModel>();
                for (int i = 0; i < namalearninglist.size(); i++) {
                    final String text = namalearninglist.get(i).toLowerCase();
                    if (text.contains(newText)) {
                        filteredList.add(new InfolearningModel(namalearninglist.get(i),deskripsilist.get(i),link_gambar.get(i)));
                    }
                }
                adapter = new CustomAdapterInfolearning(filteredList);
                recyclerView.setAdapter(adapter);
                return true;
            }
        });
    }

    public void fetchData() {

        namelist=new LinkedHashMap<>();
        title=new LinkedHashMap<>();

        int a,b,c;
        learningCursor = db3.query("learning" ,null, null, null, null, null, null);
        a=learningCursor.getColumnIndex("nama_learning");
        b=learningCursor.getColumnIndex("deskripsi");
        c=learningCursor.getColumnIndex("gambar");

        namalearninglist=new ArrayList<String>();
        deskripsilist= new ArrayList<String>();
        link_gambar= new ArrayList<String>();

        while (learningCursor.moveToNext()){
            title.put(learningCursor.getString(a),"");
            namelist.put(learningCursor.getString(b), learningCursor.getString(c));
        }
        Iterator entry = title.entrySet().iterator();
        Iterator entries = namelist.entrySet().iterator();

        while (entries.hasNext()&& entry.hasNext()) {
            Map.Entry thisEntry = (Map.Entry) entries.next();
            Map.Entry thatEntry = (Map.Entry) entry.next();
            namalearninglist.add(String.valueOf(thatEntry.getKey()));
            deskripsilist.add(String.valueOf(thisEntry.getKey()));
            link_gambar.add(String.valueOf(thisEntry.getValue()));
        }

        for (int i = 0; i < namalearninglist.size(); i++) {
            data.add(new InfolearningModel(namalearninglist.get(i), deskripsilist.get(i), link_gambar.get(i)));
        }
        adapter = new CustomAdapterInfolearning(data);
        recyclerView.setAdapter(adapter);
    }

}
