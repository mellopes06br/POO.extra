package Questao20;

class Carro extends Veiculo {
    private double velocidadeEspecifica; // km/h

    public Carro(String modelo, int capacidade, double velocidadeEspecifica) throws CapacidadeInvalidaException, VelocidadeInvalidaException {
        super(modelo, capacidade);
        if (velocidadeEspecifica <= 0) {
            throw new VelocidadeInvalidaException("Erro: A velocidade do carro deve ser maior que zero.");
        }
        this.velocidadeEspecifica = velocidadeEspecifica;
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / velocidadeEspecifica; // Tempo em horas
    }
}