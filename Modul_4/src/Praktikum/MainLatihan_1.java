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
public class MainLatihan_1 {

    public static void main(String[] args) {
        Latihan_1 ob = new Latihan_1();
        
        double A[][] = {{1, 2}, {3, 5}, {6, 7}};
        double B[][] = {{8, 9}, {10, 11}, {12, 13}};
        
        ob.setMatrixA(A);
        ob.setMatrixB(B);
        ob.tampil("Matrix A");
        ob.tampil(A);
        ob.tampil("");
        ob.tampil("Matrix B");
        ob.tampil(B);
        ob.tampil("");
        ob.tampil("Matrix C");
        ob.setPenjumlahan(A, B);
        ob.tampil(ob.getPenjumlahan());
        ob.tampil("");
        ob.tampil("Hasil Perkalihan");
        ob.setPerkalihan(ob.getPenjumlahan(), 0.5);
        ob.tampil(ob.getPerkalihan());
        
    }
    
}
