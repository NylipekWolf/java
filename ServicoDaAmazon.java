import java.util.*;

public class ServicoDaAmazon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // quem tive uma sugestão, por favor venha falar comigo

        // sistema de compras
        int continuar = 1;
        int escolha;
        int array[] = new int[101];
        int compras = 0;
        int totalC;

        // livros
        double livros = 0;
        double it_a_coisa = 25.00;
        double eu_robo = 50.00;
        double coração_de_aço = 28.00;
        double o_hobbit = 34.89;
        double the_witcher = 45.90;
        double mitologia_nordica = 27.89;
        double o_alquimista = 15.90;
        double capitães_da_areia = 32.39;
        double eragon = 34.90;
        double mistborn = 21.90;

        // cadastro
        String usuário;
        int senha;
        String cpf;
        String email;
        int escolhaC;
        int tentativas = 3;

        System.out.println("Bem-vindo a area de livros da Amazon"
                + "\nAqui na parte de livros temos os seguintes livros na promoção, todos por 20 reais");

        while (continuar == 1) {

            System.out.println("\n1 = It a coisa" + "\n2 = Eu robo" + "\n3 = Coração de aço" + "\n4 = O hobbit"
                    + "\n5 = The witcher" + "\n6 = Mitologia nórdica" + "\n7 = O alquimista" + "\n8 = Capitães da areia"
                    + "\n9 = Eragon " + "\n10 = Mistborn" + "\nQual seria da sua escolha :");
            escolha = sc.nextInt();

            if (escolha == 1) {
                livros += it_a_coisa;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 2) {
                livros += eu_robo;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 3) {
                livros += coração_de_aço;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 4) {
                livros += o_hobbit;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 5) {
                livros += the_witcher;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 6) {
                livros += mitologia_nordica;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 7) {
                livros += o_alquimista;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 8) {
                livros += capitães_da_areia;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 9) {
                livros += eragon;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }
            if (escolha == 10) {
                livros += mistborn;
                System.out.println("Sua compra foi realizada com sucesso");
                array[compras] = escolha;
                compras = compras + 1;
            }

            System.out.println(
                    "\nVocê deseja continuar a sua compras ou quer ir por carrinho ? (1 = comprar mais / 2 = carrinho)");
            continuar = sc.nextInt();

        }

        System.out.println("você ja tem cadastro ?" + "\n1 = sim" + "\n2 = não");
        escolhaC = sc.nextInt();

        totalC = compras;

        if (escolhaC == 1) {
            senha = 1234567890;
            while (tentativas > 0) {
                System.out.println("Digite o nome de usuário :");
                usuário = sc.next();
                System.out.println("Digite a sua senha :");
                senha = sc.nextInt();

                if (senha == 1234567890) {
                    System.out.println("senhor(a) " + usuário + "O seu carrinho deu o total de " + totalC
                            + " livros, e o preço de tudo foi : R$" + livros);
                    System.exit(0);
                } else {
                    System.out.print("Senha invalida\n");
                    tentativas -= 1;

                    if (tentativas > 0) {
                        System.out.print("\nVoce possui " + tentativas + " tentativa(s)\n");
                    } else {
                        System.out.print("\nSeu acesso foi bloqueado.");
                        System.out.print("\nPor favor, veja o seu Email.");
                    }
                }
            }

        } else {
            System.out.println("Ok, vamos fazer o seu cadastro então" + "\nDigite o seu nome de usuário :");
            usuário = sc.next();
            System.out.println("digite uma senha :");
            senha = sc.nextInt();
            System.out.println("O seu cpf :");
            cpf = sc.next();

            System.out.println("agora que você esta no sistema podemos continua");
            System.out.println("senhor(a) " + usuário + " O seu carrinho deu o total de " + totalC
                    + " livros, e o preço de tudo foi : R$" + livros);
        }

        sc.close();
    }

}
