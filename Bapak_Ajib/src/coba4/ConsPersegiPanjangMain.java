/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba4;

/**
 *
 * @author qoheng
 */
public class ConsPersegiPanjangMain {
    public static void main(String[] args) {
        int panjang = 6, lebar = 2;
        ConsPersegiPanjang ob = new ConsPersegiPanjang(panjang, lebar);
        
        ob.cetak("Panjang : "+ob.getPanjang());
        ob.cetak("Lebar : "+ob.getLebar());
        ob.cetak("Luas : "+ob.getLuas());
    }
    
}
