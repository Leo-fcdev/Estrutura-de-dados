package Lista01;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        float comprimento, largura, area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o comprimento do terreno em metro: ");
        comprimento = scanner.nextFloat();

        System.out.println("Qual a largura do terreno em metros: ");
        largura = scanner.nextFloat();

        area = comprimento * largura;
        System.out.println("A area do terreno é de " + area + " metros quadrados");

    }
}

/* Maria trabalha para uma construtora no setor de vendas. Constantemente, ela tem que calcular a
área dos terrenos vendidos. Como Maria é sua amiga há muito tempo, você resolveu ajudá-la
criando um programa que lê o comprimento e a largura e imprime a área total do terreno em
metros quadrados */