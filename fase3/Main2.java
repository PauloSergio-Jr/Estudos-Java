package fase3;

public class Main2 {
    public static void main(String[] args) {
        CadastroSimples paulo = new CadastroSimples("Paulo", 24);
        try {
            paulo.lerIdade();
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
        CadastroSimples ane = new CadastroSimples("Ane", 151);
        try {
            ane.lerIdade();
        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
