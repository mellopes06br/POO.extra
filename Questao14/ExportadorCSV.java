package Questao14;

import java.util.Random;

class ExportadorCSV implements ExportadorRelatorio {
    @Override
    public String exportar(String titulo, String conteudo) throws ExportacaoFalhouException {
        System.out.println("Exportando relatório '" + titulo + "' para CSV...");
        // Simula uma possível falha na exportação
        if (new Random().nextDouble() < 0.03) {
            throw new ExportacaoFalhouException("Erro ao exportar relatório '" + titulo + "' para CSV.");
        }
        return "Relatório '" + titulo + "' exportado com sucesso para CSV.";
    }
}