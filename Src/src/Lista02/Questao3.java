package Lista02;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de dedos do jogador 1: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o número de dedos do jogador 2: ");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;

        if (soma % 2 == 0){
            System.out.println("Esse número é par ");
        } else {
            System.out.println("Esse número é ímpar");
        }
    }
}