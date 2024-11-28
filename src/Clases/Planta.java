package Clases;

public class Planta {
    private String nombre;
    private int edad;


    public Planta(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void mostrarInfo() {
        System.out.println("Planta: " + getNombre() + ", Edad: " + edad + " años");
    }
    public int anioNacimiento() {
        return  2024-edad;
    }

}



