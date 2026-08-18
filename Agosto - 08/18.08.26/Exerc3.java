import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número:");
        int numero = leitor.nextInt();
        mostrarNumero(numero);
    }
    public static void mostrarNumero(int numero){
        for (int i = numero; i <= numero + 20; i++){
            System.out.println(i);
        }
    }
}
