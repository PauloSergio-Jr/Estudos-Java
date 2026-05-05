package fase3;

public class Funcionario2 implements Descricavel2 {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    double calcularBonus() {
        return salario * 0.10;
    }

    double calcularFolha() {
        return salario + calcularBonus();
    }

    public Funcionario2(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String getDescricao() {
        return "Funcionário: " + getNome() + " - Salário: R$ " + getSalario();
    }

    void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Bônus: " + calcularBonus());
    }
}
