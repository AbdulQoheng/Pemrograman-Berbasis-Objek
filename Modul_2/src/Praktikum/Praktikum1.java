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
    private int stokbolpoint, hargasatuanbolpoint, hargabolpoint;
    private int stokpensil, hargasatuanpensil, hargapensil;
    private int stokpenghapus, hargasatuanpenghapus, hargapenghapus;
    
    public void cetak(String str){
        System.out.println(str);
    }
    
    public void Bolpoint(){
        System.out.println("Nama Alat Tulis : Bolpoint");
    }
    
    public void setStokBolpoint(int stok){
        this.stokbolpoint = stok;
    }
    
    public int getStokBolpoint(){
        return stokbolpoint;
    }
    
    public void setHargasatuanBolpoint(int satuan){
        this.hargasatuanbolpoint = satuan;
    }
    
    public int getHargasatuanBolpoint(){
        return hargasatuanbolpoint;
    }
    
    public int hargaBolpoint(){
        int totalhargabolpoint = stokbolpoint * hargasatuanbolpoint;
        this.hargabolpoint = totalhargabolpoint;
        return totalhargabolpoint;
    }
    
    public void Pensil(){
        System.out.println("Nama Alat Tulis : Pensil");
    }
    
    public void setStokpensil(int stok){
        this.stokpensil = stok;
    }
    
    public int getStokpensil(){
        return stokpensil;
    }
    
    public void setHargasatuanpensil(int satuan){
        this.hargasatuanpensil = satuan;
    }
    
    public int getHargasatuanpensil(){
        return hargasatuanpensil;
    }
    
    public int hargapensil(){
        int totalhargapensil = stokpensil * hargasatuanpensil;
        this.hargapensil = totalhargapensil;
        return totalhargapensil;
    }
    
    public void Penghapus(){
        System.out.println("Nama Alat Tulis : Penghapus");
    }
    
    public void setStokPenghapus(int stok){
        this.stokpenghapus = stok;
    }
    
    public int getStokPenghapus(){
        return stokpenghapus;
    }
    
    public void setHargasatuanPenghapus(int satuan){
        this.hargasatuanpenghapus = satuan;
    }
    
    public int getHargasatuanPenghapus(){
        return hargasatuanpenghapus;
    }
    
    public int hargaPenghapus(){
        int totalhargapenghapus = stokpenghapus * hargasatuanpenghapus;
        this.hargapenghapus = totalhargapenghapus;
        return totalhargapenghapus;
    }
    
    public int total(){
        int total = hargabolpoint + hargapensil + hargapenghapus;
        return total;
    }
            
    
    
}
