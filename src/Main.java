/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karina
 */
public class Main {
    public static void main(String[] args) {
        Pelanggan p = new Pelanggan("Karina", "A15");
        Barang br = new Barang("D08", "Alicia Scarf", 125000, 0.5f, 3);
        Pembelian pl = new Pembelian("kode", br, p);
        pl.cetak();
        
    }
}
