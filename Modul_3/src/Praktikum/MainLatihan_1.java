/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author qoheng
 */
public class MainLatihan_1 {
    public static void main(String[] args) {
        Latihan_1 ob = new Latihan_1();
        
        int bilangan[] = {-5,-3,-6,-3,-4};
        ob.setBilangan(bilangan);
        ob.cetak("Bilangan = ");
        ob.cetakbilangan(ob.getBilangan());
        ob.setMax(bilangan);
        ob.cetak("Nilai Max = "+ob.getMax());
        ob.setMin(bilangan);
        ob.cetak("Nilai Min = "+ob.getMin());
        ob.setRatarata(bilangan);
        ob.cetak("Nilai Rata-Rata = "+ob.getRatarata());
        ob.setCari(-3);
        ob.cetak("Nilai -3 di Index = ");
        ob.cetakindex(ob.getCari());
<<<<<<< HEAD
        ob.cetak("");

                
=======
        ob.cetak("");    
        
        
>>>>>>> 53b8c8da6775f90c1b2c3c58fb3bd0a3b1b48dfc
    }
    
}
