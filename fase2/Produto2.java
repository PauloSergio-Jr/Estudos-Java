package fase2;

public class Produto2 implements Comparavel {
    protected String nome;
    protected double preco;
    protected int quantidade;

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
        if (preco <= 0) {
            System.out.println("Erro! O preço do produto deve ser maior que 0!");
        } else {
            this.preco = preco;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque() {
        return getPreco() * getQuantidade();
    }

    public void descricaoProduto() {
        System.out.println("Produto: " + getNome() + " - R$ " + getPreco() + " - Qtd: " + getQuantidade() + " - Total: "
                + valorTotalEstoque());
    }

    @Override
    public int comparar(Object outro) {
        Produto2 outroProduto = (Produto2) outro;
        return (int) (this.getPreco() - outroProduto.getPreco());
    }

    public Produto2(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}
