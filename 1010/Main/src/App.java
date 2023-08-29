import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor 
 *      unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário 
 *      de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int cod1, cod2, nump1, nump2; 
        double val1, val2, total;

        Scanner ler = new Scanner(System.in);

        cod1 = ler.nextInt();
        nump1 = ler.nextInt();
        val1 = ler.nextDouble();

        cod2 = ler.nextInt();
        nump2 = ler.nextInt();
        val2 = ler.nextDouble();

        total = (val1 * nump1) + (val2 * nump2);

    System.out.printf("VALOR A PAGAR: R$ %.2f", total);

    }
 
}