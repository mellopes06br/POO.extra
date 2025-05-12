package Questao16;

class Proteina extends Ingrediente {
    String tipo;

    public Proteina(String nome, double quantidade, String tipo) throws QuantidadeInvalidaException {
        super(nome, quantidade);
        this.tipo = tipo;
    }

    @Override
    public String informar() {
        return nome + " (" + quantidade + "g de proteína " + tipo + ")";
    }
}