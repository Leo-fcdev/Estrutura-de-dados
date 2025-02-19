package Lista02;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatira atual em graus celsius: ");
        int temp = scanner.nextInt();

        if (temp < 17){
            System.out.println("Frio da molestia");
        }

        else {
            System.out.println("Tudo normal nas terras de Cuçumarim");
        }

    }
}