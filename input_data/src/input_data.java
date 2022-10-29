import java.util.*;
public class input_data {
    public static void main(String[] args) {
        String Nama,NamaBarang;
    double HargaBeli,HargaJual;
    int JumlahBarang;
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Nama Karyawan: ");    
    Nama = keyboard.nextLine();
    System.out.println("Stok Gudang Input Barang");
    System.out.println("##########################");
    System.out.println("\n" + "Selamat Datang " + Nama);
    System.out.print("\n" + "Masukkan Nama Barang Yang Mau Ditambah : ");    
    NamaBarang = keyboard.nextLine();
    System.out.print("\n" + "Masukkan Jumlah Barang Yang Mau Ditambah : ");    
    JumlahBarang = keyboard.nextInt();
    System.out.print("\n" + "Masukkan Harga Beli Untuk Barang Tersebut : ");    
    HargaBeli = keyboard.nextDouble();
    System.out.print("\n" + "Masukkan Harga Jual Untuk Barang Tersebut : ");
    HargaJual = keyboard.nextDouble();
    System.out.println("\n" + "Stok Gudang Rincian Barang");
    System.out.println("###########################");
    System.out.println("Nama Barang : " + NamaBarang);
    System.out.println("Jumlah Barang : " + JumlahBarang);
    System.out.println("Harga Beli : Rp " + HargaBeli);
    System.out.println("Harga Jual : Rp " + HargaJual);
    }
}
