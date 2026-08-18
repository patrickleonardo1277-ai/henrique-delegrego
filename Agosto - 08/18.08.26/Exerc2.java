import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha abaixo uma opção de aluno para verificar seus detalhes:");
        System.out.println("1-Diogo.");
        System.out.println("2-Eduardo.");
        System.out.println("3-Henrique.");
        System.out.println("Informe somente o numero.");
        int opcao = leitor.nextInt();

        if (opcao == 1){
            imprimirDiogo();
        } else if (opcao == 2) {
            imprimirEduardo();
        }else {
            imprimirHenrique();
        }

    }
    public static void imprimirDiogo(){
        System.out.println("O Diogo é um estudante de Desenvolvimento de sistemas.");
        System.out.println("Ele tem 23 anos.");
        System.out.println("Diogo é natural de Blumenau-SC.");
    }
    public static void imprimirEduardo(){
        System.out.println("O Edurado é um estudante de Desenvolvimento de sistemas.");
        System.out.println("Mas já estudou outros cursos no Senai.");
        System.out.println("Ele tem 22 anos.");
        System.out.println("Eduardo é natural de Blumenau-SC.");
    }
    public static void imprimirHenrique(){
        System.out.println("O Henrique é um estudante de Desenvolvimento de sistemas.");
        System.out.println("Ele tem 16 anos.");
        System.out.println("Henrique é natural de Blumenau-SC.");
    }
}
