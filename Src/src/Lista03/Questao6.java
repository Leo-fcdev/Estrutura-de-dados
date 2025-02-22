package Lista03;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        float precoTotal = 0, precoProduto = 1;

        Scanner sc = new Scanner(System.in);

        while (precoProduto > 0){
            System.out.println("Digite o valor do produto: ");
            precoProduto = sc.nextFloat();
            precoTotal = precoProduto + precoTotal;
        }
        System.out.printf("O total da compra é de R$ %.2f" , precoTotal);
    }
}
