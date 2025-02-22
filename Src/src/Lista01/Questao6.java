package Lista01;

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
/* O Bar do Boca é um bar conhecido na sua cidade. Todas as sextas-feiras, o bar tem música ao vivo
e um novo cardápio a cada mês. O dono do bar, Boca, não sabe mais o que fazer com as contas
que são fechadas erradas, pois os garçons esquecem de adicionar a taxa de couvert ou esquecem
que a gorjeta sai de 10% para 20%. Você que conhece o Boca há muito tempo resolveu ajudá-lo.
Você vai fazer um programa que ler o total da conta e acrescenta 20% da gorjeta e a taxa fixa do
couvert */