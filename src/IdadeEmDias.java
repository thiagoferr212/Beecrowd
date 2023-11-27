import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();

        int ano = idade / 365;
        idade %= 365;
        int mes = idade / 30;
        idade %= 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(idade + " dia(s)");

        sc.close();
    }
    
}
