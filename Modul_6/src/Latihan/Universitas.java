/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author qoheng
 */
public class Universitas {

    private static String kampus;

    protected Universitas(String kampus) {
        this.kampus = kampus;
    }

    protected Universitas() {
        kampus = null;
    }

    protected static String getKampus() {
        return kampus;
    }

    protected static void setKampus(String kampus) {
        Universitas.kampus = kampus;
    }

    protected void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    protected void hapus() {
        kampus = null;
    }

}
