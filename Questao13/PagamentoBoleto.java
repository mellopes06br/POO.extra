package Questao13;

class ProcessadorBoleto implements ProcessadorPagamento {
    private boolean autorizado = false;

    @Override
    public boolean autorizarPagamento(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Erro: O valor do pagamento deve ser maior que zero.");
        }
        autorizado = valor > 10.0;
        System.out.println("Boleto: Verificando valor para autorização de R$" + String.format("%.2f", valor) + "...");
        if (autorizado) {
            System.out.println("Boleto: Pagamento autorizado (valor superior a R$10.00).");
        } else {
            System.out.println("Boleto: Pagamento não autorizado (valor inferior ou igual a R$10.00).");
        }
        return autorizado;
    }

    @Override
    public boolean processarPagamento(double valor) throws PagamentoNaoAutorizadoException {
        if (!autorizado) {
            throw new PagamentoNaoAutorizadoException("Erro: Pagamento com boleto não autorizado.");
        }
        System.out.println("Boleto: Pagamento de R$" + String.format("%.2f", valor) + " processado.");
        return true;
    }
}
