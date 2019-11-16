/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author qoheng
 */
public class Latihan_1 {

    private int bilangan[];
    private int rata;
    private int Max;
    private int Min;
    private String index[];

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }

    public int getRata() {
        return rata;
    }

    public void setRata(int a[]) {
        for (int i = 0; i < a.length; i++) {
            rata = +a[i];
        }

        rata = rata / a.length;
    }

    public int getMax() {
        return Max;
    }

    public void setMax(int a[]) {
        Max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (Max < a[i]) {
                Max = a[i];
            } else {
                Max = Max;
            }
        }
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int a[]) {
        Min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (Min > a[i]) {
                Min = a[i];
            } else {
                Min = Min;
            }
        }
    }

    public String[] getIndex() {
        return index;
    }

    public void setIndex(int a[], int b) {
        String data = "";
        int j = 0;
        index = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                data = a[i] + " Index ke " + i;
                index[j] = data;
                j++;
            }
        }
    }

    public void tampil(String str) {
        System.out.println(str);
        str = null;
    }

    public void tampil(int a) {
        System.out.println(a);
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
            if (a[i] != null) {
                System.out.println(a[i] + "");
            }
        }
    }
    
    public void hapus() {
        bilangan = null;
        rata = 0;
        index = null;
        Max = 0;
        Min = 0;
    }

}
