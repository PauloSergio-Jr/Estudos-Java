package fase1;

public class Metodos {
    static void saudar(String nome) {
        System.out.println("Ola, " + nome + "! Bem vindo");
    }

    static double somar(double n1, double n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        saudar("paulo");
        double resultado = somar(5, 3);
        System.out.println("Soma: " + resultado);

    }

}
