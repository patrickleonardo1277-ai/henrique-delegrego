import java.util.Scanner;

public class Exerc4 {

    public static void maior(int[] vetor){
        int maior = vetor[0];

        for (int i=1; i< vetor.length; i++){
            if (vetor[i]>maior){
                maior=vetor[i];
            }
        }

    }

    public static void menor(int [] vetor) {
        int menor = vetor[0];

        for (int i=1; i< vetor.length; i++){
            if (vetor[i]<menor){
                menor=vetor[i];
            }
        }

    }
    public static void media(int[] vetor){
        int soma = 0;

        for(int i=0; i< vetor.length; i++){
            soma+=vetor[i];
        }
    }
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];

        for(int i=0; i< vetor.length; i++) {
            System.out.println("Digite o " +(i+1)+ " ° número:");
            vetor[i] = leitor.nextInt();
        }

        System.out.println("Maior número:" + maior(vetor));
        System.out.println("Menor número:" + menor(vetor));
        System.out.println("Média: %.2f%n", media(vetor));


    }
}
