package fase2;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Invalido! O numero não pode ser menor que 0!");
        } else {
            this.preco = preco;
        }
    }

    public String getDescricao() {
        return "Livro: " + titulo + " - Autor: " + autor + " - R$ " + preco;
    }

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        setPreco(preco);
    }

}
