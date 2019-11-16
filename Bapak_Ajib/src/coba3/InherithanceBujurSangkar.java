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
public class InherithanceBujurSangkar extends InherithanceBidangDatar{
    private int sisi, luas;
    
    protected void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    protected int getSisi(){
        return sisi;
    }
    
    protected void setLuas(){
        luas = sisi * sisi;
    }
    
    protected int getLuas(){
        return luas;
    }
    
    protected void keterangan(){
        System.out.println("Ini adalah Child class");
    }
    
    protected void keterangan_parent(){
        super.keterangan();
    }
    
}
