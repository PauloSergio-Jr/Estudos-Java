package fase2;

public class ProdutoImportado extends ProdutoNacional {
    public ProdutoImportado(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.15;
    }
}
