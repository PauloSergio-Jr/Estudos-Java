package fase2;

public class Funcionario {
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

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Bônus: " + calcularBonus());
    }
}
