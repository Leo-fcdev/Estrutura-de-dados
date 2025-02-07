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
