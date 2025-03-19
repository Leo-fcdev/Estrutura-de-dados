package Lista04;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        * [] vai armazenar uma certa quantidade de variaveis
        * como eu sei q tenho q armazenar 5 informações o "= new float[]"
        * eu coloco o valor de variaveis q eu quero
        */
        float[] dolar = new float[5];


        //Uso um for para repetir uma pergunta ao cliente
        for (int i = 0; i < 5; i++){
            System.out.println("Digite o preço do dolar na " + (i + 1) + "º casa de câmbio:  ");
            dolar[i] = sc.nextFloat();
        }

        /*
        * E esse for faz com q minha variavel preco acompanhe o vetor de dolar,
        * repetindo preco a msm quantidade de vezes que dolar
        */
        for (float preco : dolar){
            System.out.println("O preço do dolar nas casas de câmbio são respectivamente:\n" + preco);
        }
    }
}
