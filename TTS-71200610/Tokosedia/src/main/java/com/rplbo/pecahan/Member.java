package com.rplbo.pecahan;

public class Member {
    protected String alamat;
    protected String nama;
    protected Dompet dompet;

    public Member(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void cekSaldo(){

    }

    public void bayar(long bayar){

    }

    public String getNama() {
        return nama;
    }

    public void topUp(long money){

    }
}
