package exe03_gft;

import java.util.Scanner;

public class Exe03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int x = n2 - n1;

        if (x > 15) {//não funcionou a condição :(
            System.out.println("O intervalo não pode ser maior que 15");
        } else {
            System.out.print("Digite o primeiro número: ");
            n1 = input.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = input.nextInt();
        }

        for (int i = n1; i < n2; i++) {
            System.out.println("O cubo do número " + i + " é: " + (Math.pow(i, 3)));
        }
    }
}
