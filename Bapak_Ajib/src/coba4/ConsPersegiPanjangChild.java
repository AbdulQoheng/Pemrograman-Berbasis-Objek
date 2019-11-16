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
public class ConsPersegiPanjangChild extends ConsPersegiPanjangParent{
    private int lebar, luas;
    protected ConsPersegiPanjangChild(int panjang, int lebar){
        super(panjang);
        this.lebar = lebar;    
        setLuas();
    }

    protected int getLebar() {
        return lebar;
    }

    protected int getLuas() {
        return luas;
    }
    
    protected void setLuas(){
        luas = getPanjang() * getLebar();
    }
    
}
