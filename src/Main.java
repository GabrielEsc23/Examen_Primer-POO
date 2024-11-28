//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Clases.Planta;
import Clases.Arbol;
import Clases.Vegetal;
import Clases.Flor;

public class Main {
    public static void main(String[] args) {
        try {
            Planta planta = new Planta("Planta comun", 5);
            Vegetal vegetal = new Vegetal("vegetal", 2, "Lechuga");
            Arbol arbol = new Arbol("Roble", 10, "arbol", 15);
            Flor flor = new Flor("rosa", 3, "flor", 1, "rojo");

            // Mostrar información de las plantas
            planta.mostrarInfo();

            System.out.println("El año de nacimiento es: "+ planta.anioNacimiento());
            System.out.println();
            vegetal.mostrarInfo();
            System.out.println();
            System.out.println("El año de nacimiento es: "+ vegetal.anioNacimiento());
            System.out.println();
            arbol.mostrarInfo();
            System.out.println();
            System.out.println("El año de nacimiento es: "+ arbol.anioNacimiento());

            System.out.println();
            flor.mostrarInfo();
            System.out.println("El año de nacimiento es: "+ flor.anioNacimiento());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}