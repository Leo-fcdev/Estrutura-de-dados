package Lista04;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] preco = new double[10];

            for (int i= 0; i < 10; i++){
                System.out.println("Digite o preço do produto: ");
                preco[i] = sc.nextDouble();
            }
    }
}
