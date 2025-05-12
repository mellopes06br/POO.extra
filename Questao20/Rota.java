package Questao20;

import java.util.ArrayList;
import java.util.List;

class Rota {
    String origem;
    String destino;
    List<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino) throws RotaInvalidaException {
        if (origem == null || origem.trim().isEmpty() || destino == null || destino.trim().isEmpty()) {
            throw new RotaInvalidaException("Erro: A origem e o destino da rota não podem ser vazios.");
        }
        this.origem = origem;
        this.destino = destino;
        this.veiculosDisponiveis = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) throws VeiculoInvalidoException {
        if (veiculo == null) {
            throw new VeiculoInvalidoException("Erro: Não é possível adicionar um veículo nulo à rota.");
        }
        this.veiculosDisponiveis.add(veiculo);
    }

    public String listarVeiculos() {
        if (veiculosDisponiveis.isEmpty()) {
            return "Não há veículos disponíveis para a rota " + origem + " - " + destino + ".";
        }
        StringBuilder lista = new StringBuilder("Veículos disponíveis para a rota " + origem + " - " + destino + ":\n");
        for (Veiculo veiculo : veiculosDisponiveis) {
            lista.append("- ").append(veiculo.getModelo()).append(" (Capacidade: ").append(veiculo.getCapacidade()).append(")\n");
        }
        return lista.toString();
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public List<Veiculo> getVeiculosDisponiveis() {
        return veiculosDisponiveis;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setVeiculosDisponiveis(List<Veiculo> veiculosDisponiveis) {
        this.veiculosDisponiveis = veiculosDisponiveis;
    }
    
}