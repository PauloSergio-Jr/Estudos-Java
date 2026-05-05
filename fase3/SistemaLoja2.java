package fase3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class SistemaLoja2 {
    public static Produto3 buscarPorNome(HashMap<String, Produto3> pesquisa, String nome)
            throws ProdutoNaoEncontradoException {
        if (pesquisa.containsKey(nome)) {
            return pesquisa.get(nome);
        }
        throw new ProdutoNaoEncontradoException("Produto: " + nome + " não encontrado!");
    }

    public static void main(String[] args) {
        String[] menu = new String[8];
        ArrayList<Produto3> produtos = new ArrayList<>();
        HashMap<String, Produto3> pesquisa = new HashMap<>();
        ArrayList<Funcionario2> funcionarios = new ArrayList<>();
        int opcao;

        Scanner leitor = new Scanner(System.in);
        do {
            System.out.println("=== Sistema de Loja ===");
            menu[0] = "0. Sair";
            menu[1] = "1. Cadastrar produto";
            menu[2] = "2. Procurar produto";
            menu[3] = "3. Listar estoque";
            menu[4] = "4. Calcular valor total do estoque";
            menu[5] = "5. Cadastrar funcionario";
            menu[6] = "6. Listar funcionários";
            menu[7] = "7. Calcular folha de pagamento";

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
                    Produto3 novoProduto = new Produto3(cadNome, cadPreco, cadQuantidade);
                    produtos.add(novoProduto);
                    pesquisa.put(cadNome, novoProduto);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto:");
                    String procurarP = leitor.nextLine();
                    try {
                        Produto3 encontrado = buscarPorNome(pesquisa, procurarP);
                        System.out.println(encontrado.getNome() + " - " + encontrado.getPreco() + " - "
                                + encontrado.getQuantidade());
                    } catch (ProdutoNaoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    for (Produto3 produto : produtos) {
                        System.out.println(produto.getNome() + " - " + produto.getQuantidade());
                    }
                    break;
                case 4:
                    System.out.println("=== Valor Total do Estoque ===");
                    for (Produto3 valorE : produtos) {
                        System.out.println(valorE.getNome() + " -> " + valorE.valorTotalEstoque());
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do funcionario:");
                    String cadFuncionario = leitor.nextLine();
                    System.out.println("Digite o salario:");
                    double cadSalario = leitor.nextDouble();
                    funcionarios.add(new Funcionario2(cadFuncionario, cadSalario));
                    break;
                case 6:
                    for (Funcionario2 funcionario : funcionarios) {
                        System.out.println(funcionario.getDescricao());
                    }
                    break;
                case 7:
                    System.out.println("=== Valor da folha de pagamento ===");
                    for (Funcionario2 funcionario : funcionarios) {
                        System.out.println(funcionario.getNome() + " -> R$ " + funcionario.calcularFolha());
                    }
                    break;
                default:
                    System.out.println("Invalido!");
            }
        } while (opcao != 0);
        leitor.close();
    }
}
