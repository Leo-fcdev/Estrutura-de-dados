package Lista04;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] linha = new String[10];
         
        for (int i = 0; i < 10; i++){
            System.out.println("Escreva a " + (i + 1) + "º linha da sua musica preferida:");
            linha[i] = sc.nextLine();
         }

        for (int c = 9; c >= 0; c--){
            System.out.println("Letra da musica em ordem inversa: " + linha[c]);
        }
    }
}
