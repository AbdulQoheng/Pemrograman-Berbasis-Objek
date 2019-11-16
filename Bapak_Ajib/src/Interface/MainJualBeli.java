/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author qoheng
 */
public class MainJualBeli {
    
    public final void cetak(AbsJualBeli ob[], String toko, String supplier, String barang, int jumlah, long harga_satuan){
        for (int i = 0; i < ob.length; i++) {
            ob[i].setToko(toko);
            ob[i].setSupplier(supplier);
            ob[i].setBarang(barang);
            ob[i].setJumlah(jumlah);
            ob[i].setHarga_satuan(harga_satuan);
            ob[i].setHarga_total();
            ob[i].keterangan();
        }
        
        toko = null;
        supplier = null;
        barang = null;
        jumlah = 0;
        harga_satuan = 0;
        ob = null;
        
        
    }
    
    public static void main(String[] args) {
        String toko, supplier, barang;
        int jumlah;
        long harga_satuan;
        String merkMobilSupplier, warnaMobilSupplier, merkMotorSupplier, warnaMotorSupplier;
        String merkMobilToko, warnaMobilToko, merkMotorToko, warnaMotorToko;
    
        toko = "Barokah";
        supplier = "PT. Jaya Makmur";
        barang = "Buku Tulis";
        jumlah = 100;
        harga_satuan = 2500;
        
        merkMobilSupplier = "Kijang";
        warnaMobilSupplier = "Abu - abu";
        merkMotorSupplier = "Honda";
        warnaMotorSupplier = "Merah";
        
        merkMobilToko = "Inova";
        warnaMobilToko = "Putih";
        merkMotorToko = "Yamaha";
        warnaMotorToko = "Hitam";
                
        
        AbsJualBeli ob[] = {
            new Supplier(merkMobilSupplier,warnaMobilToko, merkMotorToko, warnaMotorToko),
            new Toko(merkMobilToko, warnaMobilToko, merkMotorToko, warnaMotorToko)
        };
        
        MainJualBeli aa = new MainJualBeli();
        
        aa.cetak(ob, toko, supplier, barang, jumlah, harga_satuan);
        
    }
    
}
