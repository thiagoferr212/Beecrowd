import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double KmPorL = 12.00;
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double total = (tempo * velocidade)/KmPorL;

        System.out.printf("%.3f\n",total);

        sc.close();
    }
    
}
