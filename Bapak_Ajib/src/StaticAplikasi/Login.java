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
public class Login {
    protected Login() throws IOException{
        tampil();
    }
    
    protected void tampil() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String username, password;
    
        System.out.print("Username Anda : ");
        username = br.readLine();
        System.out.print("Password Anda : ");
        password = br.readLine();
        
        Session.setStatusLogin(username, password);
        
        if (Session.getStatusLogin().equals("aktif")){
            new Menu();
        }else{
            Session.pembatas();
            System.out.println("Masukkan username dan passord Anda ");
            tampil();
        }
        
        username = null;
        password = null;
        br = null;
    }
    
}
