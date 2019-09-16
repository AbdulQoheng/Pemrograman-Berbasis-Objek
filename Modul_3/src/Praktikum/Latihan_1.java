/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author qoheng
 */
public class Latihan_1 {

    private int bilangan[] = new int[5];
    private int cari[] = new int[5];
    private double ratarata;
    private int Max;
    private int Min;

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }

    public double getRatarata() {
        return ratarata;
    }

    public void setRatarata(int[] bilangan) {
        int i;
        for (i = 0; i < bilangan.length; i++) {
            ratarata += bilangan[i];
        }
        ratarata = (ratarata / 5);
        this.ratarata = ratarata;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int[] bilangan) {
        int i;
        Max = bilangan[0];
        for (i = 0; i < bilangan.length; i++) {
            if (Max < bilangan[i]) {
                Max = bilangan[i];
            }
        }
        this.Max = Max;
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int[] bilangan) {
        int i;
        Min = bilangan[0];
        for (i = 0; i < bilangan.length; i++) {
            if (Min > bilangan[i]) {
                Min = bilangan[i];
            }
        }
        this.Min = Min;
    }

    public int[] getCari() {
        return cari;
    }

    public void setCari(int cari) {
        int i;
        for (i = 0; i < bilangan.length; i++) {
            if (bilangan[i] == cari) {
                this.cari[i] = i;

            }
        }

    }

    public void cetakbilangan(int[] bilangan) {
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println("");
    }

    public void cetak(String str) {
        System.out.println(str);
    }

    public void cetakindex(int[] cari) {
        for (int i = 0; i < cari.length; i++) {
            if (cari[i] != 0) {
                System.out.print(cari[i]);
                System.out.print(" ");
            }
        }
    }

}
