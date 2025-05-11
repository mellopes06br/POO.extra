package Questao05;

public class ContaCorrente extends Conta {
    
    private static final double TAXA_SAQUE = 0.10;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        double valorTotal = valor * (1 + TAXA_SAQUE);
        if (valor > 0 && valorTotal <= getSaldo()) {
            setSaldo(getSaldo() - valorTotal);
            System.out.println("Saque de R$" + valor + " realizado com sucesso na conta corrente de " + getTitular() + " (taxa de 10%: R$" + (valor * TAXA_SAQUE) + "). Novo saldo: R$" + getSaldo());
            return valor;
        } else {
            System.out.println("Erro ao sacar na conta corrente de " + getTitular() + ": saldo insuficiente ou valor inválido (incluindo taxa).");
            return 0;
        }
    }
}
