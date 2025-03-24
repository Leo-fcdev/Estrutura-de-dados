package Lista04;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] preco = new double[10];

        for (int i = 0; i < preco.length; i++) {
            System.out.println("Digite o preço do " + (i + 1) + "º produto:");
            preco[i] = sc.nextDouble();
        }

        double menorPreco = preco[0];
        int menorIndice = 0;

        for (int i = 0; i < preco.length; i++) {
            if (preco[i] < menorPreco) {
                menorPreco = preco[i];
                menorIndice = i;
            }
        }

        System.out.println("O menor preço lido pelo programa é: " + menorPreco);
        System.out.println("Esse foi o " + menorIndice + "º preço lido pelo programa.");

    }
    }