package Questao19;

public abstract class Tarefa {
    String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public abstract String realizarTarefa();
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
