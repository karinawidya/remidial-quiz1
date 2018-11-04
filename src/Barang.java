/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Barang {
   private String kode;
   private String namaBarang;
   private int harga;
   private float diskon;
   private int jumlah;
   private float hargaTotal;

   public Barang() {
   }

   public Barang(String kode, String namaBarang, int harga, float diskon, int jumlah) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.diskon = diskon;
        this.jumlah = jumlah;
   }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public float getHargaTotal() {
        return hargaTotal;
    }

    public void setHargaTotal(float hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
   
   
   
   
    
}
