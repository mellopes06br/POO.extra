package Questao06;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        try {
            MetodoPagamento cartaoTaxaNegativa = new CartaoCredito(-0.01);
            sistema.efetuarPagamento(cartaoTaxaNegativa, 100.0);
        } catch (Exception e) {
            System.err.println("Erro ao criar método de pagamento: " + e.getMessage());
        }

        MetodoPagamento cartao = new CartaoCredito(0.015);
        sistema.efetuarPagamento(cartao, 200.0);

        MetodoPagamento cartaoTaxaAlta = new CartaoCredito(0.03);
        sistema.efetuarPagamento(cartaoTaxaAlta, 35.0);

        MetodoPagamento pix = new Pix();
        sistema.efetuarPagamento(pix, 87.0);

        MetodoPagamento boleto = new Boleto();
        sistema.efetuarPagamento(boleto, 387.0);
    }
}
