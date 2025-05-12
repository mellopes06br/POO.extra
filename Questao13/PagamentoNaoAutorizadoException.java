package Questao13;

class PagamentoNaoAutorizadoException extends Exception {
    public PagamentoNaoAutorizadoException(String message) {
        super(message);
    }
}