package fase2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro carro1 = new Carro();

        System.out.println("=== Cadastro de Veiculo 1 ===");

        System.out.println("Digite a marca:");
        carro1.marca = leitor.nextLine();
        System.out.println("Digite o modelo:");
        carro1.modelo = leitor.nextLine();
        System.out.println("Digite o ano:");
        carro1.ano = leitor.nextInt();
        leitor.nextLine();

        carro1.descricao();

        Carro carro2 = new Carro();

        System.out.println("=== Cadastro de Veiculo 2 ===");

        System.out.println("Digite a marca:");
        carro2.marca = leitor.nextLine();
        System.out.println("Digite o modelo:");
        carro2.modelo = leitor.nextLine();
        System.out.println("Digite o ano:");
        carro2.ano = leitor.nextInt();
        leitor.nextLine();

        carro2.descricao();
        leitor.close();

    }

}
