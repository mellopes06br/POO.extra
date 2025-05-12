package Questao13;

interface ProcessadorPagamento {
    boolean autorizarPagamento(double valor) throws ValorInvalidoException;
    boolean processarPagamento(double valor) throws PagamentoNaoAutorizadoException;
}