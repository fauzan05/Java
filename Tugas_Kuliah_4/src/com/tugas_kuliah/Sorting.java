package com.tugas_kuliah;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batasawal,batasakhir,jumlahangka,pilihan;
        boolean kondisi,jawaban;
		char choice;
        System.out.println("Selamat Datang di Program Simulasi");
        System.out.println("===Menu===");
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar");
        System.out.println("Tekan enter untuk melanjutkan");
        input.nextLine();
		System.out.print("Silahkan masukkan pilihan menu anda (1-6): ");
		pilihan = cekinput(); //input divalidasi dahulu
		switch(pilihan){
			case 1 :
			kondisi = true;
			do{
				System.out.print("\nMasukkan batas awal : ");
				batasawal = cekinput2();
				System.out.print("\nMasukkan batas akhir : ");
				batasakhir = cekinput2();
				System.out.print("\nMasukkan banyak angka random yang ingin ditampilkan : ");
				jumlahangka = cekinput2();
				int[] array1 = new int[jumlahangka];
				for(int i = 0; i < jumlahangka; i++){
					int angka = ThreadLocalRandom.current().nextInt(batasawal, batasakhir);
					array1[i] = angka;
				}
				System.out.println("\n===Simulasi Angka Random===");
				tampilarray(array1);
				System.out.print("\nApakah Anda ingin mengulang simulasi [Y/T] : ");
				kondisi = ulang();
			}
			while(kondisi == true);
			break;
			case 2 :
			kondisi = true;
			do{
				System.out.print("\nMasukkan batas awal : ");
				batasawal = cekinput2();
				System.out.print("\nMasukkan batas akhir : ");
				batasakhir = cekinput2();
				System.out.print("\nMasukkan banyak angka random yang ingin ditampilkan : ");
				jumlahangka = cekinput2();
				int[] array1 = new int[jumlahangka];
				for(int i = 0; i < jumlahangka; i++){
					int angka = ThreadLocalRandom.current().nextInt(batasawal, batasakhir);
					array1[i] = angka;
				}
				System.out.println("\n===Simulasi Bubble Sort -> Ascending==");
				bubblesortASC(array1);
				System.out.print("\nApakah Anda ingin mengulang simulasi [Y/T] : ");
				kondisi = ulang();     
			}
			while (kondisi == true);
			break;
			case 3 :
			kondisi = true;
			do{
				System.out.print("\nMasukkan batas awal : ");
				batasawal = cekinput2();
				System.out.print("\nMasukkan batas akhir : ");
				batasakhir = cekinput2();
				System.out.print("\nMasukkan banyak angka random yang ingin ditampilkan : ");
				jumlahangka = cekinput2();
				int[] array1 = new int[jumlahangka];
				for(int i = 0; i < jumlahangka; i++){
					int angka = ThreadLocalRandom.current().nextInt(batasawal, batasakhir);
					array1[i] = angka;
				}
				System.out.println("\n===Simulasi Selection Sort -> Ascending==");
				selectionsortASC(array1);
				System.out.print("\nApakah Anda ingin mengulang simulasi [Y/T] : ");
				kondisi = ulang();    
			}
			while (kondisi == true);
			break;
			case 4 :
			kondisi = true;
			do{
				System.out.print("\nMasukkan batas awal : ");
				batasawal = cekinput2();
				System.out.print("\nMasukkan batas akhir : ");
				batasakhir = cekinput2();
				System.out.print("\nMasukkan banyak angka random yang ingin ditampilkan : ");
				jumlahangka = cekinput2();
				int[] array1 = new int[jumlahangka];
				for(int i = 0; i < jumlahangka; i++){
					int angka = ThreadLocalRandom.current().nextInt(batasawal, batasakhir);
					array1[i] = angka;
				}
				System.out.println("\n===Simulasi Bubble Sort -> Descending==");
				bubblesortDSC(array1);
				System.out.print("\nApakah Anda ingin mengulang simulasi [Y/T] : ");
				kondisi = ulang();     
			}
			while (kondisi == true);
			break;
			case 5 :
			kondisi = true;
			do{
				System.out.print("\nMasukkan batas awal : ");
				batasawal = cekinput2();
				System.out.print("\nMasukkan batas akhir : ");
				batasakhir = cekinput2();
				System.out.print("\nMasukkan banyak angka random yang ingin ditampilkan : ");
				jumlahangka = cekinput2();
				int[] array1 = new int[jumlahangka];
				for(int i = 0; i < jumlahangka; i++){
					int angka = ThreadLocalRandom.current().nextInt(batasawal, batasakhir);
					array1[i] = angka;
				}
				System.out.println("\n===Simulasi Selection Sort -> Descending==");
				selectionsortDSC(array1);
				System.out.print("\nApakah Anda ingin mengulang simulasi [Y/T] : ");  
				kondisi = ulang();   
			}
			while (kondisi == true);
			break;
			case 6 :
			System.out.println("Program telah berakhir...");
			break;
			default :
				break;                       
		}
		input.close();       
	}
    private static int cekinput (){
        int inputan = 0;
        boolean kondisi1 = true; //kondisi1 untuk pengulangan
		Scanner input = new Scanner(System.in);
        while(kondisi1 == true){
            while(!input.hasNextInt()){
                System.out.print("Mohon masukkan angka : ");
                input.next(); //minta lagi
			}
			inputan = input.nextInt();
			if(inputan > 0 && inputan < 7){ //harus antara 1 s.d. 6
				kondisi1 = false;
				break; //keluar while loop
			}else{
				System.out.println("Mohon masukkan pilihan 1 sampai 6 !");
				System.out.print("Masukkan pilihan : ");
			}
        }
        //input.close();
        return inputan;
    }
	private static int cekinput2 (){
        int inputan = 0;
        boolean kondisi1 = true; //kondisi1 untuk pengulangan
		Scanner input = new Scanner(System.in);
        while(kondisi1 == true){
            while(!input.hasNextInt()){
                System.out.print("Mohon masukkan angka : ");
                input.next(); //minta lagi
			}
			inputan = input.nextInt();
			if(inputan > 0){
				kondisi1 = false;
				break; //keluar while loop
			}else{
				System.out.print("Mohon masukkan bilangan natural : ");
			}
        }
        //input.close();
        return inputan;
    }
	private static boolean ulang (){
		boolean kondisi1 = false,jawaban = false; //var kondisi1 untuk pengulangan, jawaban untuk return statement
		char choice; //choice untuk input dari scanner
		Scanner input = new Scanner(System.in);
		while (kondisi1 == false){ //loop mengulang selama jawaban tidak sesuai
			choice = input.next().charAt(0);
			if(choice == 'y' || choice == 'Y'){
				kondisi1 = true;
				jawaban = true;
                System.out.println("Program mengulang kembali...");
			}
			else if(choice == 't' || choice == 'T'){
				kondisi1 = true;
				jawaban = false;
                System.out.println("Program telah berakhir...");
                input.close();
			}
			else{
				System.out.println("Harap masukkan karakter y/t untuk mengulang atau mengakhiri!");
                System.out.print("\nMasukkan karakter : ");
			}
		}
		return jawaban;
	}
    private static void tampilarray(int[] data){
        for(int angka : data){
            if(angka == 0){
              System.out.print(angka);  
            }else{
              System.out.print(angka + " ");  
            }
            
        }
        System.out.print("\n");
    }
    private static void bubblesortASC (int[] angka){
        System.out.println("\n===Sebelum===");
        tampilarray(angka);
        System.out.println("\n===Proses===");
        for(int i = 1; i < angka.length; i++){
            System.out.println("Awal dari Putaran ke-" + i);
            for(int j = 0; j < angka.length-1; j++){                 
                if(angka[j] > angka[j+1]){
                    int tampung = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = tampung;
                    tampilarray(angka);
                }else{
                    tampilarray(angka);
                }
                
            }
            System.out.println("Akhir dari Putaran ke-" + i);
            tampilarray(angka);
        }
        tampilarray(angka);
        System.out.println("\n===Sesudah===");
        tampilarray(angka);
    }
    private static void bubblesortDSC (int[] angka){
        System.out.println("\n===Sebelum===");
        tampilarray(angka);
        System.out.print("\n");
        System.out.println("\n===Proses===");
        for(int i = 1; i < angka.length; i++){
            System.out.println("Awal dari Putaran ke-" + i);
            for(int j = 0; j < angka.length-1; j++){                 
                if(angka[j] < angka[j+1]){
                    int tampung = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = tampung;
                    tampilarray(angka);
                }else{
                    tampilarray(angka);
                }
                
            }
            System.out.println("Akhir dari Putaran ke-" + i);
            tampilarray(angka);
        }
        tampilarray(angka);
        System.out.println("\n\n===Sesudah===");
        tampilarray(angka);
    }
    private static void selectionsortASC (int[] angka){
        System.out.println("\n===Sebelum===");
        tampilarray(angka);
        System.out.println("\n===Proses===");
        for(int i = 0; i < angka.length; i++){
            System.out.println("Awal dari Putaran ke-" + i);
            tampilarray(angka);
            int indexArray = i;
            for(int j = i; j < angka.length; j++){                 
                if(angka[indexArray] > angka[j]){
                    indexArray = j;    
                }
                int tampungNilai = angka[i];
                angka[i] = angka[indexArray];
                angka[indexArray] = tampungNilai;
                tampilarray(angka);
            }
            System.out.println("Akhir dari Putaran ke-" + i);
            tampilarray(angka);
        }
        tampilarray(angka);
        System.out.println("\n===Sesudah===");
        tampilarray(angka);


    }
    private static void selectionsortDSC (int[] angka){
        System.out.println("\n===Sebelum===");
        tampilarray(angka);
        System.out.println("\n===Proses===");
        for(int i = 0; i < angka.length; i++){
            System.out.println("Awal dari Putaran ke-" + i);
            tampilarray(angka);
            int indexArray = i;
            for(int j = i; j < angka.length; j++){                 
                if(angka[indexArray] < angka[j]){
                    indexArray = j;    
                }
                int tampungNilai = angka[i];
                angka[i] = angka[indexArray];
                angka[indexArray] = tampungNilai;
                tampilarray(angka);
            }
            System.out.println("Akhir dari Putaran ke-" + i);
            tampilarray(angka);
        }
        tampilarray(angka); 
        System.out.println("\n===Sesudah===");
        tampilarray(angka);
    }   
}