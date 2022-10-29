import java.util.*;
public class String_Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String masukan;
        System.out.println("Masukkan sebuah string : ");
        masukan = input.next();
        //System.out.println(masukan.length());
        if(masukan.length()>6){
            while(true){
              System.out.println("harap masukkan string kurang dari 5");
              masukan = input.next();
              if(masukan.length()<6){
                  System.out.println(masukan.length());
                  break;
              }
            }    
        }else{
            System.out.println(masukan.length());
        }
    }
}
