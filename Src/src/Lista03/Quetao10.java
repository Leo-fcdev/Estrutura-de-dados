package Lista03;

import java.util.Scanner;

public class Quetao10 {
    public static void main(String[] args) {
        float precoProduto, somaPreco = 0, media;

        Scanner sc = new Scanner(System.in);

        for (float produto = 1; produto < 6; produto++){
            System.out.println("Qual o valor do produto: ");
            precoProduto = sc.nextFloat();
            somaPreco += precoProduto;
        }
        media = somaPreco /6;
        System.out.printf("A media de preço desse produto é de R$ %.2f" , media);
    }
}
