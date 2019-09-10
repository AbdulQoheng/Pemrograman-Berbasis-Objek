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
public class mainpraktikum1 {
    public static void main(String[] args) {
        Praktikum1 ob = new Praktikum1();
        
        ob.Bolpoint();
        ob.setStokBolpoint(10);
        ob.setHargasatuanBolpoint(2000);
        ob.cetak("Stok : "+ob.getStokBolpoint());
        ob.cetak("Harga Satuan : "+ob.getHargasatuanBolpoint());
        ob.cetak("Harga Bolpoint : "+ ob.hargaBolpoint());
        
        ob.cetak("");
        
        ob.Pensil();
        ob.setStokpensil(10);
        ob.setHargasatuanpensil(1000);
        ob.cetak("Stok : "+ob.getStokpensil());
        ob.cetak("Harga Satuan : "+ob.getHargasatuanpensil());
        ob.cetak("Harga Pensil : "+ ob.hargapensil());
        
        ob.cetak("");
        
        ob.Penghapus();
        ob.setStokPenghapus(10);
        ob.setHargasatuanPenghapus(500);
        ob.cetak("Stok : "+ob.getStokPenghapus());
        ob.cetak("Harga Satuan : "+ob.getHargasatuanPenghapus());
        ob.cetak("Harga Penghapus : "+ ob.hargaPenghapus());
    
        ob.cetak("");
        
        ob.cetak("Harga Total : "+ob.total());
        
    }
    
}
