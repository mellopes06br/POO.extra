package Questao20;

class SistemaReservas {
    public static void main(String[] args) {
        try {
            Rota recifeOlinda = new Rota("Recife", "Olinda");
            Rota recifePorto = new Rota("Recife", "Porto de Galinhas");

            OnibusReservavel onibus1 = new OnibusReservavel("Scania", 42);
            CarroReservavel carro1 = new CarroReservavel("Sedan", 4, 80.0);
            MotoReservavel moto1 = new MotoReservavel("Trail", 2);

            recifeOlinda.adicionarVeiculo(onibus1);
            recifeOlinda.adicionarVeiculo(carro1);
            recifePorto.adicionarVeiculo(onibus1);
            recifePorto.adicionarVeiculo(moto1);

            System.out.println(recifeOlinda.listarVeiculos());
            System.out.println(recifePorto.listarVeiculos());

            onibus1.reservar("2025-05-10", recifeOlinda);
            carro1.reservar("2025-05-10", recifeOlinda);
            moto1.reservar("2025-05-11", recifePorto);
            onibus1.reservar("2025-05-10", recifePorto); // Tentando reservar ônibus já reservado

            System.out.println("\nTempo de viagem (Recife-Olinda):");
            System.out.println("Ônibus: " + String.format("%.2f", onibus1.calcularTempo(10)) + " horas");
            System.out.println("Carro: " + String.format("%.2f", carro1.calcularTempo(10)) + " horas");
            System.out.println("Moto: " + String.format("%.2f", moto1.calcularTempo(10)) + " horas");

            // Tentando criar veículo com capacidade inválida
            // Onibus onibus2 = new Onibus("Volvo", -5);

            // Tentando adicionar veículo nulo à rota
            // recifeOlinda.adicionarVeiculo(null);

            // Tentando criar rota com origem inválida
            // Rota rotaInvalida = new Rota("", "Jaboatão");

        } catch (CapacidadeInvalidaException e) {
            System.err.println("Erro ao criar veículo: " + e.getMessage());
        } catch (VelocidadeInvalidaException e) {
            System.err.println("Erro ao criar veículo: " + e.getMessage());
        } catch (RotaInvalidaException e) {
            System.err.println("Erro ao criar ou reservar rota: " + e.getMessage());
        } catch (VeiculoInvalidoException e) {
            System.err.println("Erro ao adicionar veículo à rota: " + e.getMessage());
        }
    }
}