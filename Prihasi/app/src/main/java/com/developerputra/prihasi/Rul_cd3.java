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

public class Rul_cd3 extends AppCompatActivity {
    private CheckBox tifoid1,tifoid2,tifoid3;
    private TextView tvHasil;
    private Button Jawab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_cd3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Jawab = (Button)findViewById(R.id.jawabab003);

        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teos0124 = new Intent(Rul_cd3.this, Konsultasi.class);
                startActivity(teos0124);
            }
        });
    }

    public void btnClickd10912345(View v) {
        int jmlh = 3 + 2;
        int gejala = 0 + 2;
        tifoid1 = (CheckBox) findViewById(R.id.kel45K);
        tifoid2 = (CheckBox) findViewById(R.id.kel46K);
        tifoid3 = (CheckBox) findViewById(R.id.kel47K);
        tvHasil = (TextView) findViewById(R.id.hehe0912345);

        if (tifoid1.isChecked())
            gejala++;
        if (tifoid2.isChecked())
            gejala++;
        if (tifoid3.isChecked())
            gejala++;


        float hasil = (float) gejala / jmlh;
        if (hasil >= 0.5) {
            tvHasil.setText("Dari gejala-gejala yang anda masukkan, Hasil kemungkinan anak anda menderita:\n1.Preeklampsia \n\nPesan: \nPemeriksaan lebih lanjut ke dokter untuk penanganan lebih tepat");
        } else {
            tvHasil.setText("Sistem tidak dapat mengindentifikasi penyakit. Silahkan hubungi dokter untuk pemeriksaan lebih lanjut atau silahkan melakukan deteksi ulang");
        }
    }
}
