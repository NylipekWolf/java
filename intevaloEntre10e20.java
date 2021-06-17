import java.util.*;
public class intevaloEntre10e20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeros;
        int i;
        int v1[] = new int[11];
        int v2[] = new int[11];
        int entre = 1;
        int fora = 1;
        int totalE = entre;
        int totalF = fora;

        System.out.println("Esse é um programa que saber ler os numeros em intevalo " +
        "entre 10 e 20, e os numeros que estão fora desse intevalo" +
        "\nDigite 10 numeros para testar :");
        for(i = 1; i <= 10; i++){
            numeros = sc.nextInt();

            if( numeros >= 10 && numeros <= 20 ){
                v1[entre] = numeros;
                entre = entre + 1;
            }
            else{
                v2[fora] = numeros;
                fora = fora + 1;
            }

        }
        System.out.println("Esses são os numeros entre 10 e 20.");
        for( totalE = 1; totalE < entre; totalE++){
            System.out.println(v1[totalE]);
        }
        System.out.println("Esses são os numeros fora de 10 e 20");
        for(totalF = 1; totalF < fora; totalF++){
            System.out.println(v2[totalF]);
        }
        sc.close();
    }
}
