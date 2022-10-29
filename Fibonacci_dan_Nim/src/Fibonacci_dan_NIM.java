import java.util.*;
public class Fibonacci_dan_NIM {
    public static void main(String[] args) {
        boolean kondisi = true;
        while(kondisi == true){
        char opsi;
        String nama,NIM;
        String batas = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
        int bilangan,jumlah1 = 0,jumlah2 = 0,jumlah3 = 0,deret, a = 0, b = 1;
        int nilaiawal1 = 0,nilaiawal2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda [1...25]: ");
        nama = input.next();
        if(nama.length()>25){ //jika jumlah karakter lebih dari 25, maka masuk ke perulangan while
            while(true){
                System.out.println("Batas pengisian nama tidak boleh lebih dari 25 karakter!");
                System.out.print("Masukkan ulang Nama Anda dengan benar[1...25]: ");
                nama = input.next(); // meminta user menginput kembali sesuai ketentuan
                if(nama.length()<=25){ //jika user memasukkan karakter kurang dari 25, maka perulangan while berakhir dan akan melanjutkan ke baris program selanjutnya
                    break;
                }
            }
        }
        System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
        NIM = input.next();
        if(NIM.length() != 10){ 
            while(true){
                System.out.println("Masukkan angka harus 10 digit !");
                System.out.print("Masukkan kembali angka dengan benar[harus 10 karakter] : ");
                NIM = input.next(); 
                if(NIM.length() == 10){ 
                    break;
                }
            }
        }
        System.out.println("\n" + batas);
        System.out.println("Registrasi Sukses...");
        System.out.println("Selamat Datang " + nama + " dengan NIM : " + NIM);
        System.out.println("Mari belajar macam-macam deret bilangan...");
        System.out.println(batas);
        System.out.print("\n" + "Masukkan banyak deret angka yang ingin diproses (Genap,Ganjil,Fibonacci) [5..20]: ");
        bilangan = cekInput(input); //mengecek apakah nilai yang diinput benar, jika tidak maka akan masuk ke fungsi cekInput, jika benar maka akan lanjut ke baris program selanjutnya
        System.out.println("\n" + batas);
        System.out.println("DERET BILANGAN");
        System.out.println("##############");
        System.out.println("Bilangan Genap dengan deret : " + bilangan);
        for(int i=0; i<bilangan; i++){ // nilai i kurang dari variabel bilangan agar membuat batas perulangan sesuai input yang dimasukka user di dalam variabel bilangan
            nilaiawal1 += 2; // nilai awal ditambah dengan 2 karena nilaiawal1 bernilai 0
            jumlah1 += nilaiawal1; //jumlah1 ditambah dengan nilaiawal1 karena untuk menjumlahkan setiap nilai perulangan yang bertambah
            System.out.print(nilaiawal1 + " ");
        }
        System.out.println("\n" + "Hasil Penjumlahan = " + jumlah1);
        
        System.out.println("Bilangan Ganjil dengan deret : " + bilangan);
        for(int i=0; i<bilangan; i++){
            System.out.print(nilaiawal2 + " "); // menampilkan nilai awal terlebih dahulu karena bilangan ganjil dimulai dari angka 1
            nilaiawal2 += 2; // nilai awal ditambah dengan 2 karena nilaiawal1 bernilai 1
            jumlah2 += nilaiawal2 - 2; // jumlah2 ditambah dengan nilaiawal2 yang kemudian dikurangi 2 agar hasilnya sama dengan bilangan pertama yang kemudian dijumlahkan setiap perulangan dilakukan  
        }
        System.out.println("\n" + "Hasil Penjumlahan = " + jumlah2);
        
        System.out.println("Bilangan Fibonacci dengan deret : " + bilangan);
        
        for(int i=0; i<bilangan; i++){
            deret = a + b; // isi nilai variabel deret adalah hasil dari penjumlahan variabel a dan b (deret pertama 0, deret kedua 1)
            b = a; //mengganti nilai variabel b menjadi a agar bergeser posisi deret kedua (b) menjadi deret pertama, sehingga (a) menjadi deret kedua nantinya
            a = deret; //nilai a diganti dengan nilai variabel deret agar menjumlahkan dengan nilai hasil yang sekarang dengan deret sebelumnya
            jumlah3 += a; //menjumlahkan semua bilangan deret yang akan ditampilkan
            System.out.print(deret + " ");
        }
        System.out.println("\n" + "Hasil Penjumlahan = " + jumlah3);
        System.out.println("Apakah anda ingin mengulang lagi ? [y/t]");
        opsi = input.next().charAt(0);
        //membuat pengkondisian switch case jika user menginput y/t huruf kapital maupun tidak
        switch (opsi) {
                case 'Y': //jika user menginput huruf Y, maka kondisi akan bernilai true
                    System.out.println("Program Dimulai Kembali...");
                    kondisi = true;
                    break;
                case 'y': //jika user menginput huruf y, maka kondisi akan bernilai true
                    System.out.println("Program Dimulai Kembali...");
                    kondisi = true;
                    break;
                case 'T': //jika user menginput huruf T, maka kondisi akan bernilai false
                    System.out.println("Program Telah Berakhir...");
                    kondisi = false;
                    break;
                case 't': //jika user menginput huruf t, maka kondisi akan bernilai false
                    System.out.println("Program Telah Berakhir...");
                    kondisi = false;
                    break;
                default: //jika user tidak memasukkan dari semua case diatas, maka akan masuk ke while
                    while(true){
                        System.out.println("Harap masukkan karakter y/t untuk mengulang program atau mengakhiri program !"); 
                        System.out.println("Masukkan karakter : ");
                        opsi = input.next().charAt(0); //menginput user kembali
                        if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka perulangan berakhir dan kembali ke default
                            break;
                        }else if(opsi == 'T' || opsi == 't'){//jika user memasukkan karakter T atau t, maka perulangan berakhir dan kembali ke default
                            break;
                        }
                    }
                    if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka program dimulai kembali
                            System.out.println("Program Dimulai Kembali...");
                            kondisi = true;
                        }else if(opsi == 'T' || opsi == 't'){ //jika user memasukkan karakter T atau t, maka program telah berakhir
                            System.out.println("Program Telah Berakhir...");
                            kondisi = false;
                        }
                    break;
            }
        }  
    }
    private static int cekInput(Scanner inputuser) {
        int input = 0; //membuat variabel input dengan tipe Integer sekaligus inisialisasi awal dengan nilai awal 0
        boolean kondisi1 = false; // membuat variabel kondisi1 dengan tipe Boolean dengan inisialisasi awalnya bernilai false
        while (kondisi1 == false) {
            // karena kondisi1 bernilai false, maka perulangan dieksekusi
            // masukkan input berupa bilangan bertipe Integer
            if (inputuser.hasNextInt()) {
                input = inputuser.nextInt();
                // input harus bilangan Integer 2 sampai 10
                if (input >= 5 && input <= 20) {
                    kondisi1 = true;
                    /* 
                        jika user memasukkan inputan antara 5 sampai 20, maka kondisi ini akan dieksekusi,
                        dan kondisi1 bernilai true. maka perulangan while telah berakhir
                    */
                } else {
                    System.out.println("Masukkan banyak deret angka yang ingin diproses antara 5 sampai 20 ! ");
                    System.out.print("Masukkan banyak deret angka yang mau diproses [5..20] : ");
                    /*
                        jika user memasukkan inputan kurang dari 5 dan lebih dari 20,
                        maka user harus menginputkan ulang angka 5 sampai 20
                    */
                }
            }     
            else {
                System.out.println("Mohon masukkan angka ! ");
                System.out.print("Masukkan banyak angka yang mau dicetak [5..20] : ");
                inputuser.next();
                /* 
                    apabila yang dimasukkan oleh user bukan bilangan Integer, 
                    maka user harus menginput ulang dengan bilangan Integer yang sudah ditentukan
                */
            }
        }
        return input; //mengembalikan nilai variabel input
    }
}
