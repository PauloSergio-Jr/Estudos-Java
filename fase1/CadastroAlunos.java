package fase1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CadastroAlunos {
    static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    static String definirSituacao(double media) {
        if (media >= 7) {
            return "Aprovado!";
        } else if (media >= 5) {
            return "Recuperação!";
        } else {
            return "Reprovado!";
        }
    }

    static void cadastrarAluno(Scanner leitor, String[] nomes, double[] medias, int indice) {
        try {
            System.out.println("Por Favor, digite seu nome:");
            nomes[indice] = leitor.nextLine();
            System.out.println("Por favor, digite sua primeira nota:");
            double n1 = leitor.nextDouble();
            System.out.println("Por favor, digite sua segunda nota:");
            double n2 = leitor.nextDouble();
            System.out.println("Por favor, digite sua terceira nota:");
            double n3 = leitor.nextDouble();
            leitor.nextLine();

            medias[indice] = calcularMedia(n1, n2, n3);
        } catch (InputMismatchException e) {
            System.out.println("Erro! Por favor, use apenas letras para nome e números para as notas!");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] medias = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("=== Cadastro de Aluno " + (i + 1) + " ===");
            cadastrarAluno(leitor, nomes, medias, i);
        }
        System.out.println("=== Relatório da Turma ===");
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.printf("%s -> %.2f - %s%n", nomes[i1], medias[i1], definirSituacao(medias[i1]));
        }
        System.out.printf("Média da turma: %.2f%n",
                (medias[0] + medias[1] + medias[2] + medias[3] + medias[4]) / 5);

        leitor.close();
    }
}
