package Questao02;

public class Motocicleta extends Veiculo {
     private String tipoDeGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public void exibirInformacoesVeiculo() {
        super.exibirInformacoesVeiculo();
        System.out.println("Tipo de guidão: " + tipoDeGuidao);
    }
}
