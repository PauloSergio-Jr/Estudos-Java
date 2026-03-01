import java.util.Scanner;
import java.util.InputMismatchException;

public class Notas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota;
        boolean notaValida = false;
        do {
            try {
                System.out.println("Digite sua nota:");
                nota = leitor.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("Erro! A nota deve ser entre 0 e 10!");
                    notaValida = false;
                } else {
                    notaValida = true;

                    System.out.println(nota);

                    if (nota >= 7) {
                        System.out.println("Situação: Aprovado");
                    } else if (nota >= 5) {
                        System.out.println("Situação: Em recuperação");
                    } else {
                        System.out.println("Situação: Reprovado");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Digite apenas números!");
                leitor.nextLine();
            }
        } while (!notaValida);
        leitor.close();
    }
}
