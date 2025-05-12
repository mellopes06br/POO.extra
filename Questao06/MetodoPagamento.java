package Questao06;

public abstract class MetodoPagamento {
    double taxa;

    public MetodoPagamento(double taxa) {
        this.taxa = taxa;
    }

    public abstract boolean processarPagamento(double valor) throws TaxaInvalidaException;

    public double calcularTaxa(double valor) {
        return valor * this.taxa;
    }
}
