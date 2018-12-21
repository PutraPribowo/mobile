package com.developerputra.prihasi;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toolbar;

public class Menu extends AppCompatActivity {
    private FrameLayout konsultasi, pencarian, tipsmelahirkan1, tipsmerawatbayi,tipsmerawatkandungan, elearning, pengembang, bantuan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);

        konsultasi = (FrameLayout)findViewById(R.id.Konsultasi);
        pencarian = (FrameLayout)findViewById(R.id.penyakitIbu);
        tipsmelahirkan1 = (FrameLayout)findViewById(R.id.TipsMelahirkan);
        tipsmerawatbayi= (FrameLayout)findViewById(R.id.Merawat1);
        tipsmerawatkandungan = (FrameLayout)findViewById(R.id.MerawatKandungan);
        elearning =(FrameLayout)findViewById(R.id.penyakit);
        pengembang = (FrameLayout)findViewById(R.id.profile);
        bantuan =(FrameLayout)findViewById(R.id.bantuan);

        konsultasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dev = new Intent(Menu.this,Konsultasi.class);
                startActivity(dev);
            }
        });


        pencarian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pencarian1 = new Intent(Menu.this,PencarianPenyakit.class);
                startActivity(pencarian1);
            }
        });

        tipsmelahirkan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ban = new Intent(Menu.this,TipsMelahirkan.class);
                startActivity(ban);
            }
        });

        tipsmerawatbayi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent maping = new Intent(Menu.this,TipsMerawatBayi.class);
                startActivity(maping);
            }
        });

        tipsmerawatkandungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent konaa = new Intent(Menu.this,TipsMerawatKandungan.class);
                startActivity(konaa);
            }
        });

        elearning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dataa = new Intent(Menu.this,Elearning.class);
                startActivity(dataa);
            }
        });

        pengembang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pengembang = new Intent(Menu.this,Pengembang.class);
                startActivity(pengembang);
            }
        });

        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bantuan1 = new Intent(Menu.this,Bantuan.class);
                startActivity(bantuan1);
            }
        });

    }
    @Override
    public void onBackPressed() {
        //biar kalau di pencet keluar muncul dialog alert keluar
        //yang ini onBackpressed ini bukan untuk button di layout tapi yang di hp kita
        showAlertDialog();
    }
    private void showAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Tutup Aplikasi ini ?")
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}

