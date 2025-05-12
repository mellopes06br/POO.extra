package Questao20;

class Moto extends Veiculo {
    private static final double VELOCIDADE_PADRAO = 80.0; // km/h

    public Moto(String modelo, int capacidade) throws CapacidadeInvalidaException {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE_PADRAO; // Tempo em horas
    }
}