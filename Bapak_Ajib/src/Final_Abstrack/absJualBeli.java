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
public abstract class absJualBeli {
    protected String toko, supplier, barang;
    protected int jumlah;
    protected long harga_satuan, harga_total;

    protected abstract String getToko();

    protected abstract void setToko(String toko);

    protected abstract String getSupplier();

    protected abstract void setSupplier(String supplier);

    protected abstract String getBarang();

    protected abstract void setBarang(String barang);

    protected abstract int getJumlah();

    protected abstract void setJumlah(int jumlah);

    protected abstract long getHarga_satuan();

    protected abstract void setHarga_satuan(long harga_satuan);

    protected abstract long getHarga_total();

    protected abstract void setHarga_total();
    
    protected abstract void keterangan();
    
    private void status(){
        
        System.out.println("Class Parent");
    }
}
