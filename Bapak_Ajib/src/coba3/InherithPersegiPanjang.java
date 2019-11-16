/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba3;

/**
 *
 * @author qoheng
 */
public class InherithPersegiPanjang extends InherithanceBidangDatar{
    private int panjang, lebar, luas;

    protected int getPanjang() {
        return panjang;
    }

    protected void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    protected int getLebar() {
        return lebar;
    }

    protected void setLebar(int lebar) {
        this.lebar = lebar;
       
    }
    
    protected int getLuas() {
        return luas;
    }

    protected void setLuas() {
        luas = panjang * lebar;
    }
    
    protected void keterangan(){
        System.out.println("Ini adalah class Child");
    }
//    
//    protected void keterangan_parent(){
//        super.keterangan();
//    }
    
}
