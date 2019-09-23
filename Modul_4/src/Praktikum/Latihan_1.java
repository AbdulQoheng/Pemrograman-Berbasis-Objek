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
    private double matrixA[][];
    private double matrixB[][];
    private double penjumlahan[][];
    private double perkalihan[][];

    public double[][] getMatrixA() {
        return matrixA;
    }

    public void setMatrixA(double[][] matrixA) {        
        this.matrixA = matrixA;
    }

    public double[][] getMatrixB() {
        return matrixB;
    }

    public void setMatrixB(double[][] matrixB) {
        this.matrixB = matrixB;
    }

    public double[][] getPenjumlahan() {
        return penjumlahan;
    }

    public void setPenjumlahan(double A[][], double B[][]) {
        penjumlahan = A;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                penjumlahan[i][j]= A[i][j]+B[i][j];   
            }
        }
    }
    
    public double[][] getPerkalihan() {
        return perkalihan;
    }

    public void setPerkalihan(double matrix[][], double a) {
        perkalihan = matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                perkalihan[i][j]= a*matrix[i][j];   
            }
        }
    }
    
    public void tampil(String str){
        System.out.println(str);
    }
    
    public void tampil(double matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");   
        }
    }
    
    
    
    
    
}
