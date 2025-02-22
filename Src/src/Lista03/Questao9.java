package Lista03;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int aluno = 1, totalAluno = 25;

       while (aluno <= totalAluno){
           int bimestre = 1;
           float somaNota = 0, media;

           System.out.println("Aluno " + aluno + ": ");

           while (bimestre <=4){
               System.out.println("Digite a nota do " + bimestre + "º bimestre: ");
               float nota = sc.nextFloat();
               somaNota += nota;
               bimestre++;
           }
           media = somaNota /4;
           System.out.printf("A media do aluno %d é %.2f \n" , aluno , media);
           System.out.println("-----------------------------");
           aluno++;
       }
    }
}

