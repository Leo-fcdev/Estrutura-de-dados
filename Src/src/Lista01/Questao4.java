package Lista01;

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
/* Maria amou o programa que você fez para ela de calcular a área dos terrenos, mas ela possui outro
grande problema: alguns terrenos não possuem lados uniformes, assim, ela precisa, muitas vezes,
informar, além da área, o perímetro do terreno. Ela confirmou a você que todos os terrenos só
possuem quatro lados. Você sabe que para calcular o perímetro do terreno basta somar todos os
lados. Dessa forma, você confirmou a ela que faria esse programa de calcular perímetro */