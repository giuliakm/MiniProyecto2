import java.util.ArrayList;

public class Refugio {

    private ArrayList<Animal> animales;

    public Refugio() {
        animales = new ArrayList<>();
    }

    public void registrarPerro(int id, String nombre, int edad) {

        if (edad < 0) {
            System.out.println("Edad inválida");
            return;
        }

        Perro perro = new Perro(id, nombre, edad, "ACTIVO");
        animales.add(perro);

        System.out.println("Perro registrado correctamente");
    }


    public void registrarGato(int id, String nombre, int edad) {

        if (edad < 0) {
            System.out.println("Edad inválida");
            return;
        }

        Gato gato = new Gato(id, nombre, edad, "ACTIVO");
        animales.add(gato);

        System.out.println("Gato registrado correctamente");
    }

}