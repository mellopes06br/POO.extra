package Questao03;

public class Main {
       public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa();

        Gerente gerente1 = new Gerente("Julia Rodrigues", 4000.0, 2000.0);
        Desenvolvedor dev1 = new Desenvolvedor("Beatriz Martins", 2000.0, 1.5);
        Estagiario est1 = new Estagiario("Pedro Lucas", 1000.0);
        Desenvolvedor dev2 = new Desenvolvedor("Ana Paula", 3500.0, 1.25);
        Gerente gerente2 = new Gerente("Cláudio Silva", 6000.0, 2000.0);

        minhaEmpresa.adicionarFuncionario(gerente1);
        minhaEmpresa.adicionarFuncionario(dev1);
        minhaEmpresa.adicionarFuncionario(est1);
        minhaEmpresa.adicionarFuncionario(dev2);
        minhaEmpresa.adicionarFuncionario(gerente2);

        minhaEmpresa.calcularFolhaDePagamento();
    }
}
