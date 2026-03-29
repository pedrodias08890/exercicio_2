import java.util.Scanner;

public class VerificadorBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um ano (ex: 2024): ");
        int ano = sc.nextInt();

        boolean ehBissexto;

        if (ano % 400 == 0) {
            ehBissexto = true;
        } else if (ano % 100 == 0) {
            ehBissexto = false;
        } else if (ano % 4 == 0) {
            ehBissexto = true;
        } else {
            ehBissexto = false;
        }
        if (ehBissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}