package Questao19;

class SistemaGestaoProjetos {
    public static void main(String[] args) {
        try {
            Papel devPapel = new DesenvolvedorPapel();
            Papel designerPapel = new DesignerPapel();
            Papel testerPapel = new TesterPapel();

            MembroEquipe membro1 = new MembroEquipe("Ricardo", devPapel);
            MembroEquipe membro2 = new MembroEquipe("Mariana", designerPapel);
            MembroEquipe membro3 = new MembroEquipe("Carlos", testerPapel);

            Tarefa desenvolvimento1 = new Desenvolvimento("Implementar a funcionalidade de login");
            Tarefa design1 = new Design("Criar o layout da página inicial");
            Tarefa teste1 = new Teste("Testar a funcionalidade de login");
            Tarefa desenvolvimento2 = new Desenvolvimento("Implementar o carrinho de compras");

            membro1.adicionarTarefa(desenvolvimento1);
            membro1.adicionarTarefa(desenvolvimento2);
            membro2.adicionarTarefa(design1);
            membro3.adicionarTarefa(teste1);

            System.out.println(membro1.listarTarefas());
            System.out.println(membro2.listarTarefas());
            System.out.println(membro3.listarTarefas());

            // Tentando adicionar uma tarefa nula
            // membro1.adicionarTarefa(null);

            // Tentando criar um membro com papel nulo
            // MembroEquipe membro4 = new MembroEquipe("Ana", null);

        } catch (TarefaInvalidaException e) {
            System.err.println("Erro ao adicionar tarefa: " + e.getMessage());
        } catch (PapelInvalidoException e) {
            System.err.println("Erro ao criar membro: " + e.getMessage());
        }
    }
}