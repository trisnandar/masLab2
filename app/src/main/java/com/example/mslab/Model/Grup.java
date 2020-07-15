package com.example.mslab.Model;

import android.widget.ImageView;

public class Grup {
    int foto;
    String namaAs, idAs;

    public Grup(int foto, String namaAs, String idAs) {
        this.foto = foto;
        this.namaAs = namaAs;
        this.idAs = idAs;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNamaAs() {
        return namaAs;
    }

    public void setNamaAs(String namaAs) {
        this.namaAs = namaAs;
    }

    public String getIdAs() {
        return idAs;
    }

    public void setIdAs(String idAs) {
        this.idAs = idAs;
    }
}
