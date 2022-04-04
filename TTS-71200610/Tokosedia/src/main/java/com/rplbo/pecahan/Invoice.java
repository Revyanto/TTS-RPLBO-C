package com.rplbo.pecahan;

public class Invoice {
    private int jumlah;
    private long tagihan;
    private Produk produk;
    private Member member;

    public Invoice(){

    }

    public void printinvoice(){

    }

    public long getTagihan() {
        return tagihan;
    }

    public void buatInvoice(Produk produk,int jumlah, Member member){
        this.produk = produk;
        this.jumlah = jumlah;
        this.member = member;
    }
}
