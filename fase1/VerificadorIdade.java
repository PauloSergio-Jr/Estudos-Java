package fase1;

import java.util.Scanner;

public class VerificadorIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println("Por favor digite sua idade");
        try {
            int idade = leitor.nextInt();
            if (idade >= 18) {
                System.out.println("Olá, " + nome + "! Seja bem vindo, você pode entrar!");
            } else {
                System.out.println("Opá, " + nome + "! Infelizmente você não pode entrar ainda");
            }
        } catch (Exception e) {
            System.out.println("erro: você precisa digitar um numero para a idade!");
        }
        leitor.close();

    }
}
