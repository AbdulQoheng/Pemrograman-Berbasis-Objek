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
public class MainLatihan_2 {
    public static void main(String[] args) {
        Latihan_2 ob = new Latihan_2();
        int bilangan [] = {2,5,3,5,9,5};
        
        ob.setBilangan(bilangan);
        ob.cetak("Bilangannya adalah = ");
        ob.cetakbilangan();
        ob.setCari(5, 1);
        ob.cetak("Bilagan yang sudah di ganti = ");
        ob.cetakbilangan();
        ob.setPerkalian(bilangan);
        ob.cetak("Bilangan yang sudah di kali 0,5 = ");
        ob.cetakbilangan();
        
    }
    
}
