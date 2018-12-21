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

public class RulAB extends AppCompatActivity {
    private Button kembali;
    private Button Jawab;
    private RadioGroup rg2;
    private RadioButton rbtn10, rbtn11, rbtn12, rbtn17, rbtn18 ;
    private RadioButton rbtn21, rbtn22;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_ab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        rg2 =(RadioGroup) findViewById(R.id.GBab);
        rbtn10 = (RadioButton) findViewById(R.id.a1);
        rbtn11 = (RadioButton) findViewById(R.id.a2);
        rbtn12 = (RadioButton) findViewById(R.id.a3);

        rbtn17 = (RadioButton) findViewById(R.id.a8);
        rbtn18 = (RadioButton) findViewById(R.id.a9);

        rbtn21 = (RadioButton) findViewById(R.id.a12);
        rbtn22 = (RadioButton) findViewById(R.id.a6b);

        Jawab = (Button)findViewById(R.id.jawabab);

        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                UserAnswer();
            }
        });
    }
    private void UserAnswer(){
        if(rbtn10.isChecked()){
            Intent zz1 = new Intent(RulAB.this,Pen1.class);
            startActivity(zz1);
        }else if(rbtn11.isChecked()){
            Intent zz2 = new Intent(RulAB.this,Pen2.class);
            startActivity(zz2);
        }else if(rbtn12.isChecked()){
            Intent ow = new Intent(RulAB.this, Rul_ab1.class);
            startActivity(ow);
        }else if(rbtn17.isChecked()){
            Intent zz5 = new Intent(RulAB.this,Pen5.class);
            startActivity(zz5);
        }else if(rbtn18.isChecked()){
            Intent zz6 = new Intent(RulAB.this,Pen6.class);
            startActivity(zz6);
        }else if(rbtn21.isChecked()){
            Intent ow2 = new Intent(RulAB.this, Rul_ab3.class);
            startActivity(ow2);
        }else if(rbtn22.isChecked()) {
            Intent zz12 = new Intent(RulAB.this, Pen12.class);
            startActivity(zz12);
        }else{
            Toast.makeText(getApplicationContext(), "Tidak Ada Jawaban Yang Dipilih", Toast.LENGTH_SHORT).show();
        }
    }
}
