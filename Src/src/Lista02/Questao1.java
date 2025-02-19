package Lista02;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        double preco, resultado;
        int quantidade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        preco = scanner.nextDouble();

        System.out.println("Quantidade do produro: ");
        quantidade = scanner.nextInt();

        resultado = preco * quantidade;
        System.out.println("Sua compra deu R$ " + resultado);

    }

}

