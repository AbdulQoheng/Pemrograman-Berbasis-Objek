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
public class Overloading {
    public void Tampil(){
        System.out.println("I Love Java");
    }
    
    public void Tampil(int i){
        System.out.println("Method dengan 1 parameter = "+i);
    }
    
    public void Tampil(int i, int j){
        System.out.println("Method dengan 2 parameter = "+i+" & "+j);
    }
    
    public void Tampil(String str){
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        Overloading objek = new Overloading();
        objek.Tampil();
        objek.Tampil(8);
        objek.Tampil(6, 7);
        objek.Tampil("Hello World");
    }
    
}
