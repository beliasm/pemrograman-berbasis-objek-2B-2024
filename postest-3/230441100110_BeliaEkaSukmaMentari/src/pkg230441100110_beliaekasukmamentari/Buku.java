/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100110_beliaekasukmamentari;

/**
 *
 * @author asus
 */
public class Buku extends Media implements Denda{
    private double harga;

    public Buku(String judul, int tahunTerbit, double harga) {
        super(judul, tahunTerbit);
        this.harga = harga;
    }
    
    @Override
    public double hitungDenda(int hariTerlambat){
        double tarifDendaPerHari = 1000.0;
        return hariTerlambat * tarifDendaPerHari;
    }
    
    public double hitungDenda(int hariTerlambat, double tarifDendaPerHari, double penaltiTetap){
        return hariTerlambat * tarifDendaPerHari * penaltiTetap;
    }
    
    @Override
    public String getInfo() {
        return "Judul: " + judul + ", Tahun Terbit: " + tahunTerbit + ", Harga: Rp" + harga;
    }
}
