package Questao16;

public abstract class Ingrediente {
    String nome;
    double quantidade;

    public Ingrediente(String nome, double quantidade) throws QuantidadeInvalidaException {
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("Erro: A quantidade do ingrediente deve ser maior que zero.");
        }
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract String informar();
}