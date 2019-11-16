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
public class ConsPersegiPanjangParent {
    private int panjang;
    
    protected ConsPersegiPanjangParent(int panjang){
        this.panjang = panjang;
    }

    protected int getPanjang() {
        return panjang;
    }

    protected void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    protected void tampil(String data){
        System.out.println(data);
        data = null;
    }
    
}
