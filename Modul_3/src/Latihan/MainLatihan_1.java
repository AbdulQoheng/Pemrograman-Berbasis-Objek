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
public class MainLatihan_1 {
    public static void main(String[] args) {
        Latihan_1 ob = new Latihan_1();
        
        int A[]={-5,-3,-6,-3,-4};
        
        ob.tampil("Bilangan :");
        ob.setBilangan(A);
        ob.tampil(ob.getBilangan());
        ob.tampil("Nilai Max : ");
        ob.setMax(A);
        ob.tampil(ob.getMax());
        ob.tampil("Nilai Min : ");
        ob.setMin(A);
        ob.tampil(ob.getMin());
        ob.tampil("Index yang di cari");
        ob.setIndex(A, -3);
        ob.tampil(ob.getIndex());
    }
    
}
