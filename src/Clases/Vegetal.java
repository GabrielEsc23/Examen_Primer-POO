package Clases;

public class Vegetal extends Planta {
    private String tipo;

    public Vegetal(String nombre, int edad, String tipo) {
        super(nombre, edad);
        this.tipo = tipo;
    }

    // Getter y Setter para 'tipo'
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de vegetal: " + getTipo());
    }
    @Override
    public int anioNacimiento() {
        return 2024-getEdad();
    }
}
