package Lista01;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você pretende levar em reais? ");
        float reais;
        reais = scanner.nextFloat();

        float dolarUsa, dolarCan, pesoArg, euro;

        dolarUsa = reais / 5.76F;
        dolarCan = reais / 4.05F;
        euro = reais / 5.98F;
        pesoArg = reais * 182.89F;


        System.out.printf("Em Dolares Americanos esse valor será equivalente à  %.2f \n", dolarUsa);
        System.out.printf("Em Dolares Canadenses esse valor será equivalente à %.2f \n", dolarCan);
        System.out.printf("Em Euros esse valor será equivalente à %.2f\n", euro);
        System.out.printf("Em Pesos Argentinos esse valor será equivalente à %.2f \n", pesoArg);

    }
}

/* Você quer viajar para fora do Brasil, mas ainda não escolheu o seu destino. Você está em dúvida
entre Europa, Canadá, Estados Unidos e Argentina. Você sabe que as moedas nessas regiões são:
euro, dólar canadense, dólar americano, peso argentino. Você queria um programa que você
desse o valor que deseja levar e as cotações do dia de cada moeda e imprimisse quanto em cada
moeda você teria. Então, resolveu que faria esse programa para você e sua mãe verem quanto de
dinheiro teriam em cada região */