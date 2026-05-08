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

    public static void validarQuantidade(Produto3 produto, int quantidade)
            throws EstoqueInsuficienteException {
        if (quantidade > produto.getQuantidade()) {
            throw new EstoqueInsuficienteException("Estoque insuficiente!");
        }
    }

    public static void main(String[] args) {
        String[] menu = new String[9];
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
            menu[3] = "3. Vender produto";
            menu[4] = "4. Listar estoque";
            menu[5] = "5. Calcular valor total do estoque";
            menu[6] = "6. Cadastrar funcionario";
            menu[7] = "7. Listar funcionários";
            menu[8] = "8. Calcular folha de pagamento";

            for (int i = 0; i <= 8; i++) {
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
                    leitor.nextLine();
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
                        System.out.println(
                                "Produto: " + encontrado.getNome() + " - R$ " + encontrado.getPreco() + " - Qtd: "
                                        + encontrado.getQuantidade());
                    } catch (ProdutoNaoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do produto:");
                    String procurarV = leitor.nextLine();
                    System.out.println("Digite a quantidade a ser vendida:");
                    int quantidadeV = leitor.nextInt();
                    leitor.nextLine();
                    try {
                        Produto3 encontrado = buscarPorNome(pesquisa, procurarV);
                        validarQuantidade(encontrado, quantidadeV);
                        encontrado.setQuantidade(encontrado.getQuantidade() - quantidadeV);
                        System.out.println("Venda realizada com sucesso!");
                    } catch (ProdutoNaoEncontradoException e) {
                        System.out.println(e.getMessage());
                    } catch (EstoqueInsuficienteException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    for (Produto3 produto : produtos) {
                        System.out.println("Produto: " + produto.getNome() + " - Qtd: " + produto.getQuantidade());
                    }
                    break;
                case 5:
                    System.out.println("=== Valor Total do Estoque ===");
                    for (Produto3 valorE : produtos) {
                        System.out.println("Produto: " + valorE.getNome() + " -> R$ " + valorE.valorTotalEstoque());
                    }
                    break;
                case 6:
                    System.out.println("Digite o nome do funcionario:");
                    String cadFuncionario = leitor.nextLine();
                    System.out.println("Digite o salario:");
                    double cadSalario = leitor.nextDouble();
                    leitor.nextLine();
                    funcionarios.add(new Funcionario2(cadFuncionario, cadSalario));
                    break;
                case 7:
                    for (Funcionario2 funcionario : funcionarios) {
                        System.out.println(funcionario.getDescricao());
                    }
                    break;
                case 8:
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
