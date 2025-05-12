package Questao12;

class DescontoSazonal implements EstrategiaDesconto {
    private static final double TAXA_DESCONTO = 0.10; // 10%

    @Override
    public double calcularDesconto(double preco) throws PrecoInvalidoException {
        if (preco < 0) {
            throw new PrecoInvalidoException("Erro: O preço não pode ser negativo.");
        }
        return preco * TAXA_DESCONTO;
    }
}