package Questao18;

class Eletronico extends Produto {
    public Eletronico(String nome, double preco) throws PrecoInvalidoException {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.10; // 10% de desconto
    }
}
