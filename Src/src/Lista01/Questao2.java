package Lista01;

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

/* Você está começando na academia hoje e a sua instrutora fez um levantamento do seu biotipo,
além de outras informações suas. Ela para calcular o seu IMC (Índice de Massa Corporal), mediu o
seu peso e sua altura. Com essas informações em mãos, ela calculou o seu IMC usando a seguinte
fórmula: imc = peso / (altura * altura). Com o valor calculado, ela te apresentou a sua ficha de
acompanhamento. Você resolveu ajudar a sua instrutora e vai fazer um programa para calcular o
imc */