package Questao04;

public class Main {
     public static void main(String[] args) {
        Loja minhaLoja = new Loja();

       
        Computador computador1 = new Computador("Galaxy Book 4", 5489.00);
        Smartphone smartphone1 = new Smartphone("Motorola G20", 3503.00);
        Tablet tablet1 = new Tablet("Samsung S9", 2700.00);
        Computador computador2 = new Computador("MacBook Pro", 12300.00);
        Smartphone smartphone2 = new Smartphone("iPhone 15", 4876.00);

        minhaLoja.adicionarProduto(computador1);
        minhaLoja.adicionarProduto(smartphone1);
        minhaLoja.adicionarProduto(tablet1);
        minhaLoja.adicionarProduto(computador2);
        minhaLoja.adicionarProduto(smartphone2);

        minhaLoja.listarGarantias();

        minhaLoja.listarProdutosComInformacoes();
    }
}
