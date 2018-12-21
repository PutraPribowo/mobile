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

public class Rul_bc5 extends AppCompatActivity {
    private CheckBox tifoid1,Tifoid2;
    private TextView tvHasil;
    private Button Jawab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rul_bc5);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Jawab = (Button)findViewById(R.id.jawabab08);

        Jawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent zz16 = new Intent(Rul_bc5.this,Pen16.class);
                startActivity(zz16);
            }
        });
    }

    public void btnClickd1223388(View v) {
        int jmlh = 2 + 2;
        int gejala = 0 + 2;
        tifoid1 = (CheckBox) findViewById(R.id.kel26);
        Tifoid2 = (CheckBox) findViewById(R.id.kel5);
        tvHasil = (TextView) findViewById(R.id.hehe9998);

        if (tifoid1.isChecked())
            gejala++;
        if (Tifoid2.isChecked())
            gejala++;



        float hasil = (float) gejala / jmlh;
        if (hasil >= 0.5) {
            tvHasil.setText("Dari gejala-gejala yang anda masukkan, Hasil kemungkinan anak anda menderita:\n1.Insomnia \n\nPesan: \nPemeriksaan lebih lanjut ke dokter untuk penanganan lebih tepat");
        } else {
            tvHasil.setText("Sistem tidak dapat mengindentifikasi penyakit. Silahkan hubungi dokter untuk pemeriksaan lebih lanjut atau silahkan melakukan deteksi ulang");
        }
    }
}
