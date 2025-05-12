package Questao14;

class SistemaRelatorios {
    public String exportarRelatorio(ExportadorRelatorio exportador, String titulo, String conteudo) {
        try {
            return exportador.exportar(titulo, conteudo);
        } catch (ExportacaoFalhouException e) {
            System.err.println("Erro ao exportar relatório: " + e.getMessage());
            return "Falha ao exportar relatório '" + titulo + "'.";
        }
    }

    public static void main(String[] args) {
        SistemaRelatorios sistema = new SistemaRelatorios();
        String tituloRelatorio = "Relatório de Vendas Mensal";
        String conteudoRelatorio = "Produto,Quantidade,Preço\nCaneta,150,1.50\nLápis,300,0.75\nBorracha,75,1.00";

        ExportadorPDF pdfExporter = new ExportadorPDF();
        String resultadoPDF = sistema.exportarRelatorio(pdfExporter, tituloRelatorio, conteudoRelatorio);
        System.out.println(resultadoPDF);
        System.out.println("---");

        ExportadorCSV csvExporter = new ExportadorCSV();
        String resultadoCSV = sistema.exportarRelatorio(csvExporter, tituloRelatorio, conteudoRelatorio);
        System.out.println(resultadoCSV);
        System.out.println("---");

        ExportadorXML xmlExporter = new ExportadorXML();
        String resultadoXML = sistema.exportarRelatorio(xmlExporter, tituloRelatorio, conteudoRelatorio);
        System.out.println(resultadoXML);
    }
}