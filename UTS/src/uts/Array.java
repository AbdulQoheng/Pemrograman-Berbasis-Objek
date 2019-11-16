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
public class Array {

    private int MatrixA[][];
    private int MatrixB[];
    private String MatrixC[];

    public int[][] getMatrixA() {
        return MatrixA;
    }

    public void setMatrixA(int[][] MatrixA) {
        this.MatrixA = MatrixA;
    }

    public int[] getMatrixB() {
        return MatrixB;
    }

    public void setMatrixB(int[] MatrixB) {
        this.MatrixB = MatrixB;
    }

    public String[] getMatrixC() {
        return MatrixC;
    }

    public void setMatrixC(int a[][], int b[]) {
        MatrixC = new String[b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[j].length; k++) {
                    String tidak = "Angka " + String.valueOf(b[i]) + " Tidak di temukan";
                    if ( b[i] == a[j][k]) {
                        if (MatrixC[i].equals(tidak)) {
                            MatrixC[i] = "Angka " + String.valueOf(b[i]) + " baris ke " + j + " kolom ke " + k + "  ";
                        } else if (MatrixC[i] == null) {
                            MatrixC[i] = "Angka " + String.valueOf(b[i]) + " baris ke " + j + " kolom ke " + k + "  ";
                        } else {
                            MatrixC[i] += "Angka " + String.valueOf(b[i]) + " baris ke " + j + " kolom ke " + k + "  ";
                        }
                    } else if(a[j][k] != b[i] && MatrixC[i] == null) {
                        MatrixC[i] = "Angka " + String.valueOf(b[i]) + " Tidak di temukan";
                    } 
                }

            }

        }
    }

}
