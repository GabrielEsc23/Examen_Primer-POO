package Clases;

public class Arbol extends Vegetal {
    private int altura;

    public Arbol(String nombre, int edad, String tipo, int altura) {
        super(nombre, edad, tipo);
        this.altura = altura;
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Altura del árbol: " + getAltura() + " metros");
    }
    @Override
    public int anioNacimiento() {
        return 2024-getEdad();
    }
}
