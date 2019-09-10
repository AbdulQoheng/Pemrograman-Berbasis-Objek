/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan;

/**
 *
 * @author qoheng
 */
public class Main {
    public static void main(String[] args) {
        SpedaMotor motor = new SpedaMotor();
        motor.setMerk("Suzuki");
        System.out.println("Motor ini bermerk "+motor.getMerk());
        System.out.println("Motor ini berharga "+ 11000000);
    }
    
}
