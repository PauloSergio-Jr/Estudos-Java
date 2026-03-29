package fase2;

public class ProdutoPerecivel extends Produto2 {
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(String dataAtual) {
        return dataValidade.compareTo(dataAtual) < 0;
    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
