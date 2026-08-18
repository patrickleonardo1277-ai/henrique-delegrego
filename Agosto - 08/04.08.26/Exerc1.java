import java.util.Scanner;
import java.util.Locale;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Locale.setDefault(new Locale("pt", "BR"));
        double salario_total;

        System.out.println("Informe o número da sua matrícula:");
        String matricula = leitor.next();
        System.out.println("Informe seu nome:");
        String nome = leitor.next();
        System.out.println("Informe a quantidade de horas trabalhadas na semana:");
        double horas_trab = leitor.nextDouble();
        System.out.println("Informe o valor pago por cada hora trabalhada:");
        double valor = leitor.nextDouble();

        salario_total = (horas_trab * valor) * 4;

        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario_total);
    }
}
