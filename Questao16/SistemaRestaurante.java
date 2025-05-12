package Questao16;

class SistemaRestaurante {
    public static void main(String[] args) {
        Prato lasanha = new Prato("Lasanha");
        Prato salada = new Prato("Salada Mista");
        Preparo preparoLasanha = new PratoSimples("Lasanha");
        Preparo preparoSalada = new PratoSimples("Salada Mista");

        try {
            lasanha.adicionarIngrediente(new Proteina("Carne Moída", 200, "bovina"));
            lasanha.adicionarIngrediente(new Carboidrato("Massa", 300, "de trigo"));
            lasanha.adicionarIngrediente(new Tempero("Sal", 5, "fino"));
            lasanha.adicionarIngrediente(new Tempero("Pimenta do Reino", 2, "moída"));

            salada.adicionarIngrediente(new Carboidrato("Alface", 150, "americana"));
            salada.adicionarIngrediente(new Carboidrato("Tomate", 100, "cereja"));
            salada.adicionarIngrediente(new Tempero("Azeite", 10, "extra virgem"));

            System.out.println(lasanha.listarIngredientes());
            System.out.println(salada.listarIngredientes());

            System.out.println(preparoLasanha.preparar());
            System.out.println(preparoSalada.preparar());

            // Tentando adicionar ingrediente com quantidade inválida
            // lasanha.adicionarIngrediente(new Proteina("Frango", -100, "desfiado"));

            // Tentando adicionar ingrediente nulo
            // lasanha.adicionarIngrediente(null);

        } catch (QuantidadeInvalidaException e) {
            System.err.println("Erro ao adicionar ingrediente: " + e.getMessage());
        } catch (IngredienteInvalidoException e) {
            System.err.println("Erro ao adicionar ingrediente: " + e.getMessage());
        }
    }
}