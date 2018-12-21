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

public class Konsultasi extends AppCompatActivity {
    private RadioGroup rg1;
    private RadioButton rbtn1, rbtn2, rbtn3;
    private Button jawab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsultasi);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        rg1 = (RadioGroup) findViewById(R.id.umur);
        rbtn1 = (RadioButton) findViewById(R.id.tri1);
        rbtn2 = (RadioButton) findViewById(R.id.tri2);
        rbtn3 = (RadioButton) findViewById(R.id.tri3);

        jawab = (Button) findViewById(R.id.JawabKel);

        jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User1();
            }
        });
    }


        private void User1(){
            if (rbtn1.isChecked()) {
                Intent hu1 = new Intent(Konsultasi.this, RulAB.class);
                startActivity(hu1);

            } else if (rbtn2.isChecked()) {
                Intent hu2 = new Intent(Konsultasi.this, RulBC.class);
                startActivity(hu2);

            } else if (rbtn3.isChecked()) {
                Intent hu3 = new Intent(Konsultasi.this, RulCD.class);
                startActivity(hu3);

            } else {
                Toast.makeText(getApplicationContext(), "Tidak Ada Jawaban Yang Dipilih", Toast.LENGTH_SHORT).show();
            }
        }
    }

