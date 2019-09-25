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
public class MainCoba1 {
    public static void main(String[] args) {
        coba1 ob = new coba1();
        
        int A[]={1,2,3,4,5};
        
        ob.tampil("Data bilangan");
        ob.setBilangan(A);
        ob.tampil(ob.getBilangan());
        ob.tampil("Data yang telah di jumlahkan");
        ob.setPenjumlahanderet(A,5);
        ob.tampil(ob.getPenjumlahanderet());
        ob.setIndex(A);
        ob.tampil(ob.getIndex());
        ob.tampil("Mencari nilai Ganjil Genap");
        ob.setBilangan1(A);
        ob.tampil(ob.getBilangan1());
        ob.hapus();
        A = null;
        
        
    }
}
