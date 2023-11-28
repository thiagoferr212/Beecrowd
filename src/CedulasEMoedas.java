import java.util.Scanner;

public class CedulasEMoedas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dinheiro = sc.nextDouble();

        if(dinheiro > 0 && dinheiro < 1000000.00){
            int nota100 = (int)dinheiro / 100;
            dinheiro %= 100;
            int nota50 = (int)dinheiro / 50;
            dinheiro %= 50;
            int nota20 = (int)dinheiro / 20;
            dinheiro %= 20;
            int nota10 = (int)dinheiro / 10;
            dinheiro %= 10;
            int nota5 = (int)dinheiro / 5;
            dinheiro %= 5;
            int nota2 = (int)dinheiro / 2;
            dinheiro %= 2;
            int moeda1 = (int)dinheiro;
            dinheiro %= 1;
            int moeda50 = (int)(dinheiro*100) / 50;
            dinheiro = (dinheiro*100) % 50;
            int moeda25 = (int)dinheiro / 25;
            dinheiro %= 25;
            int moeda10 = (int)dinheiro / 10;
            dinheiro %= 10;
            int moeda5 = (int)dinheiro / 5;
            dinheiro %= 5;
            int moeda01 = (int)dinheiro / 1;

            System.out.printf("%d nota(s) de R$ 100.00\n", nota100);
            System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
            System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
            System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
            System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
            System.out.printf("%d nota(s) de R$ 2.00\n", nota2);
            System.out.printf("MOEDAS: \n");
            System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
            System.out.printf("%d moeda(s) de R$ 0.50\n", moeda50);
            System.out.printf("%d moeda(s) de R$ 0.25\n", moeda25);
            System.out.printf("%d moeda(s) de R$ 0.10\n", moeda10);
            System.out.printf("%d moeda(s) de R$ 0.05\n", moeda5);
            System.out.printf("%d moeda(s) de R$ 0.01\n", moeda01);
        }

        sc.close();
    }
}