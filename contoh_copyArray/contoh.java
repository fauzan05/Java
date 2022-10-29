import java.util.*;
public class contoh {
    public static void main(String[] args) {
        int [] arrayAngka = {1,2,3,4,5,6,7,8,9,10};
        
            System.out.println("Merubah array menjadi string");
            System.out.println("============================");
            tampilarray(arrayAngka);
            System.out.println("\nMengcopy array");
            System.out.println("==============");
            int[] arrayAngka1 = new int[10];
            tampilarray(arrayAngka);
            tampilarray(arrayAngka1);
           
            System.out.println("\nmengkopi dengan loop");
            for(int i =0; i<arrayAngka.length; i++){
                arrayAngka1 = arrayAngka;
            }
            tampilarray(arrayAngka);
            tampilarray(arrayAngka1);
            
            System.out.println("\nmengkopi dengan copyOf");
            int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 5);
            tampilarray(arrayAngka3);
    }
    private static void tampilarray(int[] angka){
        System.out.println("Array : " + Arrays.toString(angka));
    }
}
