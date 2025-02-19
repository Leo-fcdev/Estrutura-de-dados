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
