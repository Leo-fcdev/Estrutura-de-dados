package Lista02;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço de um produto: ");
        float preco1 = sc.nextFloat();

        System.out.println("Digite o preço de um produto: ");
        float preco2 = sc.nextFloat();

        System.out.println("Digite o preço de um produto: ");
        float preco3 = sc.nextFloat();

        System.out.println("Digite o preço de um produto: ");
        float preco4 = sc.nextFloat();

        System.out.println("Digite o preço de um produto: ");
        float preco5 = sc.nextFloat();

        float media = (preco1 + preco2 + preco3 + preco4 + preco5) / 5;

        if (media < preco1){
            System.out.println("O primeiro preço está acima da média");
        }
        if (media < preco2){
            System.out.println("O segundo preço está acima da média");
        }
        if (media < preco3){
            System.out.println("O terceiro preço está acima da média");
        }
        if (media < preco4){
            System.out.println("O quarto preço está acima da média");
        }
        if (media < preco5){
            System.out.println("O quinto preço está acima da média");
        }

    }
}
