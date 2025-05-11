package Questao03;

public class Funcionario {
    private String nomeFunc;
    private double salarioBaseFunc;

    public Funcionario() {
    }

    public Funcionario(String nomeFunc, double salarioBaseFunc) {
        this.nomeFunc = nomeFunc;
        this.salarioBaseFunc = salarioBaseFunc;
    }

    public String getNome() {
        return nomeFunc;
    }

    public double getSalarioBase() {
        return salarioBaseFunc;
    }

    public void setNome(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public void setSalarioBase(double salarioBaseFunc) {
        this.salarioBaseFunc = salarioBaseFunc;
    }

    public double calcularSalario() {
        return salarioBaseFunc;
    }

    public void exibirInformacoesFunc() {
        System.out.println("Nome do funcionário: " + nomeFunc);
        System.out.println("Salario base: " + salarioBaseFunc);

    }
}
