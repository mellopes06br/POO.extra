package Questao07;

class Carro extends Veiculo {
    public Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoDeCombustivel() {
        return "Gasolina";
    }
}