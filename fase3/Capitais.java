package fase3;

import java.util.Scanner;
import java.util.HashMap;

public class Capitais {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        Scanner leitor = new Scanner(System.in);

        capitais.put("sao paulo", "São Paulo");
        capitais.put("bahia", "Salvador");
        capitais.put("parana", "Curitiba");
        capitais.put("rio grande do sul", "Porto Alegre");
        capitais.put("minas gerais", "Belo Horizonte");

        System.out.println("Por favor, digite o nome do estado:");
        String entrada = leitor.nextLine().trim().toLowerCase();

        if (capitais.containsKey(entrada)) {
            System.out.println("A capital do estado digitado é: " + capitais.get(entrada));
        } else {
            System.out.println("Erro! o nome do estado digitado está incorreto ou não consta no sistema!");
        }
        leitor.close();
    }
}
