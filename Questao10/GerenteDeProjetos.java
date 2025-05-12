package Questao10;

class GerenteDeProjetos extends MembroEquipe {
    public GerenteDeProjetos(String nome, String projeto) {
        super(nome, projeto);
    }

    @Override
    public String trabalhar() {
        return "Coordenando o progresso do projeto " + projeto + ".";
    }
}