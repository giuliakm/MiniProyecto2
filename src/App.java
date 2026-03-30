import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Refugio refugio = new Refugio();

        int opcion = 0;

        do {

            System.out.println("\n--- REFUGIO DE ANIMALES ---");
            System.out.println("1. Registrar perro");
            System.out.println("2. Registrar gato");
            System.out.println("3. Mostrar animales");
            System.out.println("4. Buscar animal por id");
            System.out.println("5. Cambiar estado de un animal");
            System.out.println("6. Ejecutar sonido de un animal");
            System.out.println("7. Salir");

        } while (opcion != 7);

        sc.close();
    }
}