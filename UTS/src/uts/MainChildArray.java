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
public class MainChildArray extends ArrayChild{
    
    public static void main(String[] args) {
        MainChildArray ob = new MainChildArray();
        int A[][]={{6,9,4,1,6},{4,5,7,8,9}};
        int B[]={1,4,5,0,9};
                
        ob.tampil("Matrix A");
        ob.setMatrixA(A);
        ob.tampil(ob.getMatrixA());
        ob.tampil("Matrix B");
        ob.setMatrixB(B);
        ob.tampil(ob.getMatrixB());
        ob.tampil("Cari index ");

//        Terdapat bug di program ini, dimana ketika array 
//        A pada baris ke 0 kolom 0 jika nilainya sama dengan salah
//        satu nilai dari array B, program akan eror

        ob.setMatrixC(A, B);
        ob.tampil(ob.getMatrixC());
       
        
    }
    
}
