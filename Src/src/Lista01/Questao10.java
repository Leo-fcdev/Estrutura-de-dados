package Lista01;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a área em metros² que deseja pintar: ");
        float area = sc.nextFloat();

        float litroNeces = area / 6;
        System.out.printf("São necessarios %.2f" , litroNeces);
        System.out.println(" litros para pintar essa area");

        //Situação A
        int lata = (int) Math.ceil(litroNeces / 18);
        float precoLata = lata * 80;

        //Situação B
        int galao = (int) Math.ceil(litroNeces / 3.6F);
        float precoGalao = galao * 25;

        //Situação C
        int misturaLata = (int) Math.ceil(litroNeces / 18);
        float resto = litroNeces - (misturaLata * 18);
        int misturaGalao = (int) Math.ceil(resto / 3.6F);
        float precoMistura = (misturaLata * 80) + (misturaGalao * 25);
        litroNeces *= 1.1F;


        System.out.printf("Comprando apenas latas o valor será de R$ %.2f \n" , precoLata);
        System.out.printf("Comprando apenas galões o valor será de R$ %.2f \n" , precoGalao);
        System.out.printf("Misturando latas e galões o valor será de R$ %.2f \n" , precoMistura);
    }
}
/* Uma loja de tintas deseja informar para os clientes o melhor custo-benefício na compra de suas
tintas. Você foi contratado para desenvolver um programa que deverá pedir o tamanho em
metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6
metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00. Informe ao usuário as quantidades de tinta a serem
compradas e os respectivos preços em 3 situações:
a. comprar apenas latas de 18 litros;
b. comprar apenas galões de 3,6 litros;
c. misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10%
de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
*/