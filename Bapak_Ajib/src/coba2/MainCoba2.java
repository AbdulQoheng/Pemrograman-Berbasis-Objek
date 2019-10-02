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
public class MainCoba2 {
    public static void main(String[] args) {
        coba2 ob = new coba2();
        
        int A[][]={{1,2,3,},{4,5,6}};
        
        ob.tampil("Bilangan");
        ob.tampil("");
        ob.setNilai(A);
        ob.tampil(ob.getNilai());
        ob.tampil("Nilai yang di tambahkan :");
        ob.tampil("");
        ob.setPenjumlahan(A, 3);
        ob.tampil(ob.getPenjumlahan());
        ob.tampil("Mencari index :");
        ob.tampil("");
        ob.setCariindex(A);
        ob.tampil(ob.getCariindex());
        ob.tampil("Mencari Ganjil Genap :");
        ob.tampil("");
        ob.setGanjilgenap(A);
        ob.tampil(ob.getGanjilgenap());
        ob.tampil("Mencari Perkalian");
        ob.setPerkalian(A);
        ob.tampil(ob.getPerkalian());
        ob.hapus();
        A = null;
    }
}
