package Questao09;

class ImagemColorida extends Imagem {
    public ImagemColorida(int largura, int altura) throws DimensaoInvalidaException {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Imagem colorida processada: filtro de saturação aplicado.";
    }
}