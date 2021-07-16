import java.util.Random;

import javax.annotation.processing.Generated;
public class App {
    public static void main(String[] args){
        int lenght = 10; // password lenght
        System.out.println(generatePswd(lenght));
    }
    static char[] generatePswd(int len){
        System.out.println("Sua Senha: ");
        String charsCaps = "ABCDFGHIJKLMNOPQRSTUVWYZ";
        String chars = "abcdefghiklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String symbols = "!@#$%¨&*()_/.<>";
        String passSymbols = charsCaps + chars + numeros + symbols;
        Random rnd = new Random();
        char[] password = new char[len];
        for(int i = 0; i < len; i++){
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }
        return password;
    }
}
