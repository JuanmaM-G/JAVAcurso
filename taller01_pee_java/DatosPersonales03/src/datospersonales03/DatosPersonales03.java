package datospersonales03;

import java.util.Scanner;

public class DatosPersonales03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char volver = ' ';

        String[] vector = new String[5];
        String[][] matriz = new String[5][5];
        
        
        

        do {
            
            vector[0] = "nombre      |";
            vector[1] = "apellido    |";
            vector[2] = "edad        |";
            vector[3] = "estado      |";
            vector[4] = "telefono    |";
            
            

  
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingreso de datos" + (i + 1));
                for (int j = 0; j < 5; j++) {
                    System.out.print("[" + i + "," + j + "]. " + vector[j] + ": ");
                    matriz[i][j] = scan.nextLine().trim();

                    // Formatear a longitud fija (mínimo 11 caracteres)
                    while (matriz[i][j].length() < 11) {
                        matriz[i][j] += " ";
                    }
                    matriz[i][j] += "|";
                }
            }

          
            System.out.println("-----------------------------------------------------------------------------------------|");
            for (String encabezado : vector) {
                System.out.print("     " + encabezado);
            }
            System.out.println("-----------------------------------------------------------------------------------------|");

            // Mostrar datos
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("     " + matriz[i][j]);
                }
                System.out.println();
            }

            System.out.println("-----------------------------------------------------------------------------------------|");

            System.out.println("digite 'R' si desea repetir el codigo, si desea salir digite 'X'");
            volver = scan.next().charAt(0);
        }while (Character.toUpperCase(volver)== 'R');
        
    }
}
