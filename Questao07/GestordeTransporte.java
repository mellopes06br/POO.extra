package Questao07;

class GestorDeTransporte {
    public String calcularViagem(Veiculo veiculo, double distancia) {
        try {
            double tempo = veiculo.calcularTempo(distancia);
            String combustivel = veiculo.tipoDeCombustivel();
            return "Tempo de viagem: " + String.format("%.2f", tempo) + " horas. Tipo de combustível: " + combustivel + ".";
        } catch (VelocidadeInvalidaException e) {
            return "Erro ao calcular viagem: " + e.getMessage() + " Tipo de combustível: " + veiculo.tipoDeCombustivel() + ".";
        }
    }

    public static void main(String[] args) {
        GestorDeTransporte gestor = new GestorDeTransporte();

        Carro carro = new Carro(5, 180.0);
        String infoCarro = gestor.calcularViagem(carro, 360.0);
        System.out.println("Carro: " + infoCarro);

        Aviao aviao = new Aviao(200, 800.0);
        String infoAviao = gestor.calcularViagem(aviao, 1600.0);
        System.out.println("Avião: " + infoAviao);

        Navio navio = new Navio(500, 50.0);
        String infoNavio = gestor.calcularViagem(navio, 100.0);
        System.out.println("Navio: " + infoNavio);

    }
}