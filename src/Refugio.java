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

        public void mostrarAnimales() {

        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados");
            return;
        }

        for (Animal a : animales) {
            a.mostrarInfo();
            System.out.println("----------------");
        }
    }

        public Animal buscarAnimal(int id) {

        for (Animal a : animales) {
            if (a.getId() == id) {
                return a;
            }
        }

        return null;
    }

        public void cambiarEstado(int id) {

        Animal a = buscarAnimal(id);

        if (a == null) {
            System.out.println("Animal no encontrado");
            return;
        }

        a.setEstado("ADOPTADO");
        System.out.println("Estado cambiado a ADOPTADO");
    }

    public void ejecutarSonido(int id) {

        Animal a = buscarAnimal(id);

        if (a == null) {
            System.out.println("Animal no encontrado");
            return;
        }

        a.hacerSonido();
    }

}