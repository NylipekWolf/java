import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int aluno;
        double nota;
        double nota2;
        double media;

        System.out.println("Bem-vindo ao sistema da escola, qual classe você é :" +
        "\n1=A"+
        "\n2=B"+
        "\n3=C");
        int escolha = sc.nextInt();

        switch(escolha){
            case 1:
            System.out.println("Qual dos alunos dos 30 alunos da turma" + escolha + " você é :");
            aluno = sc.nextInt();

            while(aluno < 1 || aluno > 30){
                System.err.println("voce errou o numero, tente novamente");
                aluno = sc.nextInt();
            }

            System.out.println("Opa, ola aluno " + aluno + " estamos aqui para ver sua media" +
            "\nQual foi a sua nota na primeira prova :");
            nota = sc.nextDouble();
            while(nota < 1 || nota > 10){
                System.err.println("voce errou o numero, tente novamente");
                nota = sc.nextInt();
            }

            System.out.println("Ok, agora insira a sua segunda nota :");
            nota2 = sc.nextDouble();
            while(nota2 < 1 || nota2 > 10){
                System.err.println("voce errou o numero, tente novamente");
                nota2 = sc.nextInt();
            }
            media = nota = nota2;
            System.out.println(aluno + " a sua media foi : " + media);
            break;

            case 2:
            System.out.println("Qual dos alunos dos 30 alunos da turma" + escolha + " você é :");
            aluno = sc.nextInt();

            while(aluno < 1 || aluno > 30){
                System.err.println("voce errou o numero, tente novamente");
                aluno = sc.nextInt();
            }

            System.out.println("Opa, ola aluno " + aluno + " estamos aqui para ver sua media" +
            "\nQual foi a sua nota na primeira prova :");
            nota = sc.nextDouble();
            while(nota < 1 || nota > 10){
                System.err.println("voce errou o numero, tente novamente");
                nota = sc.nextInt();
            }

            System.out.println("Ok, agora insira a sua segunda nota :");
            nota2 = sc.nextDouble();
            while(nota2 < 1 || nota2 > 10){
                System.err.println("voce errou o numero, tente novamente");
                nota2 = sc.nextInt();
            }

             media = nota = nota2;
            System.out.println(aluno + " a sua media foi : " + media);
            break;

            case 3:
            System.out.println("Qual dos alunos dos 30 alunos da turma" + escolha + " você é :");
            aluno = sc.nextInt();

            while(aluno < 1 || aluno > 30){
                System.err.println("voce errou o numero, tente novamente");
                aluno = sc.nextInt();
            }

            System.out.println("Opa, ola aluno " + aluno + " estamos aqui para ver sua media" +
            "\nQual foi a sua nota na primeira prova :");
            nota = sc.nextDouble();
            while(nota < 1 || nota > 10){
                System.err.println("voce errou o numero, tente novamente");
                nota = sc.nextInt();
            }

            System.out.println("Ok, agora insira a sua segunda nota :");
            nota2 = sc.nextDouble();
            while(nota2 < 1 || nota2 > 10){
                System.err.println("voce errou o numero, tente novamente");
                nota2 = sc.nextInt();
            }

            media = nota = nota2;
            System.out.println(aluno + " a sua media foi : " + media);
            break;
        }
        sc.close();
    }
}
