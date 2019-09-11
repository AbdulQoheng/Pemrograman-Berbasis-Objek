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
public class Praktikum1 {
    private String benda;
    private int Stok, Harga_satuan, Harga, Total;

    public String getBenda() {
        return benda;
    }

    public void setBenda(String benda) {
        this.benda = benda;
    }

    public int getStok() {
        return Stok;
    }

    public void setStok(int Stok) {
        this.Stok = Stok;
    }

    public int getHarga_satuan() {
        return Harga_satuan;
    }

    public void setHarga_satuan(int Harga_satuan) {
        this.Harga_satuan = Harga_satuan;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga() {
        this.Harga = Stok * Harga_satuan;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal() {
        this.Total += Harga;
    }
    
    public void cetak(){
        System.out.println("Nama Alat Tulis     : "+getBenda());
        System.out.println("Stok                : "+getStok());
        System.out.println("Harga Satuan        : "+getHarga_satuan());
        System.out.println("Harga  "+getBenda()+"    : "+getHarga());
        System.out.println("");
        System.out.println("");
    }
    
    public void cetaktotal(){
        System.out.println("Total Harga     : "+getTotal());
    }
    
    
            
    
    
}
