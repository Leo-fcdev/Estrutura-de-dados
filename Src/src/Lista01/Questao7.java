package Lista01;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        float conta, resultado;
        int pessoas;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas estão consumiram (exceto o aniversariante): ");
        pessoas = scanner.nextInt();

        System.out.println("Quanto deu a conta: ");
        conta = scanner.nextFloat();

        resultado = conta / pessoas;
        System.out.printf("Cada um tem que pagar R$%.2f" , resultado);
    }
}
/* Você saiu com seus amigos para ir ao cinema. Depois de assistirem o filme, vocês foram para um
restaurante comemorar o aniversário de sua amiga, Alice. Na hora de pagar a conta, como sempre,
foi aquele furdunço, divide daqui, divide dali. Então, você pensou: vou fazer um programa para
calcular a conta por pessoa em um aniversário. Claro que a aniversariante não conta. Deste modo,
você faria um programa que lesse o total da conta, divide-a pelo número de pessoas na mesa,
menos o aniversariante. Depois, você só precisa exibir quanto cada um tem que pagar. */