package fase1;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;

        System.out.println("Digite o primeiro número: ");
        numero1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        numero2 = leitor.nextDouble();
        System.out.println("Digite o terceiro número: ");
        numero3 = leitor.nextDouble();

        if (numero1 > numero3 && numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("O maior número é: " + numero3);
        }
        leitor.close();
    }

}
