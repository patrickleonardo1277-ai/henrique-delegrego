import java.util.Scanner;

public class Exerc4_1 {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o número de inscrição");
        String numIncricao = leitor.next();
        System.out.println("Insira a sua altura");
        double altura = leitor.nextDouble();

        double alturaMaisBaixa = 0;
        double alturaMaisAlta = 0;
        String incricaoMaisAlta = "";
        String incricaoMaisBaixa = "";

        while (!numIncricao.equals("0")) {
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                incricaoMaisAlta = numIncricao;
            }
            if (altura < alturaMaisBaixa) {
                alturaMaisBaixa = altura;
                incricaoMaisBaixa = numIncricao;
            }
        }
        System.out.println("Atleta mais alto: " + );
    }
}
