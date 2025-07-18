//COMPROBAR, rediseñar y arreglar

package menu;

import uml.Rol;
import uml.User;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Crear nuevo Rol");
            System.out.println("2. Crear nuevo Usuario");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = menu.nextInt();
            menu.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    crearRol(menu);
                    break;
                case 2:
                    crearUsuario(menu);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }

        } while (opcion != 3);

        menu.close();
    }

    private static void crearRol(Scanner menu) {
        System.out.print("Ingrese el ID del Rol: ");
        int id = menu.nextInt();
        menu.nextLine(); // limpiar buffer

        System.out.print("Ingrese el nombre del Rol: ");
        String nombre = menu.nextLine();

        Rol rol = new Rol(id, nombre);

        System.out.println("\nRol creado:");
        System.out.println("ID: " + rol.getRol_id());
        System.out.println("Nombre: " + rol.getRol_name());
    }

    private static void crearUsuario(Scanner menu) {
        System.out.print("Ingrese el ID del Rol: ");
        int rolId = menu.nextInt();

        System.out.print("Ingrese el ID del Usuario: ");
        int userId = menu.nextInt();
        menu.nextLine(); // limpiar buffer

        System.out.print("Ingrese el nombre del Usuario: ");
        String nombre = menu.nextLine();

        System.out.print("Ingrese el apellido del Usuario: ");
        String apellido = menu.nextLine();

        System.out.print("Ingrese el correo del Usuario: ");
        String correo = menu.nextLine();

        System.out.print("Ingrese la contraseña del Usuario: ");
        String password = menu.nextLine();

        System.out.print("¿El usuario está activo? (true/false): ");
        Boolean activo = menu.nextBoolean();

        User user = new User(rolId, userId, nombre, apellido, correo, password, activo);

        System.out.println("\nUsuario creado:");
        System.out.println("Rol ID: " + user.getRol_id());
        System.out.println("ID: " + user.getUser_id());
        System.out.println("Nombre: " + user.getUser_name());
        System.out.println("Apellido: " + user.getUser_lastname());
        System.out.println("Correo: " + user.getUser_email());
        System.out.println("Contraseña: " + user.getUser_pass());
        System.out.println("Estado activo: " + user.getUser_state());
    }
}
