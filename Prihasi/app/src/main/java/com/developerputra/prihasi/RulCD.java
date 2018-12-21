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

public class RulCD extends AppCompatActivity {
    private Button kembali;
    private Button Jawab;
    private RadioGroup rg3;
    private RadioButton rbtn34,rbtn35,rbtn36,rbtn37,rbtn39,rbtn41,rbtn42,rbtn43,rbtn44,rbtn45 ,rbtn19, rbtn50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_cd);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        rg3 = findViewById(R.id.GBcd);
        rbtn19 = (RadioButton) findViewById(R.id.a10);
        rbtn34 = (RadioButton) findViewById(R.id.a31);
        rbtn35 = (RadioButton) findViewById(R.id.a32);
        rbtn36 = (RadioButton) findViewById(R.id.a33);
        rbtn37 = (RadioButton) findViewById(R.id.a34);

        rbtn39 = (RadioButton) findViewById(R.id.a36);

        rbtn41 = (RadioButton) findViewById(R.id.a38);
        rbtn42 = (RadioButton) findViewById(R.id.a39);
        rbtn43 = (RadioButton) findViewById(R.id.a40);
        rbtn44 = (RadioButton) findViewById(R.id.a41);
        rbtn45 = (RadioButton) findViewById(R.id.a42);
        rbtn50 = (RadioButton) findViewById(R.id.a444);

        Jawab = findViewById(R.id.Jawabcd);


        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User8();
            }
        });
    }

    private void User8(){
        if(rbtn34.isChecked()){
            Intent teos0147 = new Intent(RulCD.this, Pen21.class);
            startActivity(teos0147);
        }else if(rbtn35.isChecked()){
            Intent teos0147a = new Intent(RulCD.this, Pen22.class);
            startActivity(teos0147a);
        }else if(rbtn36.isChecked()){
            Intent teos0147b = new Intent(RulCD.this, Pen23.class);
            startActivity(teos0147b);
        }else if(rbtn37.isChecked()){
            Intent teos012 = new Intent(RulCD.this, Rul_cd1.class);
            startActivity(teos012);
        }else if(rbtn39.isChecked()){
            Intent teos013 = new Intent(RulCD.this, Rul_cd2.class);
            startActivity(teos013);
        }else if(rbtn41.isChecked()){
            Intent teos0147bdd = new Intent(RulCD.this, Pen26.class);
            startActivity(teos0147bdd);
        }else if(rbtn42.isChecked()){
            Intent teos0147bddd = new Intent(RulCD.this, Pen27.class);
            startActivity(teos0147bddd);
        }else if(rbtn43.isChecked()){
            Intent teos0147bddxx = new Intent(RulCD.this, Pen28.class);
            startActivity(teos0147bddxx);
        }else if(rbtn44.isChecked()){
            Intent teos0147bddxxf = new Intent(RulCD.this, Pen29.class);
            startActivity(teos0147bddxxf);
        }else if(rbtn45.isChecked()){
            Intent teos015 = new Intent(RulCD.this, Rul_cd4.class);
            startActivity(teos015);
        }else if(rbtn19.isChecked()){
            Intent ow1 = new Intent(RulCD.this, Rul_ab2.class);
            startActivity(ow1);
        }else if(rbtn50.isChecked()) {
            Intent ow1 = new Intent(RulCD.this, Rul_cd3.class);
            startActivity(ow1);
        }else{
            Toast.makeText(getApplicationContext(), "Tidak Ada Jawaban Yang Dipilih", Toast.LENGTH_SHORT).show();
        }
    }
}
