package Lista02;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Qual número você acha que é o sucessor desse número: ");
        int suposto = scanner.nextInt();

        int sucessor = numero + 1;

        if (suposto == numero + 1){
            System.out.println("O número " + suposto + " é sucessor de " + numero);
        }

        else {
            System.out.println("O número " + suposto + " não é sucessor de " + numero);
        }
    }
}