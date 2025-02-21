package Lista03;

public class Questao4 {
    public static void main(String[] args) {
        int altura = 12;

        for (int copa = 0; copa < altura; copa++){
            for (int espaco = 0; espaco < altura - copa - 1; espaco++){
                System.out.print(" ");
            } for (int asterisco = 0; asterisco < 2 * copa + 1; asterisco++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
