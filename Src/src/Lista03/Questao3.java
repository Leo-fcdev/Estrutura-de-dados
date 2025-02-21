package Lista03;

public class Questao3 {
    public static void main(String[] args) {
// numero
        for(int numero = 1; numero <= 10; numero ++){
            System.out.println("Tabuada do " + numero + ":");

            //multiplicador
            for (int multiplicador = 1; multiplicador <= 10; multiplicador ++){
                System.out.println(numero + " + " + multiplicador + " = " + (numero + multiplicador));
            }
        }
    }
}
