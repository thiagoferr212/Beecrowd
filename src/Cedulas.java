import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dinheiro = sc.nextInt();

        if(dinheiro > 0 && dinheiro < 1000000){
            int nota100 = dinheiro / 100;
            dinheiro %= 100;
            System.out.println(nota100 + " nota(s) de R$ 100,00");
            int nota50 = dinheiro / 50;
            dinheiro %= 50;
            System.out.println(nota50 + " nota(s) de R$ 50,00");
            int nota20 = dinheiro / 20;
            dinheiro %= 20;
            System.out.println(nota20 + " nota(s) de R$ 20,00");
            int nota10 = dinheiro / 10;
            dinheiro %= 10;
            System.out.println(nota10 + " nota(s) de R$ 10,00");
            int nota5 = dinheiro / 5;
            dinheiro %= 5;
            System.out.println(nota5 + " nota(s) de R$ 5,00");
            int nota2 = dinheiro / 2;
            dinheiro %= 2;
            System.out.println(nota2 + " nota(s) de R$ 2,00");
            int nota1 = dinheiro / 1;
            dinheiro %= 1;
            System.out.println(nota1 + " nota(s) de R$ 1,00");
        }

        sc.close();
    }

}
