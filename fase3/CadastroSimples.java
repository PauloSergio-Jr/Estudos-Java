package fase3;

public class CadastroSimples {
    String nome;
    int idade;

    public void lerIdade() throws IdadeInvalidaException {
        if (idade < 0 | idade > 150) {
            throw new IdadeInvalidaException("Idade invalida!");
        } else {
            System.out.println("Idade: " + idade);
        }
    }

    public CadastroSimples(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
