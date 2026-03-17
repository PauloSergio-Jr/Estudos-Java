package fase1;

import java.util.Scanner;

public class TrocaVariaveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("por favor, digite o primeiro numero:");
        int numero1 = leitor.nextInt();

        System.out.println("por favor, digite o segundo numero:");
        int numero2 = leitor.nextInt();

        System.out.println("antes da troca:");
        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);

        numero1 = numero1 + numero2;
        numero2 = numero1 - numero2;
        numero1 = numero1 - numero2;

        System.out.println("depois da troca:");
        System.out.println("numero 1: " + numero1);
        System.out.println("numero 2: " + numero2);
        leitor.close();

    }

}
