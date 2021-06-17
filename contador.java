import java.util.*;
public class contador {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("esse programa vai contar ate 10");
        int numero = 1;

        while(numero <= 10){
            System.out.println(numero++);
        }
        sc.close();
    }
}
