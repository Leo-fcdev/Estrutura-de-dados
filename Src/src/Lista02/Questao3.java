package Lista02;

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

