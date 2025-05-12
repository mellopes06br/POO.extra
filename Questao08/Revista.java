package Questao08;

class Revista extends MaterialBiblioteca {
    private static final double TAXA_REVISTA = 2.0;

    public Revista(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) throws AtrasoInvalidoException {
        if (diasAtraso < 0) {
            throw new AtrasoInvalidoException("Erro: Os dias de atraso não podem ser negativos.");
        }
        return diasAtraso * TAXA_REVISTA;
    }
}