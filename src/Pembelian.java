/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karina
 */
public class Pembelian {
    private String kodePembelian;
    private Barang barang;
    private Pelanggan pelanggan;
    private float hargaTotal;

    public Pembelian(String kodePembelian, Barang barang, Pelanggan pelanggan) {
        this.kodePembelian = kodePembelian;
        this.barang = barang;
        this.pelanggan = pelanggan;
    }

    public String getKodePembelian() {
        return kodePembelian;
    }

    public void setKodePembelian(String kodePembelian) {
        this.kodePembelian = kodePembelian;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public float getHargaTotal() {
        return hargaTotal;
    }
    
    public void cetak(){
        System.out.println("Kode Transaksi  : "+barang.getKode());
        System.out.println("Nama Pelanggan  : "+pelanggan.getNama());
        System.out.println("ID Barang       : "+pelanggan.getId());
        System.out.println("Nama Barang     : "+barang.getNamaBarang());
        System.out.println("Harga Barang    : "+barang.getHarga());
        System.out.println("Jumlah          : "+barang.getJumlah());
        System.out.println("Harga Tptal     : "+barang.getHargaTotal());
    }
    
}
