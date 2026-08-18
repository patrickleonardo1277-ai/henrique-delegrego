import java.util.Scanner;

public class Exerc4 {

    public static void maior(int vetor[]){
        int maior = Integer.MIN_VALUE;

        for (int i=0; i< vetor.length; i++){
            if (vetor[i]>maior){
                maior=vetor[i];
            }
        }
        System.out.println("O maior valor é: " + maior);

    }

    public static void menor(int vetor[]) {
        int menor = Integer.MAX_VALUE;

        for (int i=0; i< vetor.length; i++){
            if (vetor[i]<menor){
                menor=vetor[i];
            }
        }
        System.out.println("O menor valor é: " + menor);

    }
    public static void media(int vetor[]){
        double soma = 0;

        for(int i=0; i< vetor.length; i++){
            soma+=vetor[i];
        }

        double media = soma / vetor.length;
        System.out.println("A média dos valores é: " + media);
    }
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int vetor[] = {1, 2, 3, 4, 5};

        maior(vetor);
        menor(vetor);
        media(vetor);



    }
}
