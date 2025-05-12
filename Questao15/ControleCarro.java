package Questao15;

class ControleCarro implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) throws DestinoInvalidoException {
        if (destino == null || destino.trim().isEmpty()) {
            throw new DestinoInvalidoException("Erro: O destino da rota não pode ser vazio.");
        }
        return "Carro autônomo: Iniciando rota para " + destino + ".";
    }

    @Override
    public String ajustarVelocidade(double velocidade) throws VelocidadeInvalidaException {
        if (velocidade < 0) {
            throw new VelocidadeInvalidaException("Erro: A velocidade do carro não pode ser negativa.");
        }
        return "Carro autônomo: Velocidade ajustada para " + String.format("%.2f", velocidade) + " km/h.";
    }
}