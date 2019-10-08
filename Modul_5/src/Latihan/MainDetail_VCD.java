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
public class MainDetail_VCD extends Detail_VCD {

    public static void main(String[] args) {

        MainDetail_VCD a = new MainDetail_VCD();
        int loop = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah judul yang akan di masukkan !"));

        for (int i = 1; i <= loop; i++) {
            a.setJudul(JOptionPane.showInputDialog("Masukkan judul ke " + i));
            a.setAktor(JOptionPane.showInputDialog("Masukkan aktor"));
            a.setSutra(JOptionPane.showInputDialog("Masukkan sutradara"));
            a.setPublish(JOptionPane.showInputDialog("Masukkan publisher"));
            a.setKategori(JOptionPane.showInputDialog("Masukkan kategori\n"
                    + "1. SU = Semua Umur\n"
                    + "2. D  = Dewasa\n"
                    + "3. R  = Remaja\n"
                    + "4. A  = Anak - anak\n"));
            a.setStok(Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah stok")));
            a.tampil();
        }
        
        a.hapus();
        loop = 0;
       
    }
}
