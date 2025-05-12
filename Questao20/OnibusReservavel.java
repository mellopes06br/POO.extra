package Questao20;

class OnibusReservavel extends Onibus implements Reservavel {
    private boolean reservado = false;

    public OnibusReservavel(String modelo, int capacidade) throws CapacidadeInvalidaException {
        super(modelo, capacidade);
    }

    @Override
    public boolean reservar(String data, Rota rota) throws RotaInvalidaException {
        if (rota == null) {
            throw new RotaInvalidaException("Erro: A rota para reserva não pode ser nula.");
        }
        if (reservado) {
            System.out.println("Ônibus " + getModelo() + " já está reservado para " + data + " na rota " + rota.getOrigem() + " - " + rota.getDestino() + ".");
            return false;
        }
        reservado = true;
        System.out.println("Ônibus " + getModelo() + " reservado para " + data + " na rota " + rota.getOrigem() + " - " + rota.getDestino() + ".");
        return true;
    }
}