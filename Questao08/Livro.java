package Questao08;

class Livro extends MaterialBiblioteca {
    private static final double TAXA_LIVRO = 1.0;

    public Livro(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) throws AtrasoInvalidoException {
        if (diasAtraso < 0) {
            throw new AtrasoInvalidoException("Erro: Os dias de atraso não podem ser negativos.");
        }
        return diasAtraso * TAXA_LIVRO;
    }
}