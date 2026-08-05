import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double sal_total;

        System.out.println("Vendedor, informe seu nome:");
        String nome = leitor.next();
        System.out.println("Informe o seu salário fixo:");
        double sal_fixo = leitor.nextDouble();
        System.out.println("Informe o valor de suas vendas no mês");
        double vendas = leitor.nextDouble();

        sal_total = (vendas * 0.15) + sal_fixo;

        System.out.println("Vendedor: " + nome);
        System.out.printf("Salário Total: R$ %.2f%n" , sal_total);
    }
}
