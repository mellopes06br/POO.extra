package Questao13;

import java.util.Random;

class ProcessadorCartao implements ProcessadorPagamento {
    private boolean autorizado = false;

    @Override
    public boolean autorizarPagamento(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Erro: O valor do pagamento deve ser maior que zero.");
        }
        // Simula a autorização do cartão
        autorizado = new Random().nextBoolean();
        System.out.println("Cartão: Tentando autorizar pagamento de R$" + String.format("%.2f", valor) + "...");
        return autorizado;
    }

    @Override
    public boolean processarPagamento(double valor) throws PagamentoNaoAutorizadoException {
        if (!autorizado) {
            throw new PagamentoNaoAutorizadoException("Erro: Pagamento com cartão não autorizado.");
        }
        System.out.println("Cartão: Pagamento de R$" + String.format("%.2f", valor) + " processado com sucesso.");
        return true;
    }
}