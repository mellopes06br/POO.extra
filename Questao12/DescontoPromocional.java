package Questao12;

class DescontoPromocional implements EstrategiaDesconto {
    private static final double DESCONTO_FIXO = 20.00;

    @Override
    public double calcularDesconto(double preco) throws PrecoInvalidoException {
        if (preco < 0) {
            throw new PrecoInvalidoException("Erro: O preço não pode ser negativo.");
        }
        return DESCONTO_FIXO;
    }
}