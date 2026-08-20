import java.util.Scanner;

public class Exerc7 {

    public static String ImprimirVerao(){

        return "É verão e está muito quente.";
    }
    public static String ImprimirPrimavera(){

        return "É primavera e o tempo está com sol entre nuvens.";
    }
    public static String ImprimirInverno(){

        return "É inverno e está muito frio.";
    }
    public static String ImprimirOutono(){

        return "É outono e o clima está chovendo.";
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("1 - Verão       |     2 - Primavera");
        System.out.println("3 - Inverno     |     4 - Outono");
        System.out.println("Informe apenas o número para ver sobre a estação:");
        String estacao = leitor.next();

        switch (estacao) {
            case ("1") -> System.out.println(ImprimirVerao());
            case ("2") -> System.out.println(ImprimirPrimavera());
            case ("3") -> System.out.println(ImprimirInverno());
            case ("4") -> System.out.println(ImprimirOutono());
        }

    }
}





