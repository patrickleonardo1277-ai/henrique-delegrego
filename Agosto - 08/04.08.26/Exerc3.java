import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double imc;

        System.out.println("Informe o seu peso:");
        double peso = leitor.nextDouble();
        System.out.println("Informe a sua altura:");
        double altura = leitor.nextDouble();

        imc = peso/(altura*altura);

        if (imc < 18.5){
            System.out.println("Magreza");
        }
        if (imc > 18.5){
            System.out.println("Saudável");
        }
        if (imc > 25){
            System.out.println("SobrePeso");
        }
        if (imc > 30){
            System.out.println("Obesidade Grau I");
        }
        if (imc > 35){
            System.out.println("Obesidade Grau II (severo)");
        }
        if (imc > 40){
            System.out.println("Obesidade Grau III (morbida)");
        }

    }
}
