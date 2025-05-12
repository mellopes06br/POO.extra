package Questao17;

public abstract class Material {
    String titulo;

    public Material(String titulo) {
        this.titulo = titulo;
    }

    public abstract String informarMaterial();
}