package Questao18;

public abstract class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) throws PrecoInvalidoException {
        if (preco <= 0) {
            throw new PrecoInvalidoException("Erro: O preço do produto deve ser maior que zero.");
        }
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularDesconto();

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}