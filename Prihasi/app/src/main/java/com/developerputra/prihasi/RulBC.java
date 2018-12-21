package com.developerputra.prihasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RulBC extends AppCompatActivity {
    private Button kembali;
    private Button Jawab;
    private RadioGroup rg3;
    private RadioButton rbtn14,rbtn15;
    private RadioButton rbtn19, rbtn21, rbtn23, rbtn25, rbtn26, rbtn27,rbtn28, rbtn30, rbtn32;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_bc);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        rg3 = (RadioGroup) findViewById(R.id.GBbc);


        rbtn14 = (RadioButton) findViewById(R.id.a16);
        rbtn15 = (RadioButton) findViewById(R.id.a18);
        rbtn19 = (RadioButton) findViewById(R.id.a20);

        rbtn23 = (RadioButton) findViewById(R.id.a22);

        rbtn25 = (RadioButton) findViewById(R.id.a23);
        rbtn26 = (RadioButton) findViewById(R.id.a24);
        rbtn27 = (RadioButton) findViewById(R.id.a25);
        rbtn28 = (RadioButton) findViewById(R.id.a12b);

        rbtn30 = (RadioButton) findViewById(R.id.a27b);

        rbtn32 = (RadioButton) findViewById(R.id.a29);

        Jawab = findViewById(R.id.Jawabbc);


        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                User7();
            }
        });
    }

    private void User7(){
        if(rbtn14.isChecked()){
            Intent toas6 = new Intent(RulBC.this, Rul_bc1.class);
            startActivity(toas6);
        }else if(rbtn15.isChecked()){
            Intent toas7 = new Intent(RulBC.this, Rul_bc2.class);
            startActivity(toas7);
        }else if(rbtn19.isChecked()){
            Intent toas8 = new Intent(RulBC.this, Rul_bc3.class);
            startActivity(toas8);
        }else if(rbtn23.isChecked()){
            Intent zz13 = new Intent(RulBC.this,Pen13.class);
            startActivity(zz13);
        }else if(rbtn25.isChecked()){
            Intent zz14 = new Intent(RulBC.this,Pen14.class);
            startActivity(zz14);
        }else if(rbtn26.isChecked()){
            Intent toas9 = new Intent(RulBC.this, Rul_bc4.class);
            startActivity(toas9);
        }else if(rbtn27.isChecked()){
            Intent toas10 = new Intent(RulBC.this, Rul_bc5.class);
            startActivity(toas10);
        }else if(rbtn28.isChecked()){
            Intent toas11 = new Intent(RulBC.this, Rul_bc6.class);
            startActivity(toas11);
        }else if(rbtn30.isChecked()){
            Intent toas12 = new Intent(RulBC.this, Rul_bc7.class);
            startActivity(toas12);
        }else if(rbtn32.isChecked()){
            Intent toas13 = new Intent(RulBC.this, Rul_bc8.class);
            startActivity(toas13);
        }else{
            Toast.makeText(getApplicationContext(), "Tidak Ada Jawaban Yang Dipilih", Toast.LENGTH_SHORT).show();
        }
    }
    }

