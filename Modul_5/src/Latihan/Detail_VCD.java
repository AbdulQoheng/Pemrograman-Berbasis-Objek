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
public class Detail_VCD extends Filem_VCD {

    private int jml;

    protected void inputdata() {
        ++jml;
        boolean perulangan = true;
        
        while (perulangan) {

            setJudul(JOptionPane.showInputDialog("Masukkan judul ke " + jml));
            setAktor(JOptionPane.showInputDialog("Masukkan aktor"));
            setSutra(JOptionPane.showInputDialog("Masukkan sutradara"));
            setPublish(JOptionPane.showInputDialog("Masukkan publisher"));
            setKategori(JOptionPane.showInputDialog("Masukkan kategori\n"
                    + "1. SU = Semua Umur\n"
                    + "2. D  = Dewasa\n"
                    + "3. R  = Remaja\n"
                    + "4. A  = Anak - anak\n"));
            setStok(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah stok")));
            tampil();

            String pilihan = JOptionPane.showInputDialog("Apakah Anda Ingin Melanjutkan? \n1. ya\n2. tidak");
            if (pilihan.equals("tidak")) {
                perulangan=false;
            }

        }
    }

    protected void tampil() {
        super.tampil("========== Filem ke : " + jml + " ==========");
        super.tampil("Judul : " + getJudul());
        super.tampil("Aktor : " + getAktor());
        super.tampil("Sutradara : " + getSutra());
        super.tampil("Publisher : " + getPublish());
        super.tampil("Kategori : " + getKategori());
        super.tampil("Stok : " + getStok());
        super.tampil("");
    }

    protected void hapus() {
        super.hapus();
        jml = 0;

    }

}
