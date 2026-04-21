package fase3;

import java.util.Scanner;
import java.util.ArrayList;

public class FilaAtendimento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;
        ArrayList<String> clientes = new ArrayList<>();

        System.out.println("=== Fila de atendimento ===");

        while (opcao != 0) {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Chamar próximo");
            System.out.println("3 - Ver fila");
            System.out.println("0 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                case 1:
                    System.out.println("Digite o nome do cliente para adicionalo a fila:");
                    leitor.nextLine();
                    String nomeCliente = leitor.nextLine();
                    clientes.add(nomeCliente);
                    break;
                case 2:
                    if (clientes.isEmpty()) {
                        System.out.println("A fila esta vazia!");
                    } else {
                        System.out.println("Cliente atual: " + clientes.get(0));
                        clientes.remove(0);
                    }
                    break;
                case 3:
                    if (clientes.isEmpty()) {
                        System.out.println("A fila esta vazia!");
                    } else {
                        System.out.println(clientes);
                    }
                    break;
                default:
                    System.out.println("Por favor, Digite uma opção de menu valida!");
                    break;
            }
        }
        leitor.close();
    }

}
