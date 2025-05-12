package Questao15;

class ControleDrone implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) throws DestinoInvalidoException {
        if (destino == null || destino.trim().isEmpty()) {
            throw new DestinoInvalidoException("Erro: O destino do voo não pode ser vazio.");
        }
        return "Drone autônomo: Iniciando voo para " + destino + ".";
    }

    @Override
    public String ajustarVelocidade(double velocidade) throws VelocidadeInvalidaException {
        if (velocidade < 0) {
            throw new VelocidadeInvalidaException("Erro: A velocidade do drone não pode ser negativa.");
        }
        return "Drone autônomo: Velocidade ajustada para " + String.format("%.2f", velocidade) + " m/s.";
    }
}