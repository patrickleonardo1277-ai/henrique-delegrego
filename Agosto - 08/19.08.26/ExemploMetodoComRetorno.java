public class ExemploMetodoComRetorno {

    public static double SomarNumero(int num1, int num2){
        double soma = num1 + num2;
        return soma;
    }

    public static void main(String[] args){
        System.out.println(SomarNumero(10, 2));
    }
}
