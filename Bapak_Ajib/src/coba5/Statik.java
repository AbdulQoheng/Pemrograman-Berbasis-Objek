/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba5;

/**
 *
 * @author qoheng
 */
public class Statik {
    private String a;
    private static String b;

    protected String getA() {
        return a;
    }

    protected void setA(String a) {
        this.a = a;
    }

    protected static String getB() {
        return b;
    }

    protected static void setB(String b) {
        Statik.b = b;
    }
    
    protected void cetak(String a){
        System.out.println(a);
    }
    
    
}
