package Lista03;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float somaNota = 0, media;
        int bimestre = 1;

        while (bimestre <= 4){
            System.out.println("Digite a nota do aluno do " + bimestre + "º bimestre: ");
            float nota = sc.nextFloat();
            somaNota = nota + somaNota;
            bimestre++;
        }
        media = somaNota / 4;
        System.out.printf("A media do aluno é: %.2f\n" , media);
    }
}
