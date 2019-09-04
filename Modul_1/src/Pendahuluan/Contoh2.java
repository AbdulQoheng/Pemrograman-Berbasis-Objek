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
public class Contoh2 {
    static void cetak (int a){
        System.out.println("Nilai x: "+a);
        
    }
    public static void main(String[] args) {
        int x;
        for (x=0; x<3; x++){
            cetak(x);
        }
        System.out.println("Nilai x terakhir: "+x);
    }
}
