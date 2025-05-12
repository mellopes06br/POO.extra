package Questao18;

class Vestuario extends Produto {
    public Vestuario(String nome, double preco) throws PrecoInvalidoException {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.15; // 15% de desconto
    }
}