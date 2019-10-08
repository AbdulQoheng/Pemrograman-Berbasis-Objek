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
public class Detail_VCD extends Filem_VCD{
    protected String aktor, sutra;
    protected int stok,i=1;
    protected String namaClass = "Detail_VCD";
    
    
    protected void setAktor(String aktor){
        this.aktor = aktor;
    }
    
    protected String getAktor() {
        return aktor;
    }
    
    protected void setSutra(String sutra){
        this.sutra = sutra;
    }
    
    protected String getSutra(){
        return sutra;
    }
    
    protected void setStok(int stok){
        this.stok = stok;
    }
    
    protected int getStok(){
        return stok;
    }
    
    protected void tampil(){
            super.tampil("Daftar filem ke : "+i+"\n");
            super.tampil("Judul : " + getJudul());
            super.tampil("Aktor : " + getAktor());
            super.tampil("Sutradara : " + getSutra());
            super.tampil("Publisher : " + getPublish());
            super.tampil("Kategori : " + getKategori());
            super.tampil("Stok : " + getStok());
            super.tampil("");
            ++i;
    }
    
    protected void hapus(){
        super.hapus();
        aktor = null;
        sutra = null;
        stok = 0;
        i = 0;
    }
    
    
}
