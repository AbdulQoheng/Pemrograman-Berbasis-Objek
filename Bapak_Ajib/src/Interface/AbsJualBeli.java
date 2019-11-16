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
public abstract class AbsJualBeli implements Mobil,Motor{
  
    protected String toko, supplier, barang;
    protected int jumlah;
    protected long harga_satuan, harga_total;

    public abstract String getToko();

    public abstract void setToko(String toko); 

    public abstract String getSupplier();

    public abstract void setSupplier(String supplier);

    public abstract String getBarang();

    public abstract void setBarang(String barang);

    public abstract int getJumlah();

    public abstract void setJumlah(int jumlah);

    public abstract long getHarga_satuan();

    public abstract void setHarga_satuan(long harga_satuan);

    public abstract long getHarga_total();

    public abstract void setHarga_total();
    
    public abstract void keterangan();

    public void status(){
        System.out.println("Class Parent");
    }
    
    
    
    
}
