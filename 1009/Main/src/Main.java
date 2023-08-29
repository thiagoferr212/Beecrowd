import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por 
 *      ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 *      informar o total a receber no final do mês, com duas casas decimais.
 */
public class Main {
 
    public static void main(String[] args) {

        String nome;
        double salFixo, total, comis, salTotal;

        Scanner teclado = new Scanner(System.in);
        
        nome = teclado.nextLine();
        salFixo = teclado.nextDouble();
        total = teclado.nextDouble();

        comis = (total * 0.15);
        salTotal = comis + salFixo;

        System.out.printf("TOTAL = R$ %.2f\n", salTotal);
 
    }
 
}