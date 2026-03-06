import java.util.Scanner;
import java.util.InputMismatchException;

public class Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario = "";
        String senha = "";
        int tentativas = 0;
        boolean loginValido = false;

        do {
            try {
                System.out.println("Digite o usuario: ");
                usuario = leitor.nextLine();
                System.out.println("Digite a senha: ");
                senha = leitor.nextLine();

                if (!usuario.equals("admin") || !senha.equals("java123")) {
                    loginValido = false;
                    tentativas++;
                    System.out.println("Usúario ou senha incorretos! Tentativas restantes: " + (3 - tentativas));
                } else {
                    System.out.println("Bem vindo, admin!");
                    loginValido = true;
                }
            } catch (InputMismatchException e) {
                leitor.nextLine();
            }
        } while (!loginValido && tentativas < 3);
        if (!loginValido) {
            System.out.println("Conta bloqueada! Número de tentativas excedido.");
        }

        leitor.close();

    }
}
