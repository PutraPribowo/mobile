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

public class Rul_cd4 extends AppCompatActivity {
    private CheckBox tifoid1,tifoid2;
    private TextView tvHasil;
    private Button Jawab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_cd4);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Jawab = (Button)findViewById(R.id.jawabab014);

        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teos0147bddxxfk = new Intent(Rul_cd4.this, Konsultasi.class);
                startActivity(teos0147bddxxfk);
            }
        });
    }

    public void btnClickd10912(View v) {
        int jmlh = 2 + 2;
        int gejala = 0 + 2;
        tifoid1 = (CheckBox) findViewById(R.id.kel43);
        tifoid2 = (CheckBox) findViewById(R.id.kel66);
        tvHasil = (TextView) findViewById(R.id.hehe0912);

        if (tifoid1.isChecked())
            gejala++;
        if (tifoid2.isChecked())
            gejala++;



        float hasil = (float) gejala / jmlh;
        if (hasil >= 0.5) {
            tvHasil.setText("Dari gejala-gejala yang anda masukkan, Hasil kemungkinan anak anda menderita:\n1.Sikatrik \n\nPesan: \nPemeriksaan lebih lanjut ke dokter untuk penanganan lebih tepat");
        } else {
            tvHasil.setText("Sistem tidak dapat mengindentifikasi penyakit. Silahkan hubungi dokter untuk pemeriksaan lebih lanjut atau silahkan melakukan deteksi ulang");
        }
    }
}
