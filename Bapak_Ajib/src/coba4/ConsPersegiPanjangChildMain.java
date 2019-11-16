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
public class ConsPersegiPanjangChildMain extends ConsPersegiPanjangChild{
    
    public ConsPersegiPanjangChildMain(int panjang, int lebar) {
        super(panjang, lebar);
    }
        
    public static void main(String[] args) {
        int panjang = 7, lebar = 5;
        ConsPersegiPanjangChildMain ob = new ConsPersegiPanjangChildMain(panjang, lebar);
        
        ob.tampil("Panjang : "+ob.getPanjang());
        ob.tampil("Lebar : "+ob.getLebar());
        ob.tampil("Luas "+ob.getLuas());
        
    }

}
