package Lista01;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        float preco1, preco2, preco3, preco4, preco5, media;
        String produto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o produto que deseja ver a media: ");
        produto = scanner.nextLine();

        System.out.println("Digite o valor desse produto em 5 mercados diferentes: ");
        preco1 = scanner.nextFloat();
        preco2 = scanner.nextFloat();
        preco3 = scanner.nextFloat();
        preco4 = scanner.nextFloat();
        preco5 = scanner.nextFloat();

        media = (preco1 + preco2 + preco3 + preco4 + preco5) / 5;

        System.out.print("A media de preço do " + produto);
        System.out.printf(" é de R$%.2f" , media);
    }
}

/* O IBGE (Instituto Brasileiro de Geografia e Estatística) para definir um preço médio de um produto
alimentar, por exemplo: o feijão, faz consulta a pelo menos 5 mercados de tamanhos variados.
Após ler os valores dos 5 mercados, o instituto calcula o valor médio do produto. Diferente do que
era praticado antes, atualmente, o IBGE utiliza um pequeno sistema para computar o preço
médio. Você está trabalhando na equipe de TI do IBGE para calcular o preço médio dos produtos.
Lembre-se de ler os cinco preços, calcular a média e exibir o resultado */