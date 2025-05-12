package Questao14;

import java.util.Random;

class ExportadorPDF implements ExportadorRelatorio {
    @Override
    public String exportar(String titulo, String conteudo) throws ExportacaoFalhouException {
        System.out.println("Exportando relatório '" + titulo + "' para PDF...");
        // Simula uma possível falha na exportação
        if (new Random().nextDouble() < 0.05) {
            throw new ExportacaoFalhouException("Erro ao exportar relatório '" + titulo + "' para PDF.");
        }
        return "Relatório '" + titulo + "' exportado com sucesso para PDF.";
    }
}