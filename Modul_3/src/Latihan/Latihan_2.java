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
public class Latihan_2 {
    private int bilangan[];
    private int ubahnilai[];
    private double perkalian[];

    public int[] getBilangan() {
        return bilangan;
    }

    public void setBilangan(int[] bilangan) {
        this.bilangan = bilangan;
    }


    public int[] getUbahniali() {
        return ubahnilai;
    }

    public void setUbahnilai(int a[], int cari, int ubah) {
        ubahnilai=a;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == cari) {
                ubahnilai[i] = ubah;
            }
        }
    }

    public double[] getPerkalian() {
        return perkalian;
    }

    public void setPerkalian(int a[], double nilai) {
        perkalian=new double[a.length];
        for (int i = 0; i < a.length; i++) {
            perkalian[i] = (double)a[i] * nilai;
            
        }
    }
    
    

    public void tampil(String str) {
        System.out.println(str);
        str = null;
    }

    public void tampil(double a) {
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
    
    public void tampil(double a[]) {
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
        ubahnilai = null;
        perkalian = null;
        
    }
}
