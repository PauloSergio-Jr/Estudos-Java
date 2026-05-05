package fase3;

public class ProdutoImportado2 extends Produto3 implements Tributavel2 {
    public ProdutoImportado2(String nome, double preco, int quantidade) {
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
