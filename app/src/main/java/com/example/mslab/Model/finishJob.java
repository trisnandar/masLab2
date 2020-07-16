package com.example.mslab.Model;

public class finishJob {
    String judul, deskripsi, progres;

    public finishJob(String judul, String deskripsi, String progres) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.progres = progres;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getProgres() {
        return progres;
    }

    public void setProgres(String progres) {
        this.progres = progres;
    }
}
