import java.util.*;

public class exercicio1 {
    public static void main(String[] args){
        System.out.println("ola voce!");
        System.out.println("bem-vindo ao leitor de numeros, descubra se e negativo ou posisitivo");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num>0){
        System.out.println("o valor foi positivo");
        }
        else{
            System.out.println("o valor foi nagativo");
        }
    
    }
}
