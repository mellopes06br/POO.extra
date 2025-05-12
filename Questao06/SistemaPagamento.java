package Questao06;

public class SistemaPagamento {
     public boolean efetuarPagamento(MetodoPagamento metodo, double valor) {
        try {
            boolean sucesso = metodo.processarPagamento(valor);
            if (sucesso) {
                System.out.println("Taxa aplicada: R$" + String.format("%.2f", metodo.calcularTaxa(valor)));
            }
            return sucesso;
        } catch (TaxaInvalidaException e) {
            System.err.println("Erro ao processar pagamento: " + e.getMessage());
            return false;
        }
    }
}
