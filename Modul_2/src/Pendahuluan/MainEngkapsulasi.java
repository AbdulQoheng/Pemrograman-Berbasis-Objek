/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

/**
 *
 * @author qoheng
 */
public class MainEngkapsulasi {
    public static void main(String[] args) {
        Enkapsulasi ob = new Enkapsulasi();
        ob.setAlas(5);
        ob.setTinggi(7);
        System.out.println("Alas Segitiga : "+ ob.getAlas());
        System.out.println("Tinggi Segitiga : "+ ob.getTinggi());
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("Luas Segitiga : "+ob.getLuasSegitiga());
    }
    
}
