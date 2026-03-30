public class Gato extends Animal {

    public Gato(int id, String nombre, int edad, String estado) {
        super(id, nombre, edad, estado);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla: Miau Miau");
    }
}