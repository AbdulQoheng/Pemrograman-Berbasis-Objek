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
public class Enkapsulasi {
    private int alas, tinggi;
    private double luasSegitiga;
    
    public void setAlas(int alas){
        this.alas = alas;
    }
    public int getAlas(){
        return alas;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public void setLuasSegitiga(int alas, int tinggi){
        luasSegitiga = 0.5 * (double)(alas * tinggi);
    }
    
    public double getLuasSegitiga(){
        return luasSegitiga;
    }
    
}
