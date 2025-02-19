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
