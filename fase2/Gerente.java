package fase2;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return getSalario() * 0.20;
    }
}
