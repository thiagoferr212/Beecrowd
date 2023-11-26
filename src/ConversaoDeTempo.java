import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoEmSegundos = sc.nextInt();
        int segundos = tempoEmSegundos % 60;
        int minutos = (tempoEmSegundos/60) % 60;
        int horas = (tempoEmSegundos/60) / 60;

        System.out.printf("%d:%d:%d\n",horas,minutos,segundos);

        sc.close();
    }
    
}
