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
