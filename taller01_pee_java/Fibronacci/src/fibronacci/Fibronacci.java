package fibronacci;
import java.util.Scanner;

public class Fibronacci {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char volver;

        do {
            int i, cant, acum, anterior, posterior;
            System.out.println("---------------------FIBONACCI-------------------");

            anterior = 0;
            posterior = 1;
            acum = 0;
            cant = 0;

            System.out.print("Ingrese la cantidad de números de la serie Fibonacci: ");
            cant = scanner.nextInt();

            System.out.println();
            for (i = 0; i < cant; i++) {
                System.out.print(anterior + " ");
                acum = anterior + posterior;
                posterior = anterior;
                anterior = acum;
            }

            System.out.println("\ndigite 'R' si desea repetir el codigo, si desea salir digite 'X'");
            volver = scanner.next().charAt(0);
            
        }while (Character.toUpperCase(volver)== 'R');
    }
    
}
