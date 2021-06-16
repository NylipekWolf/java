import java.util. *;
public class exercicio5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Informe o primeiro valor: ");
                double n1 = sc.nextDouble(); 
        System.out.println ("Informe o segundo valor: ");
                double n2 = sc.nextDouble(); 
        if (n1 >= 0 && n2 >= 0 ) {
        System.out.println ("Verdadeiro.");
            }
        if (n1 < 0 && n2 < 0 ) {
            System.out.println ("Falso.");
        }
        sc.close();
    }
}
