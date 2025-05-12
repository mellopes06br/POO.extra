package Questao08;

class DVD extends MaterialBiblioteca {
    private static final double TAXA_DVD = 5.0;

    public DVD(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) throws AtrasoInvalidoException {
        if (diasAtraso < 0) {
            throw new AtrasoInvalidoException("Erro: Os dias de atraso não podem ser negativos.");
        }
        return TAXA_DVD;
    }
}