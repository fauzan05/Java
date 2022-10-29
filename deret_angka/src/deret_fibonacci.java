import java.util.*;
public class deret_fibonacci {
    public static void main(String[] args) {
        int a,b,c,n;
        
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan rentang bilangan deret fibonacci : ");
        n = inputUser.nextInt();
        
        a = 0;
        b = 1;
        c = 0;
        for(int i=0; i<=n; i++){
            System.out.println("Nilai ke : " + i + " adalah " + c);
            c = a+b;
            b = a;
            a = c;
        }  
    }
}
