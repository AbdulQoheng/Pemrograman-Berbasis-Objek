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
public class Latihan_2 {
    
    private int bilangan[] = new int[6];
    private int cari;
    private int perkalian;

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }

    public int getCari() {
        return cari;
    }

    public void setCari(int cari, int nilai) {
        for (int i = 0; i < bilangan.length; i++) {
            if (bilangan[i]==cari){
                bilangan[i]=nilai;
            }
        }
        this.cari = cari;
    }
    
    public int getPerkalian(){
        return perkalian;
    }
    
    public void setPerkalian(int bilangan[]){
        for (int i = 0; i < bilangan.length; i++) {
            bilangan [i] = (int)(bilangan[i] * 0.5 );
        }
        this.perkalian = perkalian;
    }
    
    public void cetakbilangan() {
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println("");
    }

    public void cetak(String str) {
        System.out.println(str);
    }
    
}
