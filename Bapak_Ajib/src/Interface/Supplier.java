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
public class Supplier extends AbsJualBeli implements Mobil, Motor{
    
    private String merkMobil, warnaMobil, merkMotor, warnaMotor;
    
    public Supplier(){
        
    }
    
    public Supplier(String merkMobil, String warnaMobil, String merkMotor, String warnaMotor){
        setMerkMobil(merkMobil);
        setWarnaMobil(warnaMobil);
        setMerkMotor(merkMotor);
        setWarnaMotor(warnaMotor);
        
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public void setMerkMobil(String merkMobil) {
        this.merkMobil = merkMobil;
    }

    public String getWarnaMobil() {
        return warnaMobil;
    }

    public void setWarnaMobil(String warnaMobil) {
        this.warnaMobil = warnaMobil;
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }

    public String getWarnaMotor() {
        return warnaMotor;
    }

    public void setWarnaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
    }

    public String getToko() {
        return toko;
    }

    public void setToko(String toko) {
        this.toko = toko;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public long getHarga_satuan() {
        return harga_satuan;
    }

    public void setHarga_satuan(long harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public long getHarga_total() {
        return harga_total;
    }

    public void setHarga_total() {
        this.harga_total = harga_satuan*jumlah;
    }
    
    public void keterangan(){
        System.out.println("=====================================================================");
        System.out.println("Supplier : ");
        System.out.println("Supplier "+getSupplier()+" menjual "+getBarang());
        System.out.println("kepada toko "+getToko()+" sebanyak "+getJumlah());
        System.out.println("dengan harga satauan "+getHarga_satuan()+".");
        System.out.println("Uang yang di terima Supplier adalah "+getHarga_total()+".");
        System.out.println("stok "+getBarang()+" berkuang "+getJumlah());
        System.out.println("Dalam menjalankan usahanya, ");
        System.out.println("Supplier memiliki Mobil dengan merk "+getMerkMobil()+", warna "+getWarnaMobil());
        System.out.println("dan memiliki Motor dengan merk "+getMerkMotor()+", warna "+getWarnaMotor());
        System.out.println("=====================================================================");
    
    }
    
    
    
    
    
}
