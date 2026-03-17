package fase1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class JogoAdivinhar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean acerto = false;
        int tentativa = 0;
        int i = 7;

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        do {
            try {
                System.out.println("Tente advinhar o número! Digite um número de 1 a 100:");
                tentativa = leitor.nextInt();
                if (tentativa < 0 || tentativa > 100) {
                    System.out.println("Erro! Por favor, digite um número entre 1 e 100");
                } else {
                    if (tentativa == numeroSecreto) {
                        System.out.println("Parabens, você acertou!");
                        acerto = true;
                    } else {
                        i--;
                        acerto = false;
                        if (tentativa < numeroSecreto) {
                            System.out.println("Muito baixo! Tentativas restantes: " + i);
                        } else {
                            System.out.println("Muito alto! Tentativas restantes: " + i);
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro, Digite apenas números!");
                leitor.nextLine();
            }
        } while (!acerto && i > 0);
        if (!acerto) {
            System.out.println("Game over! O número era: " + numeroSecreto);
        }
        leitor.close();

    }
}
