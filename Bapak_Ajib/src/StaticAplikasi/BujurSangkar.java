/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticAplikasi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public class BujurSangkar {
    private int sisi, luasBujurSangkar;
    
    protected BujurSangkar() throws IOException{
        Session.cekStatusLogin();
        tampil();
    }
    
    protected void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    protected int getSisi(){
        return sisi;
    }
    
    protected void setLuasBujurSangkar(){
        luasBujurSangkar = sisi * sisi;
    }
    
    protected int getLuasBujurSangkar(){
        return luasBujurSangkar;
    }
    
    protected void tampil() throws IOException{
        Session.pembatas();
        System.out.println("Hello ("+Session.getUsername()+") "+Session.getNama());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sisi;
        System.out.println("Menghitung Luas bujur Sangkar ");
        System.out.print("sisi = ");
        sisi = Integer.parseInt(br.readLine());
        setSisi(sisi);
        setLuasBujurSangkar();
        System.out.println("Luas Bujur Sangkar = "+getLuasBujurSangkar());
        
        new Menu();
        br = null;
    }
    
    
    
}
