package com.developerputra.prihasi;

public class InfolearningModel {

    String namalearning, deskripsi, gambar;

    public InfolearningModel(String namalearning, String deskripsi, String gambar){
        this.namalearning = namalearning;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public  String getNamalearning()
    {
        return namalearning;
    }
    public  String getDeskripsi()
    {
        return deskripsi;
    }
    public String getGambar() {
        return gambar;
    }

}
