package com.developerputra.prihasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toolbar;

public class Pen13 extends AppCompatActivity {
    private Button deteksi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pen13);

        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        deteksi = (Button)findViewById(R.id.za13);

        deteksi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                view.startAnimation(myAnim);
                Intent ee113 = new Intent(getApplicationContext(),Konsultasi.class);
                startActivity(ee113);
            }
        });
    }
}
