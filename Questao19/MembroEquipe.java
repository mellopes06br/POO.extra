package Questao19;

import java.util.ArrayList;
import java.util.List;

class MembroEquipe {
    String nome;
    Papel papel;
    List<Tarefa> tarefas;

    public MembroEquipe(String nome, Papel papel) throws PapelInvalidoException {
        if (papel == null) {
            throw new PapelInvalidoException("Erro: O papel do membro da equipe não pode ser nulo.");
        }
        this.nome = nome;
        this.papel = papel;
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) throws TarefaInvalidaException {
        if (tarefa == null) {
            throw new TarefaInvalidaException("Erro: Não é possível adicionar uma tarefa nula.");
        }
        this.tarefas.add(tarefa);
    }

    public String listarTarefas() {
        if (tarefas.isEmpty()) {
            return nome + " não possui nenhuma tarefa.";
        }
        StringBuilder lista = new StringBuilder("Tarefas de " + nome + " (" + papel.executarPapel() + "):\n");
        for (Tarefa tarefa : tarefas) {
            lista.append("- ").append(tarefa.descricao).append(" (").append(tarefa.realizarTarefa()).append(")\n");
        }
        return lista.toString();
    }

    public String getNome() {
        return nome;
    }
    public Papel getPapel() {
        return papel;
    }
    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}