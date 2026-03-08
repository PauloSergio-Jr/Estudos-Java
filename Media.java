import java.util.Scanner;
import java.util.InputMismatchException;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite o numero " + i + ":");
                double numero = leitor.nextDouble();
                soma = soma + numero;
            }
            double media = soma / 5;

            System.out.println("Soma: " + soma);
            System.out.println("Media: " + media);
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite apenas numeros!");
        }
        leitor.close();
    }
}
