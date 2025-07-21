package descomponernumero;
import java.util.Scanner;


public class DescomponerNumero {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char volver;

        int[] vector = new int[10];

        do {
            int num = 0, temp = 0, cant = 0;

            System.out.println("------------------------------DESCOMPONER NUMERO------------------------------------");
            
            System.out.print("Escriba un numero entero: ");
            num = scan.nextInt();

            temp = num;
            cant = 0;

            while (temp > 0) {
                temp = temp / 10;
                cant++;
            }

            for (int i = cant - 1; i >= 0; i--) {
                vector[i] = num % 10;
                num = num / 10;
            }

            System.out.println("El numero tiene " + cant + " digitos y se descompone asi:");

            for (int i = 0; i < cant; i++) {
                System.out.print(" - " + vector[i]);
            }

            System.out.println("digite 'R' si desea repetir el codigo, si desea salir digite 'X'");
            volver = scan.next().charAt(0);
        }while (Character.toUpperCase(volver)== 'R');
    }
    
}
