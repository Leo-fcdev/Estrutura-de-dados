package Lista02;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        float valorCompra = scanner.nextFloat();
        float desconto = 0;

        if (valorCompra >= 0 && valorCompra < 50){
            desconto = 0.05F;
        } else if (valorCompra > 50 && valorCompra < 100){
            desconto = 0.10F;
        } else if (valorCompra > 100 && valorCompra < 200) {
            desconto = 0.20F;
        } else if (valorCompra > 200 && valorCompra < 500) {
            desconto = 0.25F;
        } else if (valorCompra >= 500) {
            desconto = 0.30F;
        } else {
            System.out.println("Valor inválido");
        }

        float finalCompra = valorCompra * (1 - desconto);
        System.out.printf("Valor total da compra após o desconto: R$ %.2f%n", finalCompra);
    }
}