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
public class Data {

    private String datamhs[][];
    private String ljk[];
    private String nilaimhs[][];
    private String nilaiakhir[][];

    public String[][] getNilaimhs() {
        return nilaimhs;
    }

    public void setNilaimhs(String[][] datamhs, String ljk[]) {
        nilaimhs = new String[datamhs.length][datamhs[0].length];
        int i = 0;
        for (int j = 0; j < datamhs.length; j++) {
            nilaimhs[j][0] = datamhs[j][0];
            for (int k = 1; k < datamhs[j].length; k++) {
                if (datamhs[j][k].equals(ljk[i])) {
                    nilaimhs[j][k] = "3";
                    ++i;
                } else if (datamhs[j][k].equals(" ")) {
                    nilaimhs[j][k] = "0";
                    ++i;
                } else {
                    nilaimhs[j][k] = "-1";
                    ++i;
                }

            }
            i = 0;
        }
    }

    public String[][] getNilaiakhir() {
        return nilaiakhir;
    }

    public void setNilaiakhir(String koreksi[][], String datamhs[][]) {
        nilaiakhir = new String[datamhs.length][3];
        int a = 1;
        int point = 0;
        double nilai_akhir = 0;
        
        for (int i = 0; i < datamhs.length; i++) {
            nilaiakhir[i][0] = datamhs[i][0];
            for (int j = 1; j < datamhs[i].length; j++) {
                if (koreksi[i][j].equals("3")) {
                    point += 3;
                } else if (koreksi[i][j].equals("0")) {
                    point += 0;
                } else {
                    point -= 1;
                }
            }
            nilaiakhir[i][a] = String.valueOf(point);
            a++;
            nilai_akhir = (double) (point * 100) / ((datamhs[0].length - 1) * 3);
            String akhir = String.valueOf(nilai_akhir);
            nilaiakhir[i][a] = akhir;
            a = 1;
            point = 0;

        }
    }

    protected Data(String datamhs[][], String ljk[]) {
        this.datamhs = datamhs;
        this.ljk = ljk;
    }

    protected Data() {

    }

    public String[][] getDatamhs() {
        return datamhs;
    }

    public void setDatamhs(String[][] datamhs) {
        this.datamhs = datamhs;
    }

    public String[] getLjk() {
        return ljk;
    }

    public void setLjk(String[] ljk) {
        this.ljk = ljk;
    }

}
