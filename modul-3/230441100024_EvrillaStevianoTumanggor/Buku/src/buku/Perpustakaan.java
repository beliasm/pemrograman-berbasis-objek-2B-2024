/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

import java.util.ArrayList;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Buku> daftarBuku = new ArrayList<>();
            
            System.out.print("Masukkan jumlah buku yang akan ditambahkan: ");
            int jumlahBuku = scanner.nextInt();
            scanner.nextLine(); 
            
            if (jumlahBuku == 0) {
                System.out.println("Error: Jumlah buku tidak bisa 0. Tidak ada buku untuk ditambahkan.");
                return; 
            }
            
            for (int i = 0; i < jumlahBuku; i++) {
                System.out.println("Masukkan detail untuk Buku " + (i + 1) + "");
                System.out.print("Judul: ");
                String judul = scanner.nextLine();
                System.out.print("Penulis: ");
                String penulis = scanner.nextLine();
                System.out.print("Penerbit: ");
                String penerbit = scanner.nextLine();
                System.out.print("Kategori (SU/D/R/A): ");
                String kategori = scanner.nextLine();
                System.out.print("Stok: ");
                int stok = scanner.nextInt();
                System.out.print("Tahun Terbit: ");
                int tahunTerbit = scanner.nextInt();
                scanner.nextLine();
                
                Buku bukuBaru;

                if (kategori.equalsIgnoreCase("D")) {
                    bukuBaru = new BukuDewasa(judul, penulis, penerbit, kategori, stok, tahunTerbit);
                } else if (kategori.equalsIgnoreCase("A") || kategori.equalsIgnoreCase("R") || kategori.equalsIgnoreCase("SU")) {
                    bukuBaru = new BukuAnak(judul, penulis, penerbit, kategori, stok, tahunTerbit);
                } else {
                    System.out.println("Pilihan Kategori Tidak Valid");
                    return;
                }
                
                daftarBuku.add(bukuBaru);
            }
            
            System.out.println("\nDaftar Buku:");
            for (Buku buku : daftarBuku) {
                buku.tampilkanInfo();
                System.out.println(); 
            }
        }
    }
}
