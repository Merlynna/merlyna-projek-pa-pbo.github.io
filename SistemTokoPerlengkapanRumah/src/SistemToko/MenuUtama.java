
// package
package SistemToko;
import java.util.ArrayList;
import java.util.Scanner;

//publicclass
public class MenuUtama {
    // pilihan dan admin
    static String option, admin;
    // input Scanner
    static Scanner input = new Scanner(System.in);
    // penamaan Furniture
    static Furniture F = new Furniture();
    // ArrayList Perlengkapan Rumah
    static ArrayList<PerlengkapanRumah> FList;
    // penamaan Peralatan Masak
    static PerlengkapanMasak PM = new PerlengkapanMasak();
    // ArrayList Perlengkapan Rumah bareng Perlengkapan Masak
    static ArrayList<PerlengkapanRumah> PMList;

    // panggil menu (Boolean getAdmin)
    public static void menu (boolean getAdmin) {
        Boolean ulang, ulang2;
        System.out.println(" ");
        System.out.println("Selamat! Proses Login telah Berhasil! Silahkan Lanjut ke Tahap Berikutnya! Terima Kasih!");
        System.out.println(" ");
        System.out.println("=======================================");
        System.out.println("            Selamat Datang!            ");
        System.out.println("=======================================");
        System.out.println(" ");
        System.out.println(" ");
        ulang = getAdmin;
        while (ulang) {
            menuAwal();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                    // penamaan Furniture
                    Furniture();
                    switch (admin){
                        case "1":
                            F.tambahProduk();
                            break;
                        case "2":
                            F.tampilProduk();
                            break;
                        case "3":
                            F.ubahProduk(FList);
                            break;
                        case "4":
                            F.hapusProduk(FList);
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("Anda telah Keluar dari Program!");
                            System.exit(0);
                        default:
                            System.err.println("Sorry! Pilihan Tidak Tersedia!");
                            break;
                    }
                }
                break;
                case "2":
                ulang2 = true;
                while(ulang2){
                    // penamaan peralatan masak
                    PeralatanMasak();
                    switch (admin){
                        case "1":
                            PM.tambahProduk();
                            break;
                        case "2":
                            PM.tampilProduk();
                            break;
                        case "3":
                            PM.ubahProduk(PMList);
                            break;
                        case "4":
                            PM.hapusProduk(PMList);
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("Pilihan Tidak Tersedia!");
                            break;
                    }
                }
                break;
                case "3":
                    System.err.println("Anda telah Keluar dari Program!");
                    System.exit(0);
   
                default:
                System.err.println("Pilihan Tidak Tersedia!");
                break;
            }
        } 
    }

    // public Furniture
    public static String Furniture (){
        System.out.println(" ");
        System.out.println("=======================================");
        System.out.println("            Menu Furniture             ");
        System.out.println("=======================================");
        System.out.println(" ");
        System.out.println("Pilih Menu: ");
        System.out.println(" ");
        System.out.println("1. Tambah Produk Furniture");
        System.out.println("2. Tampilkan Produk Furniture");
        System.out.println("3. Edit Produk Furniture");
        System.out.println("4. Hapus Produk Furniture");
        System.out.println("5. Kembali ke Menu Awal");
        System.out.println("6. Exit Program");
        System.out.println(" ");
        System.out.println("Pilihan Menu : ");
        admin = input.nextLine();
        return admin;
    }

    // public Peralatan Masak
    public static String PeralatanMasak (){
        System.out.println(" ");
        System.out.println("=======================================");
        System.out.println("           Menu Peralatan Masak        ");
        System.out.println("=======================================");
        System.out.println(" ");
        System.out.println("Pilih Menu: ");
        System.out.println(" ");
        System.out.println("1. Tambah Produk Peralatan Masak");
        System.out.println("2. Tampilkan Produk Peralatan Masak");
        System.out.println("3. Edit Produk Peralatan Masak");
        System.out.println("4. Hapus Produk Peralatan Masak");
        System.out.println("5. Kembali ke Menu Awal");
        System.out.println("6. Exit Program");
        System.out.println(" ");
        System.out.println("Pilihan Menu : ");
        admin = input.nextLine();
        return admin;
    }

    // public MenuAwal
    public static String menuAwal (){
        System.out.println(" ");
        System.out.println("=======================================");
        System.out.println("         Toko Perlengkapan Rumah       ");
        System.out.println("=======================================");
        System.out.println(" ");
        System.out.println("Pilih Menu: ");
        System.out.println(" ");
        System.out.println("1. Produk Furniture");
        System.out.println("2. Produk Peralatan Masak");
        System.out.println("3. Exit Program");
        System.out.println(" ");
        System.out.println("Pilihan Menu : ");
        option = input.nextLine();
        return option;
    }
   
    // mainmenu
    public static void main(String[] args) {
        // objek kedua
        Admin User = new Admin();
        // perhubungan user admin
        User.Akun();
        System.out.print("Username : ");
        String uname = input.nextLine();
        System.out.print("Password : ");
        String pass = input.nextLine();
        boolean admin;
   
        while(!uname.equals(User.getUsername()) || !pass.equals(User.getPassword())){
            System.out.println(" ");
            System.err.println("Username atau Password anda salah! ");
            System.out.println(" ");
            System.err.print("Username :");
            uname = input.nextLine();
            System.err.println("Password : ");
            pass = input.nextLine();
        }
        
        // penamaan jika admin = true
        admin = true;
        menu(admin);
    }
}