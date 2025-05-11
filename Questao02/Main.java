package Questao02;

public class Main {
     public static void main(String[] args) {
        Carro carro1 = new Carro("Volkswagen", "Gol", 2022, 4);
        Motocicleta moto1 = new Motocicleta("Yamaha", "Fazer 250", 2023, "Esportivo");

        System.out.println("Informações do Carro:");
        carro1.exibirInformacoesVeiculo();
        System.out.println("  ");
        System.out.println("Informações da Motocicleta:");
        moto1.exibirInformacoesVeiculo();
    }
}
