/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author qoheng
 */
public class Toko extends JualBeli{
    protected void keterangan(){
        System.out.println("Toko : ");
        System.out.println("Toko "+getToko()+"Membeli "+getBarang());
        System.out.println("kepada Supplier "+getSupplier()+" sebanyak "+getJumlah());
        System.out.println("dengan harga satuan "+getHarga_satuan()+".");
        System.out.println("Uang Toko berkurang adalah "+getHarga_total()+" dan stok "+getBarang()+" bertambah "+getJumlah());
    }
    
}
