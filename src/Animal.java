public class Animal {

    private int id;
    private String nombre;
    private int edad;
    private String estado;

    public Animal(int id, String nombre, int edad, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}