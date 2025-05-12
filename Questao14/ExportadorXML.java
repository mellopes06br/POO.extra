package Questao14;

import java.util.Random;

class ExportadorXML implements ExportadorRelatorio {
    @Override
    public String exportar(String titulo, String conteudo) throws ExportacaoFalhouException {
        System.out.println("Exportando relatório '" + titulo + "' para XML...");
        // Simula uma possível falha na exportação
        if (new Random().nextDouble() < 0.08) {
            throw new ExportacaoFalhouException("Erro ao exportar relatório '" + titulo + "' para XML.");
        }
        return "Relatório '" + titulo + "' exportado com sucesso para XML.";
    }
}