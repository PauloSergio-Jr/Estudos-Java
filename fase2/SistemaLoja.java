package fase2;

import java.util.Scanner;

public class SistemaLoja {
    public static void main(String[] args) {
        String[] menu = new String[7];
        Produto2[] produtos = new Produto2[10];
        Funcionario[] funcionarios = new Funcionario[10];
        int totalProdutos = 0;
        int totalFuncionarios = 0;
        int opcao;

        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("=== Sistema de Loja ===");
            menu[0] = "0. Sair";
            menu[1] = "1. Cadastrar produto";
            menu[2] = "2. Listar estoque";
            menu[3] = "3. Calcular valor total do estoque";
            menu[4] = "4. Cadastrar funcionario";
            menu[5] = "5. Listar funcionários";
            menu[6] = "6. Calcular folha de pagamento";

            for (int i = 0; i <= 6; i++) {
                System.out.println(menu[i]);
            }
            System.out.println("Por favor, digite uma opção:");
            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String cadNome = leitor.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double cadPreco = leitor.nextDouble();
                    System.out.println("Digite a quantidade do produto:");
                    int cadQuantidade = leitor.nextInt();
                    produtos[totalProdutos] = new Produto2(cadNome, cadPreco, cadQuantidade);
                    totalProdutos++;
                    break;
                case 2:
                    for (int i = 0; i < totalProdutos; i++) {
                        produtos[i].descricaoProduto();
                    }
                    break;
                case 3:
                    System.out.println("=== Valor Total do Estoque ===");
                    for (int i = 0; i < totalProdutos; i++) {
                        System.out.println(produtos[i].getNome() + " -> " + produtos[i].valorTotalEstoque());
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do funcionario:");
                    String cadFuncionario = leitor.nextLine();
                    System.out.println("Digite o salario:");
                    double cadSalario = leitor.nextDouble();
                    funcionarios[totalFuncionarios] = new Funcionario(cadFuncionario, cadSalario);
                    totalFuncionarios++;
                    break;
                case 5:
                    for (int i = 0; i < totalFuncionarios; i++) {
                        System.out.println(funcionarios[i].getDescricao());
                    }
                    break;
                case 6:
                    System.out.println("=== Valor da folha de pagamento ===");
                    for (int i = 0; i < totalFuncionarios; i++) {
                        System.out.println(funcionarios[i].getNome() + " -> R$ " + funcionarios[i].calcularFolha());
                    }
                    break;
                default:
                    System.out.println("Invalido!");
            }
        } while (opcao != 0);
        leitor.close();
    }
}
