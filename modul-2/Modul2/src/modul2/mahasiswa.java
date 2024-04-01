/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author
 */
public class mahasiswa extends Universitas {
    
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        switch (jurusan) {
            case "41":
                this.jurusan = "TEKNIK INFORMATIKA";
                break;
            case "42":
                this.jurusan = "TEKNIK INDUSTRI";
                break;
            case "43":
                this.jurusan = "TEKNIK ELEKTRO";
                break;
            case "44":
                this.jurusan = "SISTEM INFORMASI";
                break;
            case "48":
                this.jurusan = "TEKNIK MESIN";
                break;
            case "49":
                this.jurusan = "TEKNIK MEKATRONIKA";
                break;
        }
    }

     public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan setter untuk jurusan
    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        switch (jurusan) {
            case "41":
                this.jurusan = "TEKNIK INFORMATIKA";
                break;
            case "42":
                this.jurusan = "TEKNIK INDUSTRI";
                break;
            case "43":
                this.jurusan = "TEKNIK ELEKTRO";
                break;
            case "44":
                this.jurusan = "SISTEM INFORMASI";
                break;
            case "48":
                this.jurusan = "TEKNIK MESIN";
                break;
            case "49":
                this.jurusan = "TEKNIK MEKATRONIKA";
                break;
        }
    }
}