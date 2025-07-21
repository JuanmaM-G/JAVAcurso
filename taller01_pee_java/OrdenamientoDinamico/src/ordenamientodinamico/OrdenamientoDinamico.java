package ordenamientodinamico;
import java.util.Scanner;
import java.util.Random;

public class OrdenamientoDinamico {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Random ale = new Random();
        
        
        
        int i;
        int[] vector = new int[10];
        
        char volver = ' ';

        
        
        
        do {
            for ( i=0; i<10; i++){
                vector [i] = ale.nextInt(100);
            }
            
            for ( i=0; i<10; i++) {
                System.out.println(" indice: " + i + " Pocision: " + (i+1) + " Valor: " + vector[i]);
            }
            
            
            System.out.println("digite 'R' si desea repetir el codigo, si desea salir digite 'X'");
            volver = scan.next().charAt(0);
            
        }while (Character.toUpperCase(volver) == 'R');
        
    }
    
}
