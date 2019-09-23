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
    private double MatrikA[][];
    private double MatrikB[][];
    private double penjumlahan[][];
    private double perkalian[][];

    public double[][] getMatrikA() {
        return MatrikA;
    }

    public void setMatrikA(double[][] MatrikA) {
        this.MatrikA = MatrikA;
    }

    public double[][] getMatrikB() {
        return MatrikB;
    }

    public void setMatrikB(double[][] MatrikB) {
        this.MatrikB = MatrikB;
    }

    public double[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(double a[][], double b[][]) {
        penjumlahan=a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                penjumlahan[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public double[][] getPerkalian() {
        return perkalian;
    }

    public void setPerkalian(double a[][], double b) {
        perkalian=a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               perkalian[i][j]=b*a[i][j];
            }
        }
    }
    
    public void tampil(String str){
        System.out.println(str);
    }
    
    public void tampil(double A[][]){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
