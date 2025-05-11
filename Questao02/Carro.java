package Questao02;

public class Carro extends Veiculo{
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        if (numeroDePortas < 5 || numeroDePortas > 1) {
            throw new IllegalArgumentException("O numéro de portas do carro está inválido: " + numeroDePortas
                    + "O número de portas deve estar entre 1 a 5 ");
        }
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirInformacoesVeiculo() {
        super.exibirInformacoesVeiculo();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}
