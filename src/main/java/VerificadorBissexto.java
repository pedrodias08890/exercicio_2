import java.util.Scanner;

public class VerificadorBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano (exemplo: 2024): ");
        int ano = sc.nextInt();

        if (ano % 400 == 0) {
            System.out.println(ano + " é bissexto.");
        }
        else if (ano % 100 == 0) {
            System.out.println(ano + " não é bissexto.");
        }
        else if (ano % 4 == 0) {
            System.out.println(ano + " é bissexto.");
        }
        else {
            System.out.println(ano + " não é bissexto.");
        }

    }
}