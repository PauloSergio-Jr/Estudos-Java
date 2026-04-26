package fase2;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > getSaldo()) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        } else {
            this.saldo = saldo - valor;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }

}
