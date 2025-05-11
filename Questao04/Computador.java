package Questao04;

public class Computador extends Produto {
    public Computador(String nomeProd, double precoProd) {
        super(nomeProd, precoProd);
    }

    @Override
    public int calcularGarantia() {
        return 3; // Computador tem 3 anos de garantia
    }
}
