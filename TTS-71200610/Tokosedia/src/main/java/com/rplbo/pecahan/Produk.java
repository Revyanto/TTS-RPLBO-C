package com.rplbo.pecahan;

public class Produk {
    private String namaProduk;
    private long harga;

    public Produk(String nama, long harga){
        this.namaProduk = nama;
        this.harga = harga;
    }

    public long getHarga() {
        return harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }
}
