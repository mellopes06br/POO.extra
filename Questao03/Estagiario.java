package Questao03;

public class Estagiario extends Funcionario {
   
    public Estagiario(String nomeFunc, double salarioBaseFunc) {
        super(nomeFunc, salarioBaseFunc);
    }

    @Override
    public void exibirInformacoesFunc() {
        super.exibirInformacoesFunc();
        System.out.println("Salário Total: " + calcularSalario());
    }
}