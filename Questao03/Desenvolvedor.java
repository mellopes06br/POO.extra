package Questao03;

public class Desenvolvedor extends Funcionario {
    private double fatorProdutividade;

    public Desenvolvedor(String nomeFunc, double salarioBaseFunc, double fatorProdutividade) {
        super(nomeFunc, salarioBaseFunc);
        setFatorProdutividade(fatorProdutividade); // Usando o setter para garantir a validação
    }

    public double getFatorProdutividade() {
        return fatorProdutividade;
    }

    public void setFatorProdutividade(double fatorProdutividade) {
        if (fatorProdutividade != 1.25 && fatorProdutividade != 1.50 && fatorProdutividade != 1.75
                && fatorProdutividade != 2.00) {
            throw new IllegalArgumentException(
                    "O fator de produtividade deve ser um dos seguintes valores: 1.25, 1.50, 1.75 ou 2.00");
        }
        this.fatorProdutividade = fatorProdutividade;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * fatorProdutividade;
    }

    @Override
    public void exibirInformacoesFunc() {
        super.exibirInformacoesFunc();
        System.out.println("Fator de Produtividade: " + fatorProdutividade);
        System.out.println("Salário Total: " + calcularSalario());
    }
}
