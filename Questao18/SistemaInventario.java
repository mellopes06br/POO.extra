package Questao18;

class SistemaInventario {
    public static void main(String[] args) {
        Fornecedor fornecedorEletronicos = new Fornecedor("TechMaster");
        Fornecedor fornecedorAlimentos = new Fornecedor("Saboroso Alimentos");
        Fornecedor fornecedorVestuario = new Fornecedor("Estilo Elegante");

        try {
            Produto tv = new Eletronico("Smart TV 50\"", 1800.00);
            Produto arroz = new Alimento("Arroz Tipo 1 (5kg)", 25.00);
            Produto camiseta = new Vestuario("Camiseta Algodão", 45.00);

            fornecedorEletronicos.fornecerProduto(tv);
            fornecedorAlimentos.fornecerProduto(arroz);
            fornecedorVestuario.fornecerProduto(camiseta);

            System.out.println("\n" + fornecedorEletronicos.listarProdutosFornecidos());
            System.out.println("\n" + fornecedorAlimentos.listarProdutosFornecidos());
            System.out.println("\n" + fornecedorVestuario.listarProdutosFornecidos());

            System.out.println("\nDesconto da TV: R$" + String.format("%.2f", tv.calcularDesconto()));
            System.out.println("Desconto do Arroz: R$" + String.format("%.2f", arroz.calcularDesconto()));
            System.out.println("Desconto da Camiseta: R$" + String.format("%.2f", camiseta.calcularDesconto()));

            // Tentando criar produto com preço inválido
            // Produto produtoInvalido = new Eletronico("Mouse", -10.00);

            // Tentando adicionar produto nulo
            // fornecedorEletronicos.adicionarProduto(null);

        } catch (PrecoInvalidoException e) {
            System.err.println("Erro ao criar produto: " + e.getMessage());
        }
    }
}