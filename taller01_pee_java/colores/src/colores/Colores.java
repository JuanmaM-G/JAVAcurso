package colores;
import java.util.Scanner;

public class Colores {


    public static void main(String[] args) {
        System.out.println("MEZCLA DE COLOR");
        
        Scanner scan  =  new  Scanner(System.in);
        
        int col1, col2;
        
        System.out.println("Escoja que combinacion decolores desea hacer");
        
        System.out.println("(1)amarillo");
        System.out.println("(2)azul");
        System.out.println("(3)rojo");
        
        col1 = scan.nextInt();
        col2 = scan.nextInt();
        
        if (col1 <=3  || col2>0 || col1 <=3 || col2>0)
            System.out.println("los datos ingresados no son validos");
        
        
    }
    
}


