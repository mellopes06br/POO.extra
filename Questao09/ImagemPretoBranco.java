package Questao09;

class ImagemPretoBranco extends Imagem {
    public ImagemPretoBranco(int largura, int altura) throws DimensaoInvalidaException {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Imagem em preto e branco processada: conversão para tons de cinza.";
    }
}