package Questao06;

class CartaoCredito extends MetodoPagamento {
    public CartaoCredito(double taxa) {
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor) throws TaxaInvalidaException {
        if (this.taxa < 0) {
            throw new TaxaInvalidaException("Erro: A taxa do cartão de crédito não pode ser negativa.");
        }
        if (this.taxa < 0.02) {
            System.out.println("Pagamento com Cartão de Crédito processado com sucesso.");
            return true;
        } else {
            System.out.println("Erro: Taxa de cartão de crédito excede o limite permitido.");
            return false;
        }
    }
}
