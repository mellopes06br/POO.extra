package Questao04;

public class Produto {
    private String nomeProd;
    private double precoProd;

    public Produto() {

    }

    public Produto(String nomeProd, double precoProd) {
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public int calcularGarantia() {
        return 1; // Garantia padrão de 1 ano
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNomeProd());
        System.out.println("Preço: " + getPrecoProd());
        System.out.println("Garantia: " + calcularGarantia() + " ano(s)");
    }
}
