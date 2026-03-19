package fase2;

public class Animal {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    void fazerSom() {
        System.out.println("...");
    }
}
