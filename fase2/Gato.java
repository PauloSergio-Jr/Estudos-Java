package fase2;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("Miau");
    }
}
