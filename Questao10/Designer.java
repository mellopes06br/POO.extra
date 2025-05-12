package Questao10;

class Designer extends MembroEquipe {
    public Designer(String nome, String projeto) {
        super(nome, projeto);
    }

    @Override
    public String trabalhar() {
        return "Criando design para o projeto " + projeto + ".";
    }
}