package Questao20;

interface Reservavel {
    boolean reservar(String data, Rota rota) throws RotaInvalidaException;
}
