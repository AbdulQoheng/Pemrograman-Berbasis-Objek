/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author qoheng
 */
public class Mahasiswa extends Universitas {

    private int jml;
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    protected Mahasiswa(String kampus) {
        super(kampus);
    }

    protected Mahasiswa() {
        ++jml;
        nim = null;
        nama = null;
        alamat = null;
        jurusan = null;
    }

    protected String getNim() {
        return nim;
    }

    protected void setNim(String nim) {
        this.nim = nim;
        nim = null;
    }

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
        nama = null;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
        alamat = null;
    }

    protected String getJurusan() {
        return jurusan;
    }

    protected void setJurusan(String jurusan) {
        int pilihan = Integer.parseInt(jurusan);
        if (pilihan == 61) {
            this.jurusan = "MATEMATIKA";
        } else if (pilihan == 62) {
            this.jurusan = "BIOLOGI";
        } else if (pilihan == 63) {
            this.jurusan = "KIMIA";
        } else if (pilihan == 64) {
            this.jurusan = "FISIKA";
        } else if (pilihan == 65) {
            this.jurusan = "TEKNIK INFORMATIKA";
        } else if (pilihan == 66) {
            this.jurusan = "TEKNIK ARSITEKTUR";
        }
        jurusan = null;
    }

    protected void inputdata() {
        setKampus(JOptionPane.showInputDialog("Masukkan Nama Kampus"));
        while (true) {
            setNim(JOptionPane.showInputDialog("Masukkan NIM"));
            setNama(JOptionPane.showInputDialog("Masukkan Nama")); 
            setAlamat(JOptionPane.showInputDialog("Masukkan Alamat"));
            setJurusan(JOptionPane.showInputDialog("Masukkan Jurusan\n"
                    + "1. 61 = MATEMATIKA\n"
                    + "2. 62 = BIOLOGI\n"
                    + "3. 63 = KIMIA\n"
                    + "4. 64 = FISIKA\n"
                    + "5. 65 = TEKNIK INFORMATIKA\n"
                    + "6. 66 = TEKNIK ARSITEKTUR\n"));

            tampil();

            String lanjut = JOptionPane.showInputDialog("Apakah Anda Ingin Melanjutkan? \n1. ya\n2. tidak");
            if (lanjut.equals("tidak")) {
                break;
            }
            ++jml;
        }
    }

    protected void tampil() {
        super.tampil("========== Mahasiswa ke : " + jml + " ==========");
        super.tampil("Kampus  : " + getKampus());
        super.tampil("NIM     : " + getNim());
        super.tampil("Nama    : " + getNama());
        super.tampil("Alamat  : " + getAlamat());
        super.tampil("Jurusan : " + getJurusan());
        super.tampil("");
    }

    protected void hapus() {
        super.hapus();
        nim = null;
        nama = null;
        alamat = null;
        jurusan = null;
        jml = 0;

    }

}
