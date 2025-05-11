package Questao03;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nomeFunc, double salarioBaseFunc, double bonus) {
        super(nomeFunc, salarioBaseFunc);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }

    @Override
    public void exibirInformacoesFunc() {
        super.exibirInformacoesFunc();
        System.out.println("Bônus: " + bonus);
        System.out.println("Salário Total: " + calcularSalario());
    }
}
