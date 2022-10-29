import java.util.*;

public class menu_makanan {
    public static void main(String[] args) {
        int jmlhpesanan,porsi1,porsi2,porsi3,porsi4,porsi5;
        float NasiGoreng = (float) 9999.99;
        float AyamBakar = (float) 12345.67;
        float SteakSirloin = (float) 21108.40;
        float KwetiawSiram = (float) 13579.13;
        float KambingGuling = (float) 98765.43;
        String atasnama;
        String nasgor = "Nasi Goreng Spesial";
        String ayam = "Ayam Bakar Spesial";
        String steak = "Steak Sirloin Spesial";
        String kwetiaw = "Kwetiaw Siram Spesial";
        String kambing = "Kambing Guling Spesial";
         
        
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Selamat Siang...");
        System.out.print("\n"+"Pesanan Untuk Berapa Orang : ");
        jmlhpesanan = getIntInput(keyboard);
        System.out.print("\n"+"Pesanan Atas Nama : ");
        atasnama = keyboard.next();
        System.out.println("\n"+"Menu Spesial Hari Ini");
        System.out.println("=====================");
        System.out.println("\n" + "1. " + nasgor + "\t\t\t" + "@ Rp. " + NasiGoreng);
        System.out.println("2. " + ayam + "\t\t\t" + "@ Rp. " + AyamBakar);
        System.out.println("3. " + steak + "\t\t" + "@ Rp. " + SteakSirloin);
        System.out.println("4. " + kwetiaw + "\t\t" + "@ Rp. " + KwetiawSiram);
        System.out.println("5. " + kambing + "\t\t" + "@ Rp. " + KambingGuling);
        System.out.print("\n" + "Pesanan Anda [batas pesanan 0-10] porsi");
        System.out.print("\n" + "1. " + nasgor + "\t\t" + "= ");
        porsi1 = getOrderAmount(keyboard);
        System.out.print("\n" + "2. " + ayam + "\t\t" + "= ");
        porsi2 = getOrderAmount(keyboard);
        System.out.print("\n" + "3. " + steak + "\t" + "= ");
        porsi3 = getOrderAmount(keyboard);
        System.out.print("\n" + "4. " + kwetiaw + "\t" + "= ");
        porsi4 = getOrderAmount(keyboard);
        System.out.print("\n" + "5. " + kambing + "\t" + "= ");
        porsi5 = getOrderAmount(keyboard);
        System.out.print("\n" + "Selamat Menikmati Makanan Anda...");
        System.out.print("\n" + "Pembelian : ");
        System.out.println("\n" + "1. " + nasgor + "\t\t\t" + porsi1 + " porsi * Rp. " + NasiGoreng + "\t" + " = "+ " Rp. " + NasiGoreng*porsi1);
        System.out.println("2. " + ayam + "\t\t\t" + porsi2 + " porsi * Rp. " + AyamBakar + "\t" + " = "+ " Rp. " + AyamBakar*porsi2);
        System.out.println("3. " + steak + "\t\t" + porsi3 + " porsi * Rp. " + SteakSirloin + "\t" + " = "+ " Rp. " + SteakSirloin*porsi3);
        System.out.println("4. " + kwetiaw + "\t\t" + porsi4 + " porsi * Rp. " + KwetiawSiram + "\t" + " = "+ " Rp. " + KwetiawSiram*porsi4);
        System.out.println("5. " + kambing + "\t\t" + porsi5 + " porsi * Rp. " + KambingGuling + "\t" + " = "+ " Rp. " + KambingGuling*porsi5 + " +"); 
        System.out.println("====================================================================================");
        float total = (float) NasiGoreng*porsi1 + AyamBakar*porsi2 + SteakSirloin*porsi3 + KwetiawSiram*porsi4 + KambingGuling*porsi5;
        System.out.println("Total Pembelian" + "\t\t\t\t\t\t\t" + " = " + " Rp. " + total );
        System.out.print("\n" + "Disc. 10% <Masa Promosi>" + "\t\t\t\t\t" + " = " + " Rp. " + total/100*10);
        System.out.print("  -  ");
        float diskon = (float) total/100*10;
        float totalfinal = (float) total - diskon;
        System.out.print("\n" + "====================================================================================");
        System.out.print("\n" + "Total Pembelian setelah disc 10%" + "\t\t\t\t" + " = " + " Rp. " + totalfinal);
        System.out.print("\n" + "Pembelian per orang <untuk " + jmlhpesanan + " orang>" + "\t\t\t\t" + " = " + " Rp. " + totalfinal/jmlhpesanan);
        System.out.print("\n\n" + "\t\t\t" + "Terimakasih Atas Kunjungan Anda...");
        System.out.println("\n" + "\t\t\t" + "...Tekan ENTER untuk keluar...");
        keyboard.nextLine();
        System.exit(0);
    }
    private static int getOrderAmount(Scanner keyboard) {
        int getInput = 0;
		boolean isValid = false;
		while (isValid == false) {
			// masukkan angka 
			if (keyboard.hasNextInt()) {
				getInput = keyboard.nextInt();
				// pesanan harus bilangan Integer
				if (getInput >= 0 && getInput <=10) {
					break;
				}
				else {
					System.out.println("Mohon masukkan jumlah pesanan yang sesuai antara 1 sampai 10 ! ");
                                        System.out.print("Masukkan jumlah pesanan : ");
				}
			}
			// apabila bukan input dengan tipe Integer yang sesuai maka masuk ke else 
			else {
				System.out.println("Mohon masukkan angka ! ");
                                System.out.print("Masukkan jumlah pesanan : ");
				keyboard.next(); // ulang scanner
			}
		}
        return getInput;
    }
    private static int getIntInput(Scanner keyboard) {
        int getInput = 0;
		boolean isValid = false;
		while (isValid == false) {
			// masukkan angka
			if (keyboard.hasNextInt()) {
				getInput = keyboard.nextInt();
				// pesanan harus bilangan Integer
				if (getInput > 0) {
					break;
				}
				else {
					System.out.print("Mohon masukkan jumlah orang yang sesuai : ");
				}
			}
			// apabila bukan input dengan tipe Integer maka masuk ke else 
			else {
				System.out.print("Mohon masukkan angka !");
                                System.out.print("\n"+"Pesanan Untuk Berapa Orang : ");
				keyboard.next(); // ulang scanner
			}
		}
        return getInput;
    }
}
