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
public class StatikMain extends Statik{
    public static void main(String[] args) {
        StatikMain ob1 = new StatikMain();
        ob1.setA("Data A");
        ob1.setB("Data B");
        
        ob1.cetak("ob1 Instant Variable : "+ob1.getA());
        ob1.cetak("ob1 Static Variable : "+ob1.getB());
        ob1.cetak("=====================================");
        
        StatikMain ob2 = new StatikMain();
        ob2.cetak("ob1 Instant Variable : "+ob2.getA());
        
        ob2.cetak("ob1 Static Variable : "+ob2.getB());
        ob1.cetak("ob1 Static Variable : "+Statik.getB());
        ob1.cetak("=====================================");
                
    }
}
