package Questao06;

public class Boleto extends MetodoPagamento {
    private static final double TAXA_BOLETO = 0.05;

    public Boleto() {
        super(TAXA_BOLETO);
    }

    @Override
    public boolean processarPagamento(double valor) {
        double valorComTaxa = valor + calcularTaxa(valor);
        System.out.println("Boleto gerado. Valor total com taxa: R$" + String.format("%.2f", valorComTaxa));
        return true;
    }
}
