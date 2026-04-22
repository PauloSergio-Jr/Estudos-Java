package fase3;

import java.util.Scanner;
import java.util.HashMap;

public class EstoqueProdutos {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;
        do {
            System.out.println("0. Sair");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Vendas");
            System.out.println("3. Ver estoque");

            System.out.println("Digite uma opção:");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    System.out.println("=== Cadastro de produtos ===");
                    System.out.println("Digite o nome do produto:");
                    String nomeP = leitor.nextLine();
                    System.out.println("Digite a quantidade:");
                    Integer quantidadeP = leitor.nextInt();
                    leitor.nextLine();
                    estoque.put(nomeP, quantidadeP);
                    break;
                case 2:
                    System.out.println("=== Cadastro de vendas ===");
                    System.out.println("Digite o nome do produto a ser vendido:");
                    String venda = leitor.nextLine();
                    System.out.println("Digite a quantidade a ser vendida:");
                    Integer quantidadeV = leitor.nextInt();
                    leitor.nextLine();
                    if (estoque.containsKey(venda)) {
                        int valorAtual = estoque.get(venda);
                        int novaQuantidade = valorAtual - quantidadeV;
                        estoque.put(venda, valorAtual - quantidadeV);
                        if (novaQuantidade < 5) {
                            System.out.println("Estoque está baixo!");
                        }
                    } else {
                        System.out.println("O produto digitado não existe ou esta escrito errado!");
                    }
                    break;
                case 3:
                    System.out.println("=== Estoque de produtos ===");
                    for (String produtos : estoque.keySet()) {
                        System.out.println("Nome: " + produtos + " - Quantidade: " + estoque.get(produtos));
                    }
                    break;
                default:
                    System.out.println("Opção invalida!");
            }

        } while (opcao != 0);
        leitor.close();
    }
}
