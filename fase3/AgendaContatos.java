package fase3;

import java.util.Scanner;
import java.util.ArrayList;

public class AgendaContatos {
    public static Contato buscarPorNome(ArrayList<Contato> agenda, String nome)
            throws ContatoNaoEncontradoException {
        for (Contato contato : agenda) {
            if (contato.getNome().trim().equals(nome.trim())) {
                return contato;
            }
        }
        throw new ContatoNaoEncontradoException("Contato " + nome + " não encontrado!");
    }

    public static void main(String[] args) {
        ArrayList<Contato> agenda = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;

        System.out.println("=== Agenda de contatos ===");
        do {
            System.out.println("0. Sair");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato por nome");
            System.out.println("3. Listar todos os contatos");
            System.out.println("4. Remover contato");

            opcao = leitor.nextInt();
            leitor.nextLine();
            switch (opcao) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    System.out.println("Nome:");
                    String nomeC = leitor.nextLine().trim();
                    System.out.println("Numero:");
                    String numeroC = leitor.nextLine();
                    agenda.add(new Contato(nomeC, numeroC));
                    break;
                case 2:
                    System.out.println("Digite o nome do contato:");
                    String procurarC = leitor.nextLine().trim();
                    try {
                        Contato encontrado = buscarPorNome(agenda, procurarC);
                        System.out.println(encontrado.getNome() + " - " + encontrado.getNumero());
                    } catch (ContatoNaoEncontradoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("=== Lista de contatos ===");
                    for (Contato contato : agenda) {
                        System.out.println(contato.getNome() + " - " + contato.getNumero());
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do contato a ser removido:");
                    String removerC = leitor.nextLine().trim();
                    Contato paraRemover = null;
                    for (Contato contato : agenda) {
                        if (contato.getNome().equals(removerC)) {
                            paraRemover = contato;
                        }
                    }
                    if (paraRemover != null) {
                        agenda.remove(paraRemover);
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("ERRO! Esse contato não existe!");
                    }
                    break;
                default:
                    System.out.println("ERRO! Opção invalida!");
                    break;
            }

        } while (opcao != 0);
        leitor.close();
    }
}
