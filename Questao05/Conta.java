package Questao05;

public class Conta {
    private String titular;
  private double saldo;
  
    public Conta(){

    }   
    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta de " + titular + ". Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }


    public double sacar(double valor) {
        valor = 100;
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return saldo; 
        }
        saldo -= valor; 
        return saldo; 
    }
}
