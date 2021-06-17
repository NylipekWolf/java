import java.util.*;
public class cronometro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for(int x=0; x<=24; x++){
            for(int y=0; y<=60; y++){
                System.out.println(x + " : " + y);
            }
        }
        sc.close();
    }
}
