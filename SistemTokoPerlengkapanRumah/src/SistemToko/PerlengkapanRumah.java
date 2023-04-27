
// package
package SistemToko;

// library
import java.util.ArrayList;

// public Abstract Class
public abstract class PerlengkapanRumah {
    protected String nama, ukuran, stok,bahan;      // protected
    public int hargaBeli;                           // public
    protected long noKode;                          // protected
    String kode = "PR";
    
    // pendeklarasian Perlengkapan Rumah
    PerlengkapanRumah(String nama, String ukuran, String stok, String bahan, int hargaBeli, long noKode){
        this.nama = nama;
        this.ukuran = ukuran;
        this.stok = stok;
        this.bahan = bahan;
        this.hargaBeli = hargaBeli;
        this.noKode = noKode;
    }
    
    PerlengkapanRumah() {
        // untuk mengatasi error pada main menu
    }
    
    public String getNama() {
        return nama;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getStok() {
        return stok;
    }

    public String getBahan() {
        return bahan;
    }

    public int getHargaBeli() {
        return hargaBeli;
    }
    
    public long getNoKode() {
        return noKode;
    }
    
    // penamaan public Abstract Void
    public abstract void tambahProduk();
    public abstract void tampilProduk();
    public abstract ArrayList<PerlengkapanRumah> ubahProduk(ArrayList<PerlengkapanRumah> PRList);
    public abstract ArrayList<PerlengkapanRumah> hapusProduk(ArrayList<PerlengkapanRumah> PRlist);
}