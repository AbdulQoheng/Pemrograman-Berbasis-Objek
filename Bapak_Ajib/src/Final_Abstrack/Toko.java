/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Abstrack;

/**
 *
 * @author qoheng
 */
public class Toko extends absJualBeli{
    
    @Override
    protected String getToko() {
        return toko;
    }

    @Override
    protected void setToko(String toko) {
        this.toko = toko;
    }

    @Override 
    protected String getSupplier() {
        return supplier;
    }

    @Override
    protected void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    protected String getBarang() {
        return barang;
    }

    @Override
    protected void setBarang(String barang) {
        this.barang = barang;
    }

    @Override
    protected int getJumlah() {
        return jumlah;
    }

    @Override
    protected void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    protected long getHarga_satuan() {
        return harga_satuan;
    }

    @Override
    protected void setHarga_satuan(long harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    @Override
    protected long getHarga_total() {
        return harga_total;
    }

    @Override
    protected void setHarga_total() {
        this.harga_total = harga_satuan * jumlah;
    }

    @Override
    protected void keterangan() {
        System.out.println("Toko : ");
        System.out.println("Toko "+getToko()+"Membeli "+getBarang());
        System.out.println("kepada Supplier "+getSupplier()+" sebanyak "+getJumlah());
        System.out.println("dengan harga satuan "+getHarga_satuan()+".");
        System.out.println("Uang Toko berkurang adalah "+getHarga_total()+" dan stok "+getBarang()+" bertambah "+getJumlah());
    
    }
    
}
