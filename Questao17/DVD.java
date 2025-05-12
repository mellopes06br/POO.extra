package Questao17;

class DVD extends Material {
    String diretor;

    public DVD(String titulo, String diretor) {
        super(titulo);
        this.diretor = diretor;
    }

    @Override
    public String informarMaterial() {
        return "DVD: " + titulo + " (Diretor: " + diretor + ")";
    }
}