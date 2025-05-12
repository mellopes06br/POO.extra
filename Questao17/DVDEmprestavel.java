package Questao17;

class DVDEmprestavel extends DVD implements Emprestavel {
    boolean emprestado = false;

    public DVDEmprestavel(String titulo, String diretor) {
        super(titulo, diretor);
    }

    @Override
    public boolean emprestar(Usuario usuario) throws MaterialIndisponivelException {
        if (emprestado) {
            throw new MaterialIndisponivelException("Erro: O DVD '" + titulo + "' já está emprestado.");
        }
        emprestado = true;
        try {
            usuario.adicionarMaterial(this);
        } catch (MaterialInvalidoException e) {
            System.err.println("Erro ao associar DVD ao usuário: " + e.getMessage());
            emprestado = false;
            return false;
        }
        System.out.println("DVD '" + titulo + "' emprestado para " + usuario.nome + ".");
        return true;
    }

    @Override
    public boolean devolver(Usuario usuario) {
        if (emprestado && usuario.materiaisEmprestados.remove(this)) {
            emprestado = false;
            System.out.println("DVD '" + titulo + "' devolvido por " + usuario.nome + ".");
            return true;
        }
        System.out.println("Erro ao devolver o DVD '" + titulo + "' por " + usuario.nome + ".");
        return false;
    }
}