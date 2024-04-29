/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author asus
 */
public class OperasiBilanganAbsCetak {
    private void cetakSemuaOperasiBilanganAbs(OperasiBilanganAbs operasi, double a, double b) {
        operasi.setA(a);
        operasi.setB(b);
        operasi.setC();
        operasi.tampil();
    }
    
    public static void main(String[] args) {
        double A = 9.25;
        double B = 1.25; 
        
        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        
        cetak.cetakSemuaOperasiBilanganAbs(new OperasiPenjumlahan(), A, B);
        cetak.cetakSemuaOperasiBilanganAbs(new OperasiPengurangan(), A, B);
        cetak.cetakSemuaOperasiBilanganAbs(new OperasiPerkalian(), A, B);
        cetak.cetakSemuaOperasiBilanganAbs(new OperasiPembagian(), A, B);
    }
}

