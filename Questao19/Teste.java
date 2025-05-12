package Questao19;

class Teste extends Tarefa {
    public Teste(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Teste: " + descricao + " executado.";
    }
}