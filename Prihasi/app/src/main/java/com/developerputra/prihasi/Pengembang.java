package com.developerputra.prihasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.util.Linkify;
import android.widget.TextView;

public class Pengembang extends AppCompatActivity {
    private TextView hp, gmail,unila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengembang);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        gmail = (TextView)findViewById(R.id.gmail);
        hp = (TextView)findViewById(R.id.hp);
        unila = (TextView)findViewById(R.id.unila);

        unila.setText("www.unila.ac.id");
        Linkify.addLinks(unila, Linkify.ALL);

        hp.setText("+628877051023");
        Linkify.addLinks(hp, Linkify.ALL);

        gmail.setText("putrapribowo071297@gmail.com");
        Linkify.addLinks(gmail, Linkify.ALL);
    }
}
