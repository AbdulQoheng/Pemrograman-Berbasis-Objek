/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba3;

/**
 *
 * @author qoheng
 */
public class MainInherithancePersegiPanjang extends InherithPersegiPanjang{
    public static void main(String[] args) {
        MainInherithancePersegiPanjang ob = new MainInherithancePersegiPanjang();
        
        ob.setLebar(2);
        ob.cetak("Lebar adalah : "+ob.getLebar());
        ob.setPanjang(5);
        ob.cetak("Panjang adalah : "+ob.getPanjang());
        ob.setLuas();
        ob.cetak("Luas Bangun : "+ob.getLuas());
        ob.keterangan();
//        ob.keterangan_parent();
        ob = null;
    }
    
}
