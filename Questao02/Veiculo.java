package Questao02;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

 public Veiculo() {

    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano > 2025 || ano < 1980) {
            throw new IllegalArgumentException("Ano do seu carro pode estar com algum erro: " + ano);
        }
        this.ano = ano;
    }
     public void exibirInformacoesVeiculo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
