import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        String operacao = "";
        boolean operacaoValida = false;

        do {
            try {
                System.out.println("Digite o primeiro numero: ");
                numero1 = leitor.nextDouble();
                System.out.println("Digite o segundo numero: ");
                numero2 = leitor.nextDouble();
                leitor.nextLine();
                System.out.println("Digite a operação (+, -, *, /): ");
                operacao = leitor.nextLine();

                if (operacao.equals("+")) {
                    System.out.println("Resultado: " + (numero1 + numero2));
                } else if (operacao.equals("-")) {
                    System.out.println("Resultado: " + (numero1 - numero2));
                } else if (operacao.equals("*")) {
                    System.out.println("Resultado: " + (numero1 * numero2));
                } else if (operacao.equals("/")) {
                    if (numero2 == 0) {
                        System.out.println("Erro! Não é possivel dividir por 0!");
                    } else {
                        System.out.println("Resultado: " + (numero1 / numero2));
                    }
                } else {
                    System.out.println("Erro! Operação inválida! Use apenas (+, -, *, /)");
                    operacaoValida = false;
                }
                operacaoValida = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro! Digite apenas numeros e operadores aceitos (+, -, *, /)!");
                operacaoValida = false;
                leitor.nextLine();

            }
        } while (!operacaoValida);
        leitor.close();
    }

}
