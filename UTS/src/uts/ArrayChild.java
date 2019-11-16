/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author qoheng
 */
public class ArrayChild extends Array{

    protected void tampil(String a) {
        System.out.println(a);
    }

    protected void tampil(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    protected void tampil(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "  ");
        }
    }
    
    protected void tampil(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
            System.out.println();
        }
        
    }

}
