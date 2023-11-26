import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int km = sc.nextInt();
        double l = sc.nextDouble();
        double consumo = km/l;

        System.out.printf("%.3f km/l\n", consumo);

        sc.close();
    }
    
}
