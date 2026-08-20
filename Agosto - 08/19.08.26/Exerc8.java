import java.util.Scanner;

public class Exerc8 {

    public static double Notas(double nota1, double nota2, double nota3){
        double media = (nota1 + nota2 + nota3)/3;
        return media;
    }

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a primiera nota:");
        double nota1 = leitor.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = leitor.nextDouble();
        System.out.println("Informe a terceira nota:");
        double nota3 = leitor.nextDouble();

        double resultado = Notas(nota1, nota2, nota3);
        System.out.println("Média é : " + resultado);
    }
}
