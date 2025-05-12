package Questao17;

class RevistaEmprestavel extends Revista implements Emprestavel {
    boolean emprestado = false;

    public RevistaEmprestavel(String titulo, String edicao) {
        super(titulo, edicao);
    }

    @Override
    public boolean emprestar(Usuario usuario) throws MaterialIndisponivelException {
        if (emprestado) {
            throw new MaterialIndisponivelException("Erro: A revista '" + titulo + "' já está emprestada.");
        }
        emprestado = true;
        try {
            usuario.adicionarMaterial(this);
        } catch (MaterialInvalidoException e) {
            System.err.println("Erro ao associar revista ao usuário: " + e.getMessage());
            emprestado = false;
            return false;
        }
        System.out.println("Revista '" + titulo + "' emprestada para " + usuario.nome + ".");
        return true;
    }

    @Override
    public boolean devolver(Usuario usuario) {
        if (emprestado && usuario.materiaisEmprestados.remove(this)) {
            emprestado = false;
            System.out.println("Revista '" + titulo + "' devolvida por " + usuario.nome + ".");
            return true;
        }
        System.out.println("Erro ao devolver a revista '" + titulo + "' por " + usuario.nome + ".");
        return false;
    }
}