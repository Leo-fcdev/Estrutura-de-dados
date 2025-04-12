package Lista02;

import java.util.Random;


public class Questao8 {
    public static void main(String[] args) {
        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        System.out.print("O jogador 1 tirou um " + dado1);
        System.out.println(" e o jogador 2 tirou um " + dado2);

        if (dado1 > dado2){
            System.out.println("O jogador 1 pode andar " + dado1 + " casas");
        } else if (dado1 < dado2) {
            System.out.println("O jogador 2 pode andar " + dado2 + " casas");
        }else {
            System.out.println("Os jogadores não podem andar");
        }
    }
}
