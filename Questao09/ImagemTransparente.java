package Questao09;

class ImagemTransparente extends Imagem {
    public ImagemTransparente(int largura, int altura) throws DimensaoInvalidaException {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Imagem transparente processada: máscara de transparência aplicada.";
    }
}