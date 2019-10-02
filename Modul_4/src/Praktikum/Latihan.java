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
public class Latihan {
    private int MatrikA[][];
    private int MatrikB[][];
    private int penjumlahan[][];
    private int pengurangan[][];
    private double perkalian[][];

    public int[][] getMatrikA() {
        return MatrikA;
    }

    public void setMatrikA(int[][] MatrikA) {
        this.MatrikA = MatrikA;
    }

    public int[][] getMatrikB() {
        return MatrikB;
    }

    public void setMatrikB(int[][] MatrikB) {
        this.MatrikB = MatrikB;
    }

    public int[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(int a[][], int b[][]) {
        penjumlahan=a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                penjumlahan[i][j] = a[i][j] + b[i][j];
            }
        }
    }
    
    public int[][] getPengurangan() {
        return pengurangan;
    }

    public void setPengurangan(int a[][], int b[][]) {
        pengurangan=a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                pengurangan[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    public double[][] getPerkalian() {
        return perkalian;
    }

    public void setPerkalian(int a[][], double b) {
        perkalian=new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               perkalian[i][j]=(double)a[i][j]*b;
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
    
    public void tampil(double A[][]){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    public void hapus(){
        MatrikA = null;
        MatrikB = null;
        perkalian = null;
        penjumlahan = null;
                
    }
}
