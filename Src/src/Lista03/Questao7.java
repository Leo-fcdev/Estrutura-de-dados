package Lista03;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        int pontuacao = 0, pontuacaoFinal = 1;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite a pontuação do jogador: ");
            pontuacao = sc.nextInt();

            if (pontuacao < 0){
                break;
            }
            pontuacaoFinal = pontuacao + pontuacaoFinal;

        }
        System.out.println("A pontução do jogador é de: " + pontuacaoFinal);
    }
}
