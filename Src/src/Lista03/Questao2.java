package Lista03;

public class Questao2 {
    public static void main(String[] args) {
        int par = 0, impar = 1;

        while (par <= 20 || impar <=20){
            System.out.println(par + " é par e " + impar + " é ímpar");
            par = (par + 2);
            impar = (impar + 2);
        }

    }
}
