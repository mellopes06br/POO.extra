package Questao20;

public abstract class Veiculo {
    String modelo;
    int capacidade;

    public Veiculo(String modelo, int capacidade) throws CapacidadeInvalidaException {
        if (capacidade <= 0) {
            throw new CapacidadeInvalidaException("Erro: A capacidade do veículo deve ser maior que zero.");
        }
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public abstract double calcularTempo(double distancia);

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}