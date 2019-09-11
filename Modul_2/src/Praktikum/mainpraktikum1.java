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
        
//        Data pertama
      ob.setBenda("Bolpoint");
      ob.setStok(10);
      ob.setHarga_satuan(2000);
      ob.setHarga();
      ob.setTotal();
      ob.cetak();
      
//      Data kedua

      ob.setBenda("Pensil");
      ob.setStok(10);
      ob.setHarga_satuan(1000);
      ob.setHarga();
      ob.setTotal();
      ob.cetak();
      
//      Data ketiga
        
      ob.setBenda("Penghapus");
      ob.setStok(10);
      ob.setHarga_satuan(500);
      ob.setHarga();
      ob.setTotal();
      ob.cetak();
      
      ob.cetaktotal();
    }
    
}
