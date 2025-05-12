package Questao18;

import java.util.ArrayList;
import java.util.List;

class Fornecedor implements Fornecimento {
    String nome;
    List<Produto> produtosFornecidos;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtosFornecidos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) throws ProdutoInvalidoException {
        if (produto == null) {
            throw new ProdutoInvalidoException("Erro: Não é possível adicionar um produto nulo.");
        }
        this.produtosFornecidos.add(produto);
    }

    public String listarProdutosFornecidos() {
        if (produtosFornecidos.isEmpty()) {
            return nome + " não fornece nenhum produto.";
        }
        StringBuilder lista = new StringBuilder("Produtos fornecidos por " + nome + ":\n");
        for (Produto produto : produtosFornecidos) {
            lista.append("- ").append(produto.getNome()).append(" (Preço: R$").append(String.format("%.2f", produto.getPreco())).append(")\n");
        }
        return lista.toString();
    }

    @Override
    public boolean fornecerProduto(Produto produto) {
        try {
            adicionarProduto(produto);
            System.out.println(nome + " forneceu o produto: " + produto.getNome());
            return true;
        } catch (ProdutoInvalidoException e) {
            System.err.println("Erro ao fornecer produto por " + nome + ": " + e.getMessage());
            return false;
        }
    }
}