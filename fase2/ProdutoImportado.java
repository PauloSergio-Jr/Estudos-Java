package fase2;

public class ProdutoImportado extends Produto2 implements Tributavel {
    public ProdutoImportado(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.15;
    }

    public void getDescricao() {
        System.out.printf("Produto: " + getNome() + " - Imposto: R$ %.2f", calcularImposto());
    }
}
