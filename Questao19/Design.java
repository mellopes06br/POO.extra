package Questao19;

class Design extends Tarefa {
    public Design(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Design: " + descricao + " finalizado.";
    }
}
