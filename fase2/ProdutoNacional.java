package fase2;

public class ProdutoNacional implements Tributavel {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ProdutoNacional(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.05;
    }

    public void getDescricao() {
        System.out.printf("Produto: " + getNome() + " - Imposto: R$ %.2f", calcularImposto());
    }
}
