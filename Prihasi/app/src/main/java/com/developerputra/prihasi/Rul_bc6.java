package com.developerputra.prihasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Rul_bc6 extends AppCompatActivity {
    private CheckBox tifoid1,tifoid2,tifoid3,tifoid4,tifoid5;
    private TextView tvHasil;
    private Button Jawab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_bc6);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Jawab = (Button)findViewById(R.id.jawabab09);

        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zz17 = new Intent(Rul_bc6.this,Konsultasi.class);
                startActivity(zz17);
            }
        });
    }

    public void btnClickd122338899(View v) {
        int jmlh = 5 + 2;
        int gejala = 0 + 2;
        tifoid1 = (CheckBox) findViewById(R.id.kel13);
        tifoid2 = (CheckBox) findViewById(R.id.kel14);
        tifoid3 = (CheckBox) findViewById(R.id.kel15);
        tifoid4 = (CheckBox) findViewById(R.id.kel27);
        tifoid5 = (CheckBox) findViewById(R.id.kel28);
        tvHasil = (TextView) findViewById(R.id.hehe999801);

        if (tifoid1.isChecked())
            gejala++;
        if (tifoid2.isChecked())
            gejala++;
        if (tifoid3.isChecked())
            gejala++;
        if (tifoid4.isChecked())
            gejala++;
        if (tifoid5.isChecked())
            gejala++;


        float hasil = (float) gejala / jmlh;
        if (hasil >= 0.5) {
            tvHasil.setText("Dari gejala-gejala yang anda masukkan, Hasil kemungkinan anak anda menderita:\n1.Keluhan Psikologis Pada Trimester 2 \n\nPesan: \nPemeriksaan lebih lanjut ke dokter untuk penanganan lebih tepat");
        } else {
            tvHasil.setText("Sistem tidak dapat mengindentifikasi penyakit. Silahkan hubungi dokter untuk pemeriksaan lebih lanjut atau silahkan melakukan deteksi ulang");
        }
    }
}
