import java.util.*;

public class exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Informe o primeiro valor: ");
            double n1 = sc.nextDouble(); 
        System.out.println ("Informe o segundo valor: ");
            double n2 = sc.nextDouble(); 
        System.out.println ("Informe o terceiro valor: ");
            double n3 = sc.nextDouble();
        System.out.println ("Informe o quarto valor: ");
            double n4 = sc.nextDouble();
        System.out.println ("Informe o quinto valor: ");
            double n5 = sc.nextDouble();
        System.out.println ("Informe o sexto valor: ");
            double n6 = sc.nextDouble();
        System.out.println ("Informe o sétimo valor: ");
            double n7 = sc.nextDouble();
        System.out.println ("Informe o oitavo valor: ");
            double n8 = sc.nextDouble();
        System.out.println ("Informe o nono valor: ");
            double n9 = sc.nextDouble();
        System.out.println ("Informe o décimo valor: ");
            double n10 = sc.nextDouble();
        
            double soma40 = 0;

        if(n1 < 40){
            soma40 += n1;
        }
        if(n2 < 40){
            soma40 += n2;
        }
        if(n3 < 40){
            soma40 += n3;
        }
        if(n4 < 40){
            soma40 += n4;
        }
        if(n5 < 40){
            soma40 += n5;
        }
        if(n6 < 40){
            soma40 += n6;
        }
        if(n7 < 40){
            soma40 += n7;
        }
        if(n8 < 40){
            soma40 += n8;
        }
        if(n9 < 40){
            soma40 += n9;
        }
        if(n10 < 40){
            soma40 += n10;
        }
        System.out.println("a soma dos valores foi " + soma40);
        sc.close();
    }
}
