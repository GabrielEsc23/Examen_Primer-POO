package Clases;

public class Flor extends Arbol {
    private String color; // Color de la flor

    public Flor(String nombre, int edad, String tipo, int altura, String color) {
        super(nombre, edad, tipo, altura);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Color de la flor: " + getColor());
    }
    @Override
    public int anioNacimiento() {
        return 2024-getEdad();
    }
}
