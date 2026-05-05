package fase3;

public class Gerente2 extends Funcionario2 {
    public Gerente2(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    double calcularBonus() {
        return getSalario() * 0.20;
    }
}
