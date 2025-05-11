package Questao05;

public class ContaSalario extends Conta {

 private int limiteSaques;

    private int saquesRealizados;

    public ContaSalario(String titular, double saldo, int limiteSaques) {
        super(titular, saldo);
        this.limiteSaques = limiteSaques;
        this.saquesRealizados = 0;
    }

    public int getLimiteSaque() {
        return limiteSaques;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaques = limiteSaque;
    }

    public int getLimiteSaques() {
        return limiteSaques;
    }

    public int getSaquesRealizados() {
        return saquesRealizados;
    }

    @Override
    public double sacar(double valor) {
        if (saquesRealizados < limiteSaques) {
            if (super.sacar(valor) > 0) {
                saquesRealizados++;
                System.out.println("Saque #" + saquesRealizados + " de " + limiteSaques + " permitido na conta salário de " + getTitular());
                return valor;
            }
        } else {
            System.out.println("Limite de saques mensais atingido na conta salário de " + getTitular() + ".");
        }
        return 0;
    }
}
