import java.util.Scanner;
import java.util.InputMismatchException;

public class Pessoa {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("por favor, digite seu nome:");
    String nome = leitor.nextLine();

    int idade = 0;
    double altura = 0;
    double peso = 0;

    boolean idadeValida = false;

    do {
      try {
        System.out.println("por favor, digite sua idade:");
        idade = leitor.nextInt();
        idadeValida = true;
      } catch (InputMismatchException e) {
        System.out.println("Erro! digite apenas numeros!");
        leitor.nextLine();
      }
    } while (!idadeValida);

    boolean alturaValida = false;

    do {
      try {
        System.out.println("por favor, digite sua altura:");
        altura = leitor.nextDouble();
        alturaValida = true;
      } catch (InputMismatchException e) {
        System.out.println("Erro! digite apenas numeros!");
        leitor.nextLine();
      }
    } while (!alturaValida);

    boolean pesoValido = false;

    do {
      try {
        System.out.println("por favor, digite seu peso, para calcularmos o IMC:");
        peso = leitor.nextDouble();
        pesoValido = true;
      } catch (InputMismatchException e) {
        System.out.println("Erro! digite apenas numeros!");
        leitor.nextLine();
      }
    } while (!pesoValido);

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.printf("seu IMC é: %.2f%n", peso / (altura * altura));
    leitor.close();
  }

}
