package Lista02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao2 {
    public static void main(String[] args) {

        float peso, altura, resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu peso? ");
        peso = scanner.nextFloat();

        System.out.println("Qual sua altura? ");
        altura = scanner.nextFloat();

        resultado = peso / (altura * altura);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Seu Imc é de: " + df.format(resultado));

        if(resultado < 18.5){
            System.out.println("Você está abaixo do peso ideal");
        }
        else if((resultado >= 18.5) && (resultado <= 24.9)){
            System.out.println("Você está no peso normal");
        }
        else if((resultado >= 25.0) && (resultado <= 29.9)){
            System.out.println("Você está acima do peso");
        }
        else if((resultado >= 30.0) && (resultado <= 34.9)){
            System.out.println("Você está com obesidade grau I");
        }
        else if((resultado >= 35.0) && (resultado <= 39.9)){
            System.out.println("Você está com obesidade grau II");
        }
        else{
            System.out.println("Você está com obesidade grau III");
        }


    }
}
