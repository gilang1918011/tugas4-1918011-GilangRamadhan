package com.example.pertemuan4;

class item {
    private String namaclub,devisi,namapemainbintang;
    private int logo;

    public item(String namaclub, String devisi, String namapemainbintang, int logo) {
        this.namaclub = namaclub;
        this.devisi = devisi;
        this.namapemainbintang = namapemainbintang;
        this.logo = logo;
    }

    public String getNamaclub() {
        return namaclub;
    }

    public void setNamaclub(String namaclub) {
        this.namaclub = namaclub;
    }

    public String getDevisi() {
        return devisi;
    }

    public void setDevisi(String pemilik) {
        this.devisi = devisi;
    }

    public String getNamapemainbintang() {
        return namapemainbintang;
    }

    public void setNamapemainbintang(String asal) {
        this.namapemainbintang = namapemainbintang;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
