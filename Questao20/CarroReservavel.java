package Questao20;

class CarroReservavel extends Carro implements Reservavel {
    private boolean reservado = false;

    public CarroReservavel(String modelo, int capacidade, double velocidadeEspecifica) throws CapacidadeInvalidaException, VelocidadeInvalidaException {
        super(modelo, capacidade, velocidadeEspecifica);
    }

    @Override
    public boolean reservar(String data, Rota rota) throws RotaInvalidaException {
        if (rota == null) {
            throw new RotaInvalidaException("Erro: A rota para reserva não pode ser nula.");
        }
        if (reservado) {
            System.out.println("Carro " + getModelo() + " já está reservado para " + data + " na rota " + rota.getOrigem() + " - " + rota.getDestino() + ".");
            return false;
        }
        reservado = true;
        System.out.println("Carro " + getModelo() + " reservado para " + data + " na rota " + rota.getOrigem() + " - " + rota.getDestino() + ".");
        return true;
    }
}