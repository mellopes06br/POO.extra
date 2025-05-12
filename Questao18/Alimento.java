package Questao18;

class Alimento extends Produto {
    public Alimento(String nome, double preco) throws PrecoInvalidoException {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05; // 5% de desconto
    }
}