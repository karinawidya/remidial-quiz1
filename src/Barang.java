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
   
   
   
    
}
