package datospersonales02;
import java.util.Scanner;

public class DatosPersonales02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String nombre;
        char sexo;
        int edad;
        double salario;
        boolean transporte;
        
        nombre = "";
        sexo = ' ';
        edad = 0;
        salario = 0.0;
        transporte = false;
        
        System.out.println("digite su nombre");
        nombre = scan.nextLine();
        
        System.out.println("Digite su sexo masculino(M) femenino(F)");
        sexo = scan.next().charAt(0);
        
        System.out.println("Digite su edad");
        edad = scan.nextInt();
        
        System.out.println("Digite su salario con centavos, por ejemplo '5435,235'");
        salario = scan.nextDouble();
        
        System.out.println("¿Tiene transporte? si(true) no(false)");
        transporte = scan.nextBoolean();
        
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su genero es: " + sexo);
        System.out.println("Usted tiene" + edad + "años");
        System.out.println("Su salario es de: " + salario + "COP");
        System.out.println("¿Cuenta con vehiculo?" + transporte );
        
        
    }
    
}
