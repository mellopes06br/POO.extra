package Questao13;

class ProcessadorPix implements ProcessadorPagamento {
    private boolean autorizado = true; // Pix é geralmente instantâneo

    @Override
    public boolean autorizarPagamento(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Erro: O valor do pagamento deve ser maior que zero.");
        }
        System.out.println("Pix: Autorização instantânea para R$" + String.format("%.2f", valor) + ".");
        return autorizado;
    }

    @Override
    public boolean processarPagamento(double valor) throws PagamentoNaoAutorizadoException {
        if (!autorizado) {
            throw new PagamentoNaoAutorizadoException("Erro: Pagamento Pix não autorizado (improvável).");
        }
        System.out.println("Pix: Pagamento de R$" + String.format("%.2f", valor) + " processado com sucesso.");
        return true;
    }
}