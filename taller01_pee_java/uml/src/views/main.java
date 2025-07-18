
package views;

import uml.Rol;
import uml.User;

import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        
        
        System.out.println("========Inicio de recopilacion de datos del ROL========");
        
        Scanner scan = new Scanner(System.in);
        Rol objRol = new Rol();
        
        
        
        
        System.out.println("Ingrese el ID del rol: " );
        int id = scan.nextInt();
        
        
        
        System.out.println("Ingrese el tipo de rol: " );
        String name = scan.next();
        
        
        
        objRol.setRol_id(id);
        objRol.setRol_name(name);
        
        
        System.out.println("----Datos del rol----");
        System.out.println("ID: " + objRol.getRol_id());
        System.out.println("Nombre: " + objRol.getRol_name());
        
        
        System.out.println("---------finalizado los datos del rol---------");
    //=========================================================================
        System.out.println("========Inicio de recopilacion de datos del USUARIO========");
        
        
        User objUser = new User();

        System.out.println("Ingrese el ID del rol:");
        int rol = scan.nextInt();
        
        System.out.println("Ingrese el ID del Usuario: " );
        int iden = scan.nextInt();
        
        System.out.println("Ingrese el nombre del Usuario: " );
        String nombre = scan.next();
        
        System.out.println("Ingrese el apellido del usuario:");
        String apellido = scan.next();
        
        System.out.println("Ingrese el correo del usuario:");
        String correo = scan.next();
        
        System.out.println("Ingrese la contraseña del usuario:");
        String password = scan.next();
        
        System.out.println("¿El usuario está activo? true(si) false(no):");
        Boolean activo = scan.nextBoolean();
        
        
        objUser.setRol_id(rol);
        objUser.setUser_id(iden);
        objUser.setUser_name(nombre);
        objUser.setUser_lastname(apellido);
        objUser.setUser_email(correo);
        objUser.setUser_pass(password);
        objUser.setUser_state(activo);
        
        
        System.out.println("----Datos del Usuario----");
        System.out.println("Rol ID: " + objUser.getRol_id());
        System.out.println("ID del usuario: " + objUser.getUser_id());
        System.out.println("Nombre: " + objUser.getUser_name());
        System.out.println("Apellido: " + objUser.getUser_lastname());
        System.out.println("Correo: " + objUser.getUser_email());
        System.out.println("Contraseña: " + objUser.getUser_pass());
        System.out.println("Estado activo: " + objUser.getUser_state());
        
        scan.close();
        
        
    }
}