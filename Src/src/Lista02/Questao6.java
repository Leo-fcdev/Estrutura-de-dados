package Lista02;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        float conta, taxaAdc = 30, resultado, total;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor da conta: ");
        conta = scanner.nextFloat();

        resultado = (conta * taxaAdc) / 100;

        System.out.printf("A gorjeta e taxa de couvert será de: R$%.2f \n" , resultado);

        total = resultado + conta;

        System.out.printf("Adicionando a sua conta ficará: R$%.2f\n" , total);





    }
}
