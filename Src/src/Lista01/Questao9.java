package Lista01;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        float distancia, tempo, velocidade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi a distância percorrida (em metros)? ");
        distancia = scanner.nextFloat();

        System.out.println("Em quanto tempo você percorreu essa distância (em segundos)? ");
        tempo = scanner.nextFloat();

        velocidade = distancia / tempo;

        System.out.println("Sua velocidade media é de: " + velocidade + " m/s");
    }
}
/* A sua professora de Física passou uma questão sobre velocidade média. Ela explicou que a
velocidade média de um corpo, por exemplo, um carro, é calculada dividindo a distância
percorrido (em metros) pela quantidade de tempo (em segundos).
Desse modo, a velocidade = distancia / tempo. Você que não é besta foi logo fazendo um
programa que calculasse a velocidade média, apenas lendo a distância percorrida e o tempo
gastado para percorrê-lo */