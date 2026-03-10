import java.util.Scanner;
import java.util.InputMismatchException;

public class Metodos2 {
    static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    static double lerNumero(Scanner leitor) {
        double valor = 0;
        boolean valorValido = false;
        do {
            valor = leitor.nextDouble();
            if (valor < 0 || valor > 10) {
                valorValido = false;
            } else {
                valorValido = true;
            }
        } while (!valorValido);
        return valor;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;

        try {
            System.out.println("Digite a primeira nota: ");
            n1 = lerNumero(leitor);
            System.out.println("Digite a segunda nota: ");
            n2 = lerNumero(leitor);
            System.out.println("Digite a terceira nota: ");
            n3 = lerNumero(leitor);

            double media = calcularMedia(n1, n2, n3);

            if (media >= 7) {
                System.out.println("Resultado: Aprovado!");
            } else if (media >= 5) {
                System.out.println("Resultado: Em recupeção!");
            } else {
                System.out.println("Resultado: Reprovado!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite apenas numeros!");
        }
    }
}
