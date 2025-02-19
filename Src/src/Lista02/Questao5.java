package Lista02;

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