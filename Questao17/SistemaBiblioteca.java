package Questao17;

class SistemaBiblioteca {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");

        LivroEmprestavel livro1 = new LivroEmprestavel("O Senhor dos Anéis", "J.R.R. Tolkien");
        RevistaEmprestavel revista1 = new RevistaEmprestavel("National Geographic", "Maio 2025");
        DVDEmprestavel dvd1 = new DVDEmprestavel("Interestelar", "Christopher Nolan");

        try {
            livro1.emprestar(usuario1);
            revista1.emprestar(usuario1);
            dvd1.emprestar(usuario2);

            System.out.println("\n" + usuario1.listarMateriaisEmprestados());
            System.out.println("\n" + usuario2.listarMateriaisEmprestados());

            livro1.devolver(usuario1);
            System.out.println("\n" + usuario1.listarMateriaisEmprestados());

            // Tentando emprestar um livro já emprestado
            livro1.emprestar(usuario2);

        } catch (MaterialIndisponivelException e) {
            System.err.println("Erro ao emprestar material: " + e.getMessage());
        }
    }
}