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

        // Animal

        Animal animal1 = new Animal("animal1");
        animal1.fazerSom();

        Cachorro cachorro1 = new Cachorro("cachorro1");
        cachorro1.fazerSom();

        Gato gato1 = new Gato("gato1");
        gato1.fazerSom();

        // Funcionario

        Funcionario f1 = new Funcionario("Paulo", 3000);
        f1.calcularBonus();
        f1.exibirInfo();

        Gerente g1 = new Gerente("Anelise", 5000);
        g1.calcularBonus();
        g1.exibirInfo();

        Funcionario[] equipe = new Funcionario[4];
        equipe[0] = new Funcionario("Paulo", 3000);
        System.out.println(equipe[0].getNome() + " -> Bônus: " + equipe[0].calcularBonus());
        equipe[1] = new Funcionario("Ana", 2500);
        System.out.println(equipe[1].getNome() + " -> Bônus: " + equipe[1].calcularBonus());
        equipe[2] = new Gerente("Carlos", 5000);
        System.out.println(equipe[2].getNome() + " -> Bônus: " + equipe[2].calcularBonus());
        equipe[3] = new Gerente("Maria", 6000);
        System.out.println(equipe[3].getNome() + " -> Bônus: " + equipe[3].calcularBonus());

        System.out.printf("Total da folha: %.1f", equipe[0].calcularFolha() + equipe[1].calcularFolha()
                + equipe[2].calcularFolha() + equipe[3].calcularFolha());
        System.out.println();

        Produto p1 = new Produto("Capa de Banco - celta", 200);
        System.out.println(p1.getDescricao());

        Funcionario ane = new Funcionario("Anelise", 7500);
        System.out.println(ane.getDescricao());

        leitor.close();

    }

}
