import java.util.Scanner;

public class DistanciaCarros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int km = sc.nextInt();
        int tempo_distancia = 60/30;
        int tempo = km*tempo_distancia;

        System.out.println(tempo+" minutos");

        sc.close();
    }
}
