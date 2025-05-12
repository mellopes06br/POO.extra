package Questao17;

import java.util.ArrayList;
import java.util.List;

class Usuario {
    String nome;
    List<Material> materiaisEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.materiaisEmprestados = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) throws MaterialInvalidoException {
        if (material == null) {
            throw new MaterialInvalidoException("Erro: Não é possível adicionar um material nulo.");
        }
        this.materiaisEmprestados.add(material);
    }

    public String listarMateriaisEmprestados() {
        if (materiaisEmprestados.isEmpty()) {
            return nome + " não possui nenhum material emprestado.";
        }
        StringBuilder lista = new StringBuilder("Materiais emprestados por " + nome + ":\n");
        for (Material material : materiaisEmprestados) {
            lista.append("- ").append(material.informarMaterial()).append("\n");
        }
        return lista.toString();
    }
}