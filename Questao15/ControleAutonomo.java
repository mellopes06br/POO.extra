package Questao15;

interface ControleAutonomo {
    String iniciarRota(String destino) throws DestinoInvalidoException;
    String ajustarVelocidade(double velocidade) throws VelocidadeInvalidaException;
}