package com.developerputra.prihasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Rul_ab1 extends AppCompatActivity {
    private CheckBox tifoid1, tifoid2, tifoid3, tifoid4;
    private Button Jawab;
    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_ab1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        Jawab = (Button) findViewById(R.id.jawabab12);


        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent po1 = new Intent(Rul_ab1.this,Konsultasi.class);
                startActivity(po1);
            }
        });
    }

    public void btnClickd1(View v) {
        int jmlh = 4 + 2;
        int gejala = 0 + 2;
        tifoid1 = (CheckBox) findViewById(R.id.kel5);
        tifoid2 = (CheckBox) findViewById(R.id.kel6);
        tifoid3 = (CheckBox) findViewById(R.id.kel7);
        tifoid4 = (CheckBox) findViewById(R.id.kel4k1);
        tvHasil = (TextView) findViewById(R.id.hehe);

        if (tifoid1.isChecked())
            gejala++;
        if (tifoid2.isChecked())
            gejala++;
        if (tifoid3.isChecked())
            gejala++;
        if (tifoid4.isChecked())
            gejala++;


        float hasil = (float) gejala / jmlh;
        if (hasil >= 0.5) {
            tvHasil.setText("Dari gejala-gejala yang anda masukkan, Hasil kemungkinan anak anda menderita:\n1.Pusing Biasa \n2.Mudah Lelah \n\nPesan: \nPemeriksaan lebih lanjut ke dokter untuk penanganan lebih tepat");
        } else {
            tvHasil.setText("Sistem tidak dapat mengindentifikasi penyakit. Silahkan hubungi dokter untuk pemeriksaan lebih lanjut atau silahkan melakukan deteksi ulang");
        }
    }
}
