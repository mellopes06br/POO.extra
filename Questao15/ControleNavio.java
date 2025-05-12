package Questao15;

class ControleNavio implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) throws DestinoInvalidoException {
        if (destino == null || destino.trim().isEmpty()) {
            throw new DestinoInvalidoException("Erro: O destino da navegação não pode ser vazio.");
        }
        return "Navio autônomo: Definindo rota para " + destino + ".";
    }

    @Override
    public String ajustarVelocidade(double velocidade) throws VelocidadeInvalidaException {
        if (velocidade < 0) {
            throw new VelocidadeInvalidaException("Erro: A velocidade do navio não pode ser negativa.");
        }
        return "Navio autônomo: Velocidade ajustada para " + String.format("%.2f", velocidade) + " nós.";
    }
}