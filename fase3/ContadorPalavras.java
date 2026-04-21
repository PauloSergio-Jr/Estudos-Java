package fase3;

import java.util.Scanner;
import java.util.HashMap;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Por favor, digite uma frase:");
        String frase = leitor.nextLine();

        String[] palavras = frase.split(" ");
        HashMap<String, Integer> contagem = new HashMap<>();

        for (String palavra : palavras) {
            if (contagem.containsKey(palavra)) {
                int valorAtual = contagem.get(palavra);
                contagem.put(palavra, valorAtual + 1);
            } else {
                contagem.put(palavra, 1);
            }
        }
        for (String palavra : contagem.keySet()) {
            System.out.println(palavra + " -> " + contagem.get(palavra));
        }
        leitor.close();
    }
}
