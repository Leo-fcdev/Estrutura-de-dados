package Lista02;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){
        float frente, fundo, ladoesq, ladodir, perimetro;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o tamanho em metro da frente do terreno: ");
        frente = scanner.nextFloat();

        System.out.println("Qual o tamanho em metros do fundo do terreno: ");
        fundo = scanner.nextFloat();

        System.out.println("Qual o tamanho em metros do lado esquerdo do terreno: ");
        ladoesq = scanner.nextFloat();

        System.out.println("Qual o tamanho em metros do lado direito do terreno: ");
        ladodir = scanner.nextFloat();

        perimetro = frente + fundo + ladodir + ladoesq;

        System.out.println("O perimetro do terreno é de " + perimetro + " metros");

    }
}
