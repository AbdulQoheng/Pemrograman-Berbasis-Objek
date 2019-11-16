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
public class MainInherithanceBujurSangkar extends InherithanceBujurSangkar{
    public static void main(String[] args) {
        MainInherithanceBujurSangkar ob = new MainInherithanceBujurSangkar();
        
        ob.setSisi(2);
        ob.cetak("sisi adalah : "+ob.getSisi());
        ob.setLuas();
        ob.cetak("Luas Bangun : "+ob.getLuas());
        ob.keterangan();
        ob.keterangan_parent();
        ob = null;
    }
    
}
