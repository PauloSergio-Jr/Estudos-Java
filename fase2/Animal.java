package fase2;

public abstract class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom();

    public void comer() {
        System.out.println(getNome() + " Está comendo!");
    }
}
