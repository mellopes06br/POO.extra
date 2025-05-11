package Questao04;

public class Smartphone extends Produto {
    public Smartphone(String nomeProd, double precoProd) {
        super(nomeProd, precoProd);
    }

    @Override
    public int calcularGarantia() {
        return 2; // Smartphone tem 2 anos de garantia
    }
}
