package Questao17;

class LivroEmprestavel extends Livro implements Emprestavel {
    boolean emprestado = false;

    public LivroEmprestavel(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public boolean emprestar(Usuario usuario) throws MaterialIndisponivelException {
        if (emprestado) {
            throw new MaterialIndisponivelException("Erro: O livro '" + titulo + "' já está emprestado.");
        }
        emprestado = true;
        try {
            usuario.adicionarMaterial(this);
        } catch (MaterialInvalidoException e) {
            
            System.err.println("Erro ao associar livro ao usuário: " + e.getMessage());
            emprestado = false; // Desfaz o empréstimo
            return false;
        }
        System.out.println("Livro '" + titulo + "' emprestado para " + usuario.nome + ".");
        return true;
    }

    @Override
    public boolean devolver(Usuario usuario) {
        if (emprestado && usuario.materiaisEmprestados.remove(this)) {
            emprestado = false;
            System.out.println("Livro '" + titulo + "' devolvido por " + usuario.nome + ".");
            return true;
        }
        System.out.println("Erro ao devolver o livro '" + titulo + "' por " + usuario.nome + ".");
        return false;
    }
}