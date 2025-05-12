package Questao20;

class Onibus extends Veiculo {
    private static final double VELOCIDADE_MEDIA = 60.0; // km/h

    public Onibus(String modelo, int capacidade) throws CapacidadeInvalidaException {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / VELOCIDADE_MEDIA; // Tempo em horas
    }

}