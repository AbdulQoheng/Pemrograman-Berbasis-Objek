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
public class Filem_VCD {

    private String judul, publish, kategori, aktor, sutra;
    private int stok;

    protected void setJudul(String judul) {
        this.judul = judul;
    }

    protected String getJudul() {
        return judul;
    }

    protected void setPublish(String publish) {
        this.publish = publish;
    }

    protected String getPublish() {
        return publish;
    }

    protected void setKategori(String kategori) {
        if (kategori.equals("SU")) {
            setKategori("Semua Umur");
        } else if (kategori.equals("D")) {
            setKategori("Dewasa");
        } else if (kategori.equals("R")) {
            setKategori("Remaja");
        } else if (kategori.equals("A")) {
            setKategori("Anak - anak");
        }
    }

    protected String getKategori() {
        return kategori;
    }

    protected void setAktor(String aktor) {
        this.aktor = aktor;
    }

    protected String getAktor() {
        return aktor;
    }

    protected void setSutra(String sutra) {
        this.sutra = sutra;
    }

    protected String getSutra() {
        return sutra;
    }

    protected void setStok(int stok) {
        this.stok = stok;
    }

    protected int getStok() {
        return stok;
    }

    protected void tampil(String a) {
        System.out.println(a);
    }

    protected void hapus() {
        judul = null;
        publish = null;
        kategori = null;
    }
}
