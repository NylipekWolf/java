public class Aula2 {
        public static void main(String[] args) {  
            
            //Primeria Linha em Java
            System.out.println("Ola voce!");
            
            //Texto em Java
            String nome = "Arlete";
            System.out.println(nome);
            
            //Números em Java
            int numero = 24 * 8 * (20 * 20/2) + 12 * 12/55;
            System.out.println(numero);
            
            System.out.println(nome + " " + numero + "!");	  
            //Condicionais em Java
            if (45 > 18) {
              System.out.println("45 é maior que 18");
            } else {
              System.out.println("Nunca vou chegar aqui");
            }			
            
            //Escolha... Caso
            int hoje = 1;
          
            switch (hoje) {
            case 1:
              System.out.println("Segunda");
              break;
            case 2:
              System.out.println("Terça");
              break;
            case 3:
              System.out.println("Quarta");
              break;
            case 4:
              System.out.println("Quinta");
              break;
            case 5:
              System.out.println("Sexta");
              break;
            case 6:
              System.out.println("Sábado");
              break;
            case 7:
              System.out.println("Domingo");
              break;
              
          }
        }
}
