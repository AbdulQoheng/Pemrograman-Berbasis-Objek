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
public class Filem_VCD {
    private String judul, publish, kategori;
    protected String namaClass="vcd";
    
    protected void setJudul (String judul){
        this.judul = judul;
    }
    
    protected String getJudul() {
        return judul;
    }
    
    protected void setPublish (String publish) {
        this.publish = publish;
    }
    
    protected String getPublish() {
        return publish;
    }
    
    protected void setKategori(String kategori){
        this.kategori = kategori;
    }
    
    protected String getKategori() {
        return kategori;
    }
    
    protected void tampil(String a){
        System.out.println(a);
    }
    
    protected void tampil(int a){
        System.out.println(a);
    }
    
    protected void hapus(){
        judul = null;
        publish = null;
        kategori = null;
    }
}
