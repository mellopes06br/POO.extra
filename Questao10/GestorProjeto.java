package Questao10;

import java.util.ArrayList;
import java.util.List;

class GestorProjeto {
    private List<MembroEquipe> equipe = new ArrayList<>();

    public void adicionarMembro(MembroEquipe membro) throws MembroInvalidoException {
        if (membro == null) {
            throw new MembroInvalidoException("Erro: Não é possível adicionar um membro de equipe nulo.");
        }
        equipe.add(membro);
    }

    public String exibirRelatorio(MembroEquipe membro) {
        return membro.obterDetalhes() + ", Tarefa atual: " + membro.trabalhar();
    }

    public List<MembroEquipe> listarEquipePorProjeto(String projeto) {
        List<MembroEquipe> membrosDoProjeto = new ArrayList<>();
        for (MembroEquipe membro : equipe) {
            if (membro.projeto.equals(projeto)) {
                membrosDoProjeto.add(membro);
            }
        }
        return membrosDoProjeto;
    }

    public static void main(String[] args) {
        GestorProjeto gestor = new GestorProjeto();

        try {
            Desenvolvedor dev1 = new Desenvolvedor("Ricardo", "Alpha");
            Designer designer1 = new Designer("Mariana", "Beta");
            GerenteDeProjetos gerente1 = new GerenteDeProjetos("Carlos", "Alpha");

            gestor.adicionarMembro(dev1);
            gestor.adicionarMembro(designer1);
            gestor.adicionarMembro(gerente1);
            gestor.adicionarMembro(new Desenvolvedor("Ana", "Beta"));

            System.out.println(gestor.exibirRelatorio(dev1));
            System.out.println(gestor.exibirRelatorio(designer1));
            System.out.println(gestor.exibirRelatorio(gerente1));

            System.out.println("\nMembros do projeto Alpha:");
            List<MembroEquipe> equipeAlpha = gestor.listarEquipePorProjeto("Alpha");
            for (MembroEquipe membro : equipeAlpha) {
                System.out.println(membro.obterDetalhes());
            }

            System.out.println("\nMembros do projeto Beta:");
            List<MembroEquipe> equipeBeta = gestor.listarEquipePorProjeto("Beta");
            for (MembroEquipe membro : equipeBeta) {
                System.out.println(membro.obterDetalhes());
            }

            gestor.adicionarMembro(null); // Tentando adicionar um membro nulo
        } catch (MembroInvalidoException e) {
            System.err.println("Erro ao adicionar membro: " + e.getMessage());
        }
    }
}