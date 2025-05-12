package Questao12;

class GestorDeDescontos {
    public double aplicarDesconto(EstrategiaDesconto estrategia, double preco) {
        try {
            double desconto = estrategia.calcularDesconto(preco);
            return preco - desconto;
        } catch (PrecoInvalidoException e) {
            System.err.println("Erro ao aplicar desconto: " + e.getMessage());
            return preco; // Retorna o preço original em caso de erro
        }
    }

    public static void main(String[] args) {
        GestorDeDescontos gestor = new GestorDeDescontos();
        double precoBase = 300.00;

        EstrategiaDesconto descontoFidelidade = new DescontoFidelidade();
        double precoComFidelidade = gestor.aplicarDesconto(descontoFidelidade, precoBase);
        System.out.println("Preço com Desconto Fidelidade: R$" + String.format("%.2f", precoComFidelidade));

        EstrategiaDesconto descontoSazonal = new DescontoSazonal();
        double precoComSazonal = gestor.aplicarDesconto(descontoSazonal, precoBase);
        System.out.println("Preço com Desconto Sazonal: R$" + String.format("%.2f", precoComSazonal));

        EstrategiaDesconto descontoPromocional = new DescontoPromocional();
        double precoComPromocional = gestor.aplicarDesconto(descontoPromocional, precoBase);
        System.out.println("Preço com Desconto Promocional: R$" + String.format("%.2f", precoComPromocional));

        double precoNegativo = -50.00;
        double descontoEmNegativo = gestor.aplicarDesconto(descontoFidelidade, precoNegativo);
        System.out.println("Preço com Desconto em valor negativo: R$" + String.format("%.2f", descontoEmNegativo));
    }
}