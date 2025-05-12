package Questao09;

public abstract class Imagem {
    int largura;
    int altura;

    public Imagem(int largura, int altura) throws DimensaoInvalidaException {
        if (largura <= 0 || altura <= 0) {
            throw new DimensaoInvalidaException("Erro: As dimensões da imagem devem ser maiores que zero.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularTamanho() {
        return largura * altura;
    }

    public abstract String processar();
}