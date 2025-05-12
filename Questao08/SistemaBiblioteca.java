package Questao08;

class SistemaBiblioteca {
    public String registrarEmprestimo(MaterialBiblioteca material) {
        return "Empréstimo registrado: " + material.titulo + ". Prazo de devolução: " + material.prazoDevolucao + " dias.";
    }

    public double calcularMulta(MaterialBiblioteca material, int diasAtraso) {
        try {
            return material.calcularMulta(diasAtraso);
        } catch (AtrasoInvalidoException e) {
            System.err.println("Erro ao calcular multa: " + e.getMessage());
            return -1.0;
        }
    }

 public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        Livro livro = new Livro("Dom Quixote", 30);
        System.out.println(sistema.registrarEmprestimo(livro));
        System.out.println("Multa por 5 dias de atraso (Livro): R$" + String.format("%.2f", sistema.calcularMulta(livro, 5)));
        System.out.println("Multa por -2 dias de atraso (Livro): R$" + String.format("%.2f", sistema.calcularMulta(livro, -2)));

        Revista revista = new Revista("National Geographic", 7);
        System.out.println(sistema.registrarEmprestimo(revista));
        System.out.println("Multa por 3 dias de atraso (Revista): R$" + String.format("%.2f", sistema.calcularMulta(revista, 3)));

        DVD dvd = new DVD("O Poderoso Chefão", 5);
        System.out.println(sistema.registrarEmprestimo(dvd));
        System.out.println("Multa por 7 dias de atraso (DVD): R$" + String.format("%.2f", sistema.calcularMulta(dvd, 7)));
    }
}