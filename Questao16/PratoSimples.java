package Questao16;

class PratoSimples implements Preparo {
    private String nomePrato;

    public PratoSimples(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    @Override
    public String preparar() {
        return "Preparando o prato simples: " + nomePrato + ". Cozinhar e servir.";
    }
}