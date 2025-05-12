package Questao09;

class EditorImagem {
    public String exibirInformacoes(Imagem imagem) {
        return "Largura: " + imagem.largura + " pixels, Altura: " + imagem.altura + " pixels. Processamento: " + imagem.processar();
    }

    public Imagem ajustarImagem(Imagem imagem, int novaLargura, int novaAltura) {
        try {
            if (imagem instanceof ImagemColorida) {
                return new ImagemColorida(novaLargura, novaAltura);
            } else if (imagem instanceof ImagemPretoBranco) {
                return new ImagemPretoBranco(novaLargura, novaAltura);
            } else if (imagem instanceof ImagemTransparente) {
                return new ImagemTransparente(novaLargura, novaAltura);
            }
        } catch (DimensaoInvalidaException e) {
            System.err.println("Erro ao ajustar imagem: " + e.getMessage());
            return null; // Retorna null em caso de dimensões inválidas
        }
        return null; // 
    }

    public static void main(String[] args) {
        try {
            EditorImagem editor = new EditorImagem();

            ImagemColorida imagemColorida = new ImagemColorida(800, 600);
            System.out.println(editor.exibirInformacoes(imagemColorida));
            System.out.println("Tamanho: " + imagemColorida.calcularTamanho() + " pixels.");

            ImagemPretoBranco imagemPB = new ImagemPretoBranco(300, 200);
            System.out.println(editor.exibirInformacoes(imagemPB));
            System.out.println("Tamanho: " + imagemPB.calcularTamanho() + " pixels.");

            ImagemTransparente imagemTransparente = new ImagemTransparente(400, 400);
            System.out.println(editor.exibirInformacoes(imagemTransparente));
            System.out.println("Tamanho: " + imagemTransparente.calcularTamanho() + " pixels.");

            Imagem novaImagem = editor.ajustarImagem(imagemColorida, 1024, 768);
            if (novaImagem != null) {
                System.out.println("Nova imagem (colorida) - Largura: " + novaImagem.largura + ", Altura: " + novaImagem.altura);
            }

            Imagem novaImagemPB = editor.ajustarImagem(imagemPB, -100, 200); // Tentando criar com largura inválida
            if (novaImagemPB != null) {
                System.out.println("Nova imagem (P&B) - Largura: " + novaImagemPB.largura + ", Altura: " + novaImagemPB.altura);
            }

        } catch (DimensaoInvalidaException e) {
            System.err.println("Erro ao criar imagem: " + e.getMessage());
        }
    }
}