/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba2;

/**
 *
 * @author qoheng
 */
public class coba2 {
    private int[][] nilai;
    private int[][] penjumlahan;
    private double[][] perkalian;
    private String[][] cariindex;
    private String[][] ganjilgenap;
    

    public int[][] getNilai() {
        return nilai;
    }

    public void setNilai(int[][] nilai) {
        this.nilai = nilai;
        nilai=null;
    }

    public int[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(int a[][], int nilai) {
        penjumlahan = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                penjumlahan[i][j] = a[i][j] + nilai;
            }
            
        }
    }
    
    public int[][] getPerkalian() {
        return perkalian;
    }

    public void setPerkalian(int a[][], double nilai) {
        perkalian = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                perkalian[i][j] = a[i][j] * nilai;
            }
            
        }
    }
    

    public String[][] getCariindex() {
        return cariindex;
    }

    public void setCariindex(int a[][]) {
        cariindex=new String[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                cariindex[i][j]="Angka "+Integer.toString(a[i][j])+"Terdapat pada baris "+i+" dan kolom ke "+j;
                
            }
        }
    }

    public String[][] getGanjilgenap() {
        return ganjilgenap;
    }

    public void setGanjilgenap(int a[][]) {
        ganjilgenap=new String[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]%2 == 1){
                    ganjilgenap[i][j]="Angka "+Integer.toString(a[i][j])+" bilangan ganjil";
                }else{
                    ganjilgenap[i][j]="Angka "+Integer.toString(a[i][j])+" bilangan genap";
                }
                
            }
            
        }
    }
    
    public void tampil(String str){
        System.out.println(str);
    }
    
    public void tampil(int A[][]){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void tampil(String A[][]){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void hapus() {
        nilai = 0;
        penjumlahan = 0;
        cariindex = null;
        ganjilgenap = null;
        
    }
}
