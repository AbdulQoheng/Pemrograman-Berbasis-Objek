/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticAplikasi;

/**
 *
 * @author qoheng
 */
public class Session {
    private static String username, nama, statuslogin;
    
    public static void setUsername(String username){
        Session.username = username;
    }
    
    public static String getUsername(){
        return username;
    }
    
    public static void setNama(String Nama){
        Session.nama = Nama;
    }
    
    public static String getNama(){
        return nama;
    }
    
    public static void setStatusLogin(String username, String password){
        if(username.equals("admin")&& password.equals("pass")){
            statuslogin = "aktif";
            setUsername(username);
            setNama("Qoheng");
        }
        username = null;
        password = null;
    }
    
    public static String getStatusLogin(){
        return statuslogin;
    }
    
    public static void cekStatusLogin(){
        if (Session.getStatusLogin() != "aktif"){
            System.exit(0);
        }
    }
    
    public static void pembatas(){
        System.out.println("==============================================");
    }
    
    public static void Logout(){
        username = null;
        nama = null;
        statuslogin = null;
        System.out.println("Anda Berhasil Logout");
        System.exit(0);
    }
    
}
