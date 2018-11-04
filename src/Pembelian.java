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
    
    
    
}
