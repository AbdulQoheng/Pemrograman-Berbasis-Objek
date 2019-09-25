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
public class MainLatihan {

    public static void main(String[] args) {

        Latihan ob = new Latihan();

        int A[][] = {{1, 2}, {3, 5}, {6, 7}};
        int B[][] = {{8, 9}, {10, 11}, {12, 13}};

        ob.tampil("Matrix A :");
        ob.setMatrikA(A);
        ob.tampil(ob.getMatrikA());
        ob.tampil("");
        ob.tampil("Matrix B");
        ob.setMatrikB(B);
        ob.tampil(ob.getMatrikB());
        ob.tampil("");
        ob.tampil("Matrix C");
        ob.setPenjumlahan(A, B);
        ob.tampil(ob.getPenjumlahan());
        ob.tampil("");
        ob.setPerkalian(ob.getPenjumlahan(), 0.5);
        ob.tampil(ob.getPerkalian());
        ob.hapus();
        A = null;
        B = null;

    }
}
