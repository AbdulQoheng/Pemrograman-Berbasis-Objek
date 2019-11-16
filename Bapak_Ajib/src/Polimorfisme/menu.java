/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author qoheng
 */
public class menu {
    protected menu() throws IOException{
        session1.cekStatusLogin();
        tampil();
    }
    
    protected void tampil() throws IOException{
        session1.pembatas();
        System.out.println("Hello ("+session1.getUsername()+") "+session1.getNama());
        System.out.println("Pilih Salah satu : "
                + "\n1. Transaksi"
                + "\n2. Logout and Exit");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        System.out.print("Pilihan Anda : ");
        pilih = Integer.parseInt(br.readLine());
        switch (pilih){
            case 1: new MainJualBeli();break;
            case 2: session1.Logout();break;
            default: session1.pembatas();
                System.out.println("Masukkan pilihan menu dengan benar ");
                tampil();
                break;
        }
        br = null;
        
    }
    
}
