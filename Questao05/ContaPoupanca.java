package Questao05;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public void adicionarRendimento(double percentual) {
        if (percentual > 0) {
            double rendimento = getSaldo() * (percentual / 100);
            setSaldo(getSaldo() + rendimento);
            System.out.println("Rendimento de " + percentual + "% (R$" + rendimento + ") adicionado à conta poupança de " + getTitular() + ". Novo saldo: R$" + getSaldo());
        } else {
            System.out.println("Percentual de rendimento inválido.");
        }
    }
}
