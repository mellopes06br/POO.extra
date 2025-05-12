package Questao07;

class Aviao extends Veiculo {
    public Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoDeCombustivel() {
        return "Querosene de aviação";
    }
}