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
public class Menu {
    protected Menu() throws IOException{
        Session.cekStatusLogin();
        tampil();
    }
    
    protected void tampil() throws IOException{
        Session.pembatas();
        System.out.println("Hello ("+Session.getUsername()+") "+Session.getNama());
        System.out.println("Pilih Salah satu : "
                + "\n1. Menghitung Luas Bujur Sangkar"
                + "\n2. Logout and Exit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        System.out.print("Pilihan Anda : ");
        pilih = Integer.parseInt(br.readLine());
        switch (pilih){
            case 1: new BujurSangkar();
            case 2: Session.Logout();
            default: Session.pembatas();
                System.out.println("Masukkan pilihan menu dengan benar ");
                tampil();
        }
        br = null;
        
    }
    
    
}
