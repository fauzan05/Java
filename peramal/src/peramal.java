import java.util.*;
import java.text.DecimalFormat;
public class peramal {
    public static void main(String[] args) {
        String NamaAnda,NamaPasangan,UmurAnda,UmurPasangan;
         float BilanganAcak = (float)(Math.random() * 50 + 50);
         Scanner keyboard = new Scanner(System.in);
         DecimalFormat formatdesimal = new DecimalFormat("#.##");
         
         System.out.println("\n" + "Selamat Datang Di Program Ramalan Cupu");
         System.out.println("++++++++++++++++++++++++++++++++++++++++");
         System.out.println("\n" + "Data Anda : ");
         System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥");
         System.out.print("Masukkan Nama Anda : ");
         NamaAnda = keyboard.nextLine();
         System.out.print("Masukkan Umur Anda : ");
         UmurAnda = keyboard.nextLine();
         System.out.println("\n" + "Data Pasangan Anda : ");
         System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
         System.out.print("Masukkan Nama Pasangan Anda : ");
         NamaPasangan = keyboard.nextLine();
         System.out.print("Masukkan Umur Pasangan Anda : ");
         UmurPasangan = keyboard.nextLine();
         System.out.println("\n" + NamaAnda + " [" + UmurAnda + "] " + "Tahun");
         System.out.println("  ♥♥♥   ♥♥♥");
         System.out.println(" ♥♥♥♥♥ ♥♥♥♥♥");
         System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥");
         System.out.println(" ♥♥♥♥♥♥♥♥♥♥♥");
         System.out.println("   ♥♥♥♥♥♥♥");
         System.out.println("     ♥♥♥");
         System.out.println("      ♥");
         System.out.println(NamaPasangan + " [" + UmurPasangan + "] " + "Tahun");
         System.out.print("\n" + "Tekan ENTER Untuk Melihat Hasil Ramalan...");
         keyboard.nextLine();
         
        System.out.print("\n" + "Kecocokan anda dengan pasangan adalah : " );
        System.out.print(formatdesimal.format(BilanganAcak/1.1) + "%");
        System.out.println("\n" + "Terima Kasih karena anda telah menggunakan jasa Ramalan kami... ^-^");  
    }
}
