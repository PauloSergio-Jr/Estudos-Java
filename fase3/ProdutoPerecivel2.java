package fase3;

public class ProdutoPerecivel2 extends Produto3 {
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

    public ProdutoPerecivel2(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
