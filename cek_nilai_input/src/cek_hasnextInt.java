import java.util.*;
public class cek_hasnextInt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int umur=0;
        boolean kondisi = false;
        System.out.print("Masukkan umur anda : ");
        while(kondisi==false){
            if(keyboard.hasNextInt()){
                umur = keyboard.nextInt();
                if(umur>=0 && umur<=10){
                    break;
                }else{
                    System.out.println("Masukkan angka 1 - 10 !");
                    System.out.print("Masukkan angka : "); 
                }
            }else if(!keyboard.hasNextInt()){
                System.out.println("Masukkan sebuah nilai, bukan karakter atau huruf !");
                System.out.print("Masukkan angka : ");
                keyboard.next();
            }            
        }     
        System.out.println("Umur anda adalah " + umur + " Tahun");
    }
}
