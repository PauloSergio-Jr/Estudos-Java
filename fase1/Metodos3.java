package fase1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Metodos3 {
    static boolean ehPrimo(int nmr) {
        boolean numeroPrimo = true;
        for (int i = 2; i < nmr; i++) {
            if (nmr % i == 0) {
                numeroPrimo = false;
                break;
            }
        }
        return numeroPrimo;
    }

    static public void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int nmr = 0;
        try {
            System.out.println("Por favor digite um numero:");
            nmr = leitor.nextInt();
            boolean resultado = ehPrimo(nmr);

            if (resultado == true) {
                System.out.println(nmr + "-> Primo!");
            } else {
                System.out.println(nmr + "-> Não é primo!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite apenas numeros inteiros!");
        }
        leitor.close();
    }
}
