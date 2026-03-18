package fase2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Cadastro de Veiculo 1 ===");

        System.out.println("Digite a marca:");
        String marca = leitor.nextLine();
        System.out.println("Digite o modelo:");
        String modelo = leitor.nextLine();
        System.out.println("Digite o ano:");
        int ano = leitor.nextInt();
        leitor.nextLine();

        Carro carro1 = new Carro(marca, modelo, ano);

        carro1.descricao();

        System.out.println("=== Cadastro de Veiculo 2 ===");

        System.out.println("Digite a marca:");
        marca = leitor.nextLine();
        System.out.println("Digite o modelo:");
        modelo = leitor.nextLine();
        System.out.println("Digite o ano:");
        ano = leitor.nextInt();
        leitor.nextLine();

        Carro carro2 = new Carro(marca, modelo, ano);

        carro2.descricao();
        leitor.close();

    }

}
