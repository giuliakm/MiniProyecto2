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

            try {

                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.print("ID: ");
                        int idP = sc.nextInt();

                        System.out.print("Nombre: ");
                        String nombreP = sc.next();

                        System.out.print("Edad: ");
                        int edadP = sc.nextInt();

                        refugio.registrarPerro(idP, nombreP, edadP);

                        break;

                    case 2:

                        System.out.print("ID: ");
                        int idG = sc.nextInt();

                        System.out.print("Nombre: ");
                        String nombreG = sc.next();

                        System.out.print("Edad: ");
                        int edadG = sc.nextInt();

                        refugio.registrarGato(idG, nombreG, edadG);

                        break;

                    case 3:

                        refugio.mostrarAnimales();

                        break;

                    case 4:

                        System.out.print("Ingrese ID: ");
                        int buscar = sc.nextInt();

                        Animal a = refugio.buscarAnimal(buscar);

                        if (a == null) {
                            System.out.println("Animal no encontrado");
                        } else {
                            a.mostrarInfo();
                        }

                        break;

                    case 5:

                        System.out.print("Ingrese ID: ");
                        int cambiar = sc.nextInt();

                        refugio.cambiarEstado(cambiar);

                        break;

                    case 6:

                        System.out.print("Ingrese ID: ");
                        int sonido = sc.nextInt();

                        refugio.ejecutarSonido(sonido);

                        break;

                    case 7:

                        System.out.println("Saliendo del sistema");

                        break;

                    default:

                        System.out.println("Opción inválida");

                }

            } catch (Exception e) {

                System.out.println("Error: debe ingresar un número");

                sc.nextLine();

            }

        } while (opcion != 7);

        sc.close();
    }
}