/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Abstrack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public final class MainJualBeli {
    
    protected final void tampil(absJualBeli ob[], String toko, String supplier, String barang, int jumlah, long harga_satuan) {
        for (int i = 0; i < ob.length; i++) {
            ob[i].setToko(toko);
            ob[i].setSupplier(supplier);
            ob[i].setBarang(barang);
            ob[i].setJumlah(jumlah);
            ob[i].setHarga_satuan(harga_satuan);
            ob[i].setHarga_total();
            ob[i].keterangan();
            System.out.println("=====================================================================");

        }
        toko = null;
        supplier = null;
        barang = null;
        jumlah = 0;
        harga_satuan = 0;
        ob = null;
    }
    
    protected void input() throws IOException {
        String toko, supplier, barang;
        int jumlah;
        long harga_satuan;
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nama Toko : ");
        toko = input.readLine();
        System.out.print("Masukkan Nama Supplier : ");
        supplier = input.readLine();
        System.out.print("Masukkan Nama Barang : ");
        barang = input.readLine();
        System.out.print("Masukkan Jumlah Barang : ");
        jumlah = Integer.parseInt(input.readLine());
        System.out.print("Masukkan Harga Satuan Barang : ");
        harga_satuan = Long.parseLong(input.readLine());

        absJualBeli[] ob = {new Supplier(), new Toko()};
        
        System.out.println("=====================================================================");
        tampil(ob, toko, supplier, barang, jumlah, harga_satuan);

    }
    
    public static void main(String[] args) throws IOException {
        MainJualBeli ob = new MainJualBeli();       
        ob.input();
    }
    
}
