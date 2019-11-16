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
public class Supplier extends JualBeli{
    protected void keterangan(){
        System.out.println("Supplier : ");
        System.out.println("Supplier "+getSupplier()+"Menjual "+getBarang());
        System.out.println("kepada Toko "+getToko()+" sebanyak "+getJumlah());
        System.out.println("dengan harga satuan "+getHarga_satuan()+".");
        System.out.println("Uang yang di terima Supplier adalah "+getHarga_total()+" dan stok "+getBarang()+" berkurang "+getJumlah());
    }
    
}
