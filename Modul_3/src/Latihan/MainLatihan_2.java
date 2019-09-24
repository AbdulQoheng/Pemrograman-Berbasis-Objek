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
public class MainLatihan_2 {
    public static void main(String[] args) {
        Latihan_2 ob = new Latihan_2();
        
        double A[]={2,5,3,5,9,5};
        
        ob.tampil("nilai awal :");
        ob.setBilangan(A);
        ob.tampil(ob.getBilangan());
        ob.tampil("Nilai yang sudah di rubah :");
        ob.setUbahnilai(A, 5, 1);
        ob.tampil(ob.getUbahniali());
        ob.tampil("Nilai yang telah di kalikan");
        ob.setPerkalian(ob.getUbahniali(), 0.5);
        ob.tampil(ob.getPerkalian());
    }
    
}
