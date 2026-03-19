package fase2;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println("Au Au");
    }

}
