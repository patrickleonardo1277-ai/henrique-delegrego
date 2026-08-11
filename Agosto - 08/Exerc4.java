import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int inscricao;
        int maiorInscricao = 0;
        int menorInscricao = 0;
        int quantidade = 0;

        double altura;
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturas = 0;
        double media;


        System.out.println("Informe o numero da sua inscrição (0 para finalizar):");
        inscricao = leitor.nextInt();

        while (inscricao != 0){
            System.out.println("Informe a sua altura:");
            altura = leitor.nextDouble();
            quantidade++;
            somaAlturas += altura;


            if (altura > maiorAltura) {
                maiorAltura = altura;
                maiorInscricao = inscricao;
            }


            if (altura < menorAltura) {
                menorAltura = altura;
                menorInscricao = inscricao;
            }

            System.out.print("Digite o número de inscrição (0 para encerrar): ");
            inscricao = leitor.nextInt();
        }

        if (quantidade > 0) {

            media = somaAlturas / quantidade;

            System.out.println("\n--- RESULTADO ---");
            System.out.println("Atleta mais alto:");
            System.out.println("Número de inscrição: " + maiorInscricao);
            System.out.println("Altura: " + maiorAltura);

            System.out.println("\nAtleta mais baixo:");
            System.out.println("Número de inscrição: " + menorInscricao);
            System.out.println("Altura: " + menorAltura);

            System.out.println("\nAltura média do grupo: " + media);
            System.out.println("Quantidade de atletas cadastrados: " + quantidade);

        } else {
            System.out.println("\nNenhum atleta foi cadastrado.");
        }

        leitor.close();
    }
}



