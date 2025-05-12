package Questao06;

public class Pix extends MetodoPagamento {
    public Pix() {
        super(0.0); // Pix não tem taxa
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix processado instantaneamente.");
        return true;
    }
}
