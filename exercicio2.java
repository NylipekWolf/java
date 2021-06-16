import java.util.*;

public class exercicio2 {
    public static void main(String[] args){
        System.out.println("ola voce!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int n1 = sc.nextInt(); 
        System.out.println("Informe o segundo valor: ");
        int n2 = sc.nextInt(); 
        System.out.println("Informe o terceiro valor: ");
        int n3 = sc.nextInt(); 
        
        if(n1 > n2 && n1 > n3){
            System.out.println("o maior foi:" + n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("o maior numero foi :" + n2);
        }
        else{
            System.out.println("o maior numero foi :" + n3);
        }
        sc.close();
    
    }    
}
