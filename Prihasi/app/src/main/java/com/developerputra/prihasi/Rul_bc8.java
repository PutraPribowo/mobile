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

public class Rul_bc8 extends AppCompatActivity {
    private CheckBox tifoid1;
    private TextView tvHasil;
    private Button Jawab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_bc8);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);


        Jawab = (Button)findViewById(R.id.jawabab011);

        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zz19 = new Intent(Rul_bc8.this,Konsultasi.class);
                startActivity(zz19);
            }
        });
    }

    public void btnClickdp1233(View v) {
        int jmlh = 1 + 2;
        int gejala = 0 + 2;
        tifoid1 = (CheckBox) findViewById(R.id.kel30);
        tvHasil = (TextView) findViewById(R.id.hoo12);

        if (tifoid1.isChecked())
            gejala++;



        float hasil = (float) gejala / jmlh;
        if (hasil >= 0.5) {
            tvHasil.setText("Dari gejala-gejala yang anda masukkan, Hasil kemungkinan anak anda menderita:\n1.Kaki Bengkak (Edema) \n\nPesan: \nPemeriksaan lebih lanjut ke dokter untuk penanganan lebih tepat");
        } else {
            tvHasil.setText("Sistem tidak dapat mengindentifikasi penyakit. Silahkan hubungi dokter untuk pemeriksaan lebih lanjut atau silahkan melakukan deteksi ulang");
        }
    }
}
