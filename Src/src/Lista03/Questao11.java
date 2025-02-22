package Lista03;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        float precoKilo = 10, soma = 0, peso = 1;
        int contBagagem = 0;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite o peso da bagagem: ");
            peso = sc.nextFloat();
            if (peso == 0){
                break;
            }
            soma += peso;
            contBagagem++;
        }

        if (contBagagem > 0){
            float pesoMedia = soma / contBagagem;
            float precoBagagem = pesoMedia * precoKilo;

            System.out.printf("O peso medio da bagagem é %.2f e o preço é R$ %.2f" , pesoMedia, precoBagagem);
        } else {
            System.out.println("Nenhuma bagagem informada");
        }

    }
}
