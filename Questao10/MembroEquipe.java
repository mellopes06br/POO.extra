package Questao10;

public abstract class MembroEquipe {
    String nome;
    String projeto;

    public MembroEquipe(String nome, String projeto) {
        this.nome = nome;
        this.projeto = projeto;
    }

    public abstract String trabalhar();

    public String obterDetalhes() {
        return "Nome: " + nome + ", Projeto: " + projeto;
    }
}