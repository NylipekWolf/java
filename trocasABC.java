import java.util.*;
public class trocasABC {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        double A, B, C;

        System.out.println("Digite o valor (numerico) de A :");
        A = sc.nextDouble();

        System.out.println("Digite o valor (numerico) de B :");
        B = sc.nextDouble();

        System.out.println("Digite o valor (numerico) de C :");
        C = sc.nextDouble();

        A = B;
        B = C;
        C = A;

        System.out.println("O valor de A é : " + A +
        "\nO valor de B é : " + B +
        "\nO valor de C é : " + C);

        sc.close();
    }
}
