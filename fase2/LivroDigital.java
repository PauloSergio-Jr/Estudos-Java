package fase2;

public class LivroDigital extends Livro {
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        if (tamanhoArquivo <= 0) {
            System.out.println("Tamanho invalido! O tamanho do arquivo não pode ser menor que 1MB!");
        } else {
            this.tamanhoArquivo = tamanhoArquivo;
        }
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " - Tamanho: " + tamanhoArquivo + "MB";
    }

}
