import java.util.Scanner;

public class Exerc6 {

    public static String generateStarWarsName(String nomeCompleto,
                                              String sobrenomeMae,
                                              String cidadeNascimento) {

        String[] partesNome = nomeCompleto.split(" ");

        String nome = partesNome[0];
        String sobrenome = partesNome[partesNome.length - 1];

        String primeiroNomeStarWars =
                sobrenome.substring(0, 3) + nome.substring(0, 2);

        String sobrenomeStarWars =
                sobrenomeMae.substring(0, 2) + cidadeNascimento.substring(0, 3);

        return primeiroNomeStarWars + " " + sobrenomeStarWars;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = leitor.nextLine();

        System.out.print("Digite o sobrenome de solteira da sua mãe: ");
        String sobrenomeMae = leitor.nextLine();

        System.out.print("Digite a cidade onde você nasceu: ");
        String cidadeNascimento = leitor.nextLine();

        String nomeStarWars = generateStarWarsName(
                nomeCompleto,
                sobrenomeMae,
                cidadeNascimento
        );

        System.out.println("Seu nome Star Wars é: " + nomeStarWars);

        leitor.close();
    }
}