import java.util.*;
public class cinemaTeste {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int fileira;
		int especial;
		int qntEspeciais;
		int qntIngressos;
		int continuar = 1;

        int FileiraAlpha_1Es = 12;
        int	FileiraAlpha_1   = 10;
    	int	FileiraAlpha_2   = 26;
        int	FileiraAlpha_3   = 26;
        int	FileiraAlpha_4   = 26;		
		int	FileiraAlpha_5   = 26;
		int	FileiraAlpha_6   = 26;

        int FileiraBeta_1Es = 6;
        int	FileiraBeta_1   = 18;
    	int	FileiraBeta_2   = 25;
        int	FileiraBeta_3   = 25;
        int	FileiraBeta_4   = 25;		
		int	FileiraBeta_5   = 25;

        while(continuar == 1){
            System.out.println("\n Bem vindo ao cinema Jaison"+
            "\nQual seria o seu nome de usuario?");
			String nome = sc.nextLine();	

			System.out.println("\n\nEntao " + nome + " hoje no cinema Jaison temos 2 filmes em sessão hoje"+
			"\n\nAs branquelas sendo exibido na sala Alpha"+
			"\nA Chegada sendo exibido na sala Beta"+
			"\n\nQual filme voce ira querer assistir?"+
			"\nDigite:"+
			"\n1 = As branquelas"+
			"\n2 = A chegada");
			int escolha = sc.nextInt();

            switch(escolha){
                case 1:
                System.out.println("ok vamos continuar" +
                "\nvocê possue alguma necessidade especial?"+
                "\n1 = Sim"+
                "\n2 = Não");
                especial = sc.nextInt(); 

                if(especial == 1){
                    System.out.println("Na fileira de especiais temos no total de " +
                    FileiraAlpha_1Es + " lugares."+
                    "\nQuantos ingressos seriam ?");
                    qntEspeciais = sc.nextInt();

                    while (FileiraAlpha_1Es < qntEspeciais){
                        System.out.println("Não temos a quantidades de lugares disponível" +
                        "\nNos temos apenas "+ FileiraAlpha_1Es + " lugares."+
                        "\nQuantos ingressos seriam ?");
                        qntEspeciais = sc.nextInt();
                    }   
                }
                else{
                    System.out.println("Quanto ingressos ira comprar?");
					qntIngressos = sc.nextInt();

                    System.out.println("\nEm qual fileira deseja ? "+ 
				    "\n1 = A"+
				    "\n2 = B"+
				    "\n3 = C"+
				    "\n4 = D"+
					"\n5 = E"+
					"\n6 = F"); 
					fileira = sc.nextInt();

                    switch(fileira){
                        case 1:
                        if(qntIngressos >= 10){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira A tem 10 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                        }
                        else{
                            FileiraAlpha_1 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira A para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;
                        
                        case 2:
                        if(qntIngressos >= 26){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira A tem 26 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira B para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraAlpha_2 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira B para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;

                        case 3:
                        if(qntIngressos >= 26){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira A tem 26 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira C para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraAlpha_4 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira C para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;

                        case 4:
                        if(qntIngressos >= 26){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira A tem 26 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira D para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraAlpha_4 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira D para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;

                        case 5:
                        if(qntIngressos >= 26){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira A tem 26 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira E para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraAlpha_5 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira E para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;

                        case 6:
                        if(qntIngressos >= 26){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira A tem 26 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira F para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraAlpha_6 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira F para o filme As branquelas" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;
                    }
                }
                break;
                case 2:
                System.out.println("ok vamos continuar" +
                "\nvocê possue alguma necessidade especial?"+
                "\n1 = Sim"+
                "\n2 = Não");
                especial = sc.nextInt(); 

                if(especial == 1){
                    System.out.println("Na fileira de especiais temos no total de " +
                    FileiraBeta_1Es + " lugares."+
                    "\nQuantos ingressos seriam ?");
                    qntEspeciais = sc.nextInt();

                    while (FileiraBeta_1Es < qntEspeciais){
                        System.out.println("Não temos a quantidades de lugares disponível" +
                        "\nNos temos apenas "+ FileiraBeta_1Es + " lugares."+
                        "\nQuantos ingressos seriam ?");
                        qntEspeciais = sc.nextInt();
                    }   
                }
                else{
                    System.out.println("Quanto ingressos ira comprar?");
					qntIngressos = sc.nextInt();

                    System.out.println("\nEm qual fileira deseja ? "+ 
				    "\n1 = A"+
				    "\n2 = B"+
				    "\n3 = C"+
				    "\n4 = D"+
					"\n5 = E"); 
					fileira = sc.nextInt();

                    switch(fileira){
                        case 1:
                        if(qntIngressos >= 18){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira A tem 18 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira A para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraBeta_1 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira A para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;
                        
                        case 2:
                        if(qntIngressos >= 25){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira B tem 25 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira B para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraBeta_2 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira B para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;

                        case 3:
                        if(qntIngressos >= 25){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira C tem 25 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira C para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraBeta_3 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira C para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;

                        case 4:
                        if(qntIngressos >= 25){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira D tem 25 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira D para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraBeta_4 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira D para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;

                        case 5:
                        if(qntIngressos >= 25){
                            System.out.println("Nao possuímos lugares o suficiente na fileira escolhida " +
                            "tente novamente."+
                            "\n fileira E tem 25 lugares disponíveis");
                            qntIngressos = sc.nextInt();
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira E para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        else{
                            FileiraBeta_5 = qntIngressos;
                            System.out.println("Compra realizada com sucesso!"+
                            "\nVocê comprou " + qntIngressos + " ingressos na fileira E para o filme A Chegada" +
                            "\nTenha um otimo filme, esperamos a sua volta senhor(a) " + nome + ".");
                        }
                        break;
                    }
                }    
            }
            System.out.println("\nDeseja continuar executando o programa? (1 = sim / 2 = nao)");
            continuar = sc.nextInt();
        }
        sc.close();
    }
}