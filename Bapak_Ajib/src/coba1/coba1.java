/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba1;

/**
 *
 * @author qoheng
 */
public class coba1 {

    private int bilangan[];
    private int penjumlahanderet[];
    private String index[];
    private String bilangan1[];

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }

    public int[] getPenjumlahanderet() {
        return penjumlahanderet;
    }

    public void setPenjumlahanderet(int a[], int perkalian) {
        penjumlahanderet = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            penjumlahanderet[i] = a[i] + perkalian;

        }
    }

    public String[] getIndex() {
        return index;
    }

    public void setIndex(int bil[]) {
        index = new String[bil.length];
        String data = "";
        for (int i = 0; i < bil.length; i++) {
            data = bil[i] + "  Terdapat pada inedex " + i;
            index[i] = data;
        }
    }

    public String[] getBilangan1() {
        return bilangan1;
    }

    public void setBilangan1(int a[]) {
        bilangan1 = new String[a.length];
        String data;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) {
                data = a[i] + " adalah bilangan ganjil ";
                bilangan1[i] = data;
            } else {
                data = a[i] + " adalah bilangan genap ";
                bilangan1[i] = data;
            }

        }
        data=null;
        a=null;
    }

    public void tampil(String str) {
        System.out.println(str);
    }

    public void tampil(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += " ," + a[i];
            }

        }
        System.out.println(data);

        a = null;
        data = null;
    }

    public void tampil(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void hapus() {
        bilangan = null;
        penjumlahanderet = null;
        index = null;
        bilangan1 = null;
    }

}
