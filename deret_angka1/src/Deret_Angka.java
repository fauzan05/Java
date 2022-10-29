import java.util.*;
public class Deret_Angka {
    public static void main(String[] args) {
        boolean kondisi = true; 
        //membuat perulangan while di awal program berjalan agar nantinya bisa memberi opsi y/t pada akhir program
        while (kondisi == true) {
            
            int input1, input2;
            char opsi; //membuat variabel opsi dengan tipe data char yang nantinya digunakan untuk menampung sebuah karakter y/t
            Scanner keyboard = new Scanner(System.in);
            // membuat variabel scanner yang akan menampung data dari user yang diketikkan melalui keyboard
            System.out.println("\n" + "Belajar Deret Aritmatika, Geometri, dan menghitung Faktorial");
            System.out.print("\n" + "Masukkan banyak angka yang mau dicetak [2...10] : ");
            input1 = cekInput1(keyboard); //mendefinisikan bahwa nantinya variabel input1 nilainya akan diisi oleh user sekaligus mengecek apakah user memasukkan input yang tidak sesuai ketentuan
            System.out.print("\n" + "Masukkan beda masing-masing angka [2...9] : ");
            input2 = cekInput2(keyboard); //mendefinisikan bahwa nantinya variabel input2 nilainya akan diisi oleh user sekaligus mengecek apakah user memasukkan input yang tidak sesuai ketentuan
            System.out.println("\n" + "Layar tampilan Deret Aritmatika,Geometri, dan Faktorial");
            System.out.println("\n" + "Deret Aritmatika : ");
            int nilaiAwalAritmatika = 1; //nilai awal untuk variabel deret aritmatika adalah 1
            for (int i = 1; i <= input1; i++) { //mendefinisikan bahwa nilai i kurang dari sama dengan nilai dari variabel input1
                System.out.print(nilaiAwalAritmatika + " "); // print dahulu agar nilai awal 1 ditampilkan terlebih dahulu
                nilaiAwalAritmatika += input2; //nilai awal 1 ditambahkan dengan nilai dari user yang dimasukkan ke dalam variabel input2 
            }
            System.out.println("\n");
            System.out.println("\n" + "Deret Geometri : ");
            int nilaiAwalGeometri = 1; //nilai awal untuk variabel deret geometri adalah 1
            for (int i = 1; i <= input1; i++) { //mendefinisikan bahwa nilai i kurang dari sama dengan nilai dari variabel input1
                System.out.print(nilaiAwalGeometri + " ");// print dahulu agar nilai awal 1 ditampilkan terlebih dahulu
                nilaiAwalGeometri *= input2; ////nilai awal 1 ditambahkan dengan nilai dari user yang dimasukkan ke dalam variabel input2 
            }
            System.out.println("\n");
            System.out.println("\n" + "Faktorial Dari : " + input1);
            int nilaiAwalFaktorial = 1; //nilai awal untuk variabel faktorial adalah 1
            int total = 1; //membuat variabel total yang nilai awalnya 1, gunanya untuk menghitung semua nilai faktorial
            nilaiAwalFaktorial += input1; //mendefinisikan bahwa variabel nilai awal untuk variabel faktorial ditambah dengan nilai variabel dari input1
            for (int i = input1; i >= 1; i--) {//melakukan perhitungan mundur dengan mendefinisikan variabel i nilai awal adalah input1 dengan melakukan decrement (i--)
                nilaiAwalFaktorial -= 1; //setiap nilai awal dari input1 dikurangi 1
                total *= nilaiAwalFaktorial; //variabel total dikali dengan nilai awal dari input1 yang sudah dikurangi 1
                if (nilaiAwalFaktorial == 1) { // jika nilai awal bernilai 1, maka setelahnya print sebuah karakter = dan kemudian sebuah nilai dari variabel total
                    System.out.print(nilaiAwalFaktorial + " = " + total);
                } else {
                    System.out.print(nilaiAwalFaktorial + " * "); //jika nilai awal tidak sama dengan 1, maka setelah nilai awal, diberi karakter *
                }
            }
            System.out.println("\n");
            System.out.println("\n" + "Anda Mau ulang atau tidak? [masukkan input Y atau y jika Ya, ketik T atau t jika Tidak]");
            opsi = keyboard.next().charAt(0); //mendefinisikan bahwa variabel opsi bertipe char
            // membuat sebuah pengkondisian menggunakan swith case jika user memasukkan sebuah karakter y/t dengan huruf kapital atau tidak
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
                        opsi = keyboard.next().charAt(0); //menginput user kembali
                        if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka perulangan berakhir
//                            System.out.println("Program Dimulai Kembali...");
                            break;
                        }else if(opsi == 'T' || opsi == 't'){
//                            System.out.println("Program Telah Berakhir...");
                            break;
                        }
                    }
                    if(opsi == 'Y' || opsi == 'y'){ //jika user memasukkan karakter Y atau y, maka perulangan berakhir
                            System.out.println("Program Dimulai Kembali...");
                            kondisi = true;
                        }else if(opsi == 'T' || opsi == 't'){
                            System.out.println("Program Telah Berakhir...");
                            kondisi = false;
                        }
                    break;
            }
        }
    }
    private static int cekInput1(Scanner keyboard) {
        int input = 0; //membuat variabel getInput dengan tipe Integer sekaligus inisialisasi awal dengan nilai awal 0
        boolean kondisi1 = false; // membuat variabel kondisi1 dengan tipe Boolean dengan inisialisasi awalnya bernilai false
        while (kondisi1 == false) {
            // karena kondisi1 bernilai false, maka perulangan dieksekusi
            // masukkan input berupa bilangan bertipe Integer
            if (keyboard.hasNextInt()) {
                input = keyboard.nextInt();
                // input harus bilangan Integer 2 sampai 10
                if (input >= 2 && input <= 10) {
                    kondisi1 = true;
                    /* 
                        jika user memasukkan inputan antara 2 sampai 10, maka kondisi ini akan dieksekusi,
                        dan kondisi1 bernilai true. maka perulangan while telah berakhir
                    */
                } else {
                    System.out.println("Mohon masukkan banyak angka yang mau dicetak antara 2 sampai 10 ! ");
                    System.out.print("Masukkan banyak angka yang mau dicetak [2...10] : ");
                    /*
                        jika user memasukkan inputan kurang dari 2 dan lebih dari 10,
                        maka user harus menginputkan ulang angka 2 sampai 10
                    */
                }
            }     
            else {
                System.out.println("Mohon masukkan angka ! ");
                System.out.print("Masukkan banyak angka yang mau dicetak [2...10] : ");
                keyboard.next();
                /* 
                    apabila yang dimasukkan oleh user bukan bilangan Integer, 
                    maka user harus menginput ulang dengan bilangan Integer yang sudah ditentukan
                */
            }
        }
        return input; //mengembalikan nilai variabel getInput
    }

    private static int cekInput2(Scanner keyboard) {
        int input = 0; //membuat variabel getInput dengan tipe Integer sekaligus inisialisasi awal dengan nilai awal 0
        boolean kondisi1 = false; // membuat variabel kondisi1 dengan tipe Boolean dengan inisialisasi awalnya bernilai false 
        while (kondisi1 == false) {
            // karena kondisi1 bernilai false, maka perulangan dieksekusi
            // masukkan input berupa bilangan bertipe Integer
            if (keyboard.hasNextInt()) {
                input = keyboard.nextInt();
                // input harus bilangan Integer 2 sampai 9
                if (input >= 2 && input <= 9) {
                    kondisi1 = true;
                    /* 
                        jika user memasukkan inputan antara 2 sampai 9, maka kondisi ini akan dieksekusi,
                        dan kondisi1 bernilai true. maka perulangan while telah berakhir
                    */
                } else {
                    System.out.println("Mohon masukkan banyak angka yang mau dicetak antara 2 sampai 9 ! ");
                    System.out.print("Masukkan banyak angka yang mau dicetak [2...9] : ");
                    /*
                        jika user memasukkan inputan kurang dari 2 dan lebih dari 9,
                        maka user harus menginputkan ulang angka 2 sampai 9
                    */
                }
            }
            else {
                System.out.println("Mohon masukkan angka ! ");
                System.out.print("Masukkan banyak angka yang mau dicetak [2...9] : ");
                keyboard.next();
                /* 
                    apabila yang dimasukkan oleh user bukan bilangan Integer, 
                    maka user harus menginput ulang dengan bilangan Integer yang sudah ditentukan
                */
            }
        }
        return input; //mengembalikan nilai variabel getInput
    }
}
