import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println(" 1-Verão      |      3-Outono");
        System.out.println(" 2-Inverno    |      4-Primavera" );
        int opcao = leitor.nextInt();

        if (opcao == 1){
            imprimirVerao();
        } else if (opcao == 2) {
            imprimirInverno();
        } else if (opcao == 3) {
            imprimirOutono();
        }else {
            imprimirPrimavera();
        }
    }
    public static void imprimirVerao() {
        System.out.println("É verão");
        System.out.println("E o tempo está quente.");
    }
    public static void imprimirInverno (){
        System.out.println("É inverno");
        System.out.println("E o tempo está muito frio.");
    }
    public static void imprimirOutono (){
        System.out.println("É outono");
        System.out.println("E o tempo está ameno");
    }
    public static void imprimirPrimavera (){
        System.out.println("É primavera");
        System.out.println("E as flores estão desabrochando.");
    }
}
