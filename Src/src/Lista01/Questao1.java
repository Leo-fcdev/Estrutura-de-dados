package Lista01;

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
/* Você trabalha em um supermercado e no caixa que você trabalha o consumidor só pode comprar
um único produto, mesmo que várias unidades repetidas. Você deseja otimizar o seu trabalho e
criar um programa que leia o preço do produto e a quantidade de itens comprados e informe o
total da compra para o usuário */