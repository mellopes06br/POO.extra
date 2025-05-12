package Questao17;

interface Emprestavel {
    boolean emprestar(Usuario usuario) throws MaterialIndisponivelException;
    boolean devolver(Usuario usuario);
}