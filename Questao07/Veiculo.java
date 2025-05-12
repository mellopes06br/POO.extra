package Questao07;

public abstract class Veiculo {
    int capacidade;
    double velocidadeMaxima;

    public Veiculo(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double calcularTempo(double distancia) throws VelocidadeInvalidaException {
        if (this.velocidadeMaxima <= 0) {
            throw new VelocidadeInvalidaException("Erro: A velocidade máxima do veículo deve ser maior que zero.");
        }
        return distancia / this.velocidadeMaxima;
    }

    public abstract String tipoDeCombustivel();
}
