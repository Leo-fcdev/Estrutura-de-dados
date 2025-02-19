package Lista02;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o gênero do cliente: ");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("Qual o horário de chegada? ");
        int horario = scanner.nextInt();
        float ingresso = 60.0F;

        if (sexo == 'F' && horario < 22){
            ingresso = 0;
            System.out.println("Sua entrada é gratuita ");
        } else if (sexo == 'F' && horario > 22){
            ingresso = ingresso / 2;
            System.out.println("Seu ingresso custará: R$ " + ingresso);
        } else if (sexo == 'M' && horario < 22) {
            ingresso = ingresso * 0.7F;
            System.out.println("Seu ingresso custará: R$ " + ingresso);
        } else if (sexo == 'M' && horario > 22) {
            System.out.println("Seu ingresso custará: R$ " + ingresso);
        } else {
            System.out.println("Dados invalidos");
        }
    }
}
