package lista03;
import java.util.Scanner;

public class Exer01 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        double numeroA, numeroB, divisao;

        System.out.print("Informe o primeiro número para divisão: ");
        numeroA = input.nextDouble();

        System.out.print("Informe o segundo número para divisão: ");
        numeroB = input.nextDouble();

        divisao = numeroA / numeroB;

        System.out.print("O resultado da divisão é: " + divisao);

        input.close();
    }
}
