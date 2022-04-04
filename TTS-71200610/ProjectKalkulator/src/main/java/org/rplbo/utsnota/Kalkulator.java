package org.rplbo.utsnota;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(BilanganString bil1, BilanganString bil2, Operator op){
        this.bil1 = bil1.getBilangan();
        this.bil2 = bil2.getBilangan();
        this.op = op.getOperatorSimbol();
    }

    public void hitung(){

    }
}
