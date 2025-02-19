package Lista02;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota das sua 3 avaliações: ");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("Você foi aprovado.");
        } else {
            System.out.println("Você foi reprovado. ");
        }
    }
}