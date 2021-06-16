import java.util.*;
public class exercicio4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Informe o primeiro valor: ");
            double n1 = sc.nextDouble();
        System.out.println("informe o segundo valor: ");
            double n2 = sc.nextDouble();
        System.out.println("Escolha uma opção: 1) Subtração. 2) Soma. 3) Multiplicação. 4) Divisão.");
            int escolha = sc.nextInt();
        switch(escolha){
            case 1:
            Double calculo =n1-n2;
            System.out.println("O resultado final foi: " + calculo);
            break;
            case 2:
            double calculo2 =n1+n2;
            System.out.println("O resultado final foi: " + calculo2);
            break;
            case 3:
            double calculo3 =n1*n2;
            System.out.println("O resultado final foi: " + calculo3);
            break;
            case 4:
            double calculo4 =n1/n2;
            System.out.println("O resultado final foi: " + calculo4);
            break;
        }

    }
}
