package areaperimetro;
import java.util.Scanner;


public class AreaPerimetro {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu;
        double ladoA = 0.0, ladoB = 0.0, ladoC = 0.0, radio = 0.0;
        double area = 0.0, perimetro = 0.0;
        
        System.out.println("---------- MENU ----------");
        System.out.println("Triangulo (1)");
        System.out.println("Rectangulo (2)");
        System.out.println("Circulo (3)");
        System.out.print("Seleccione una opcion del menu: ");
        menu = scan.nextInt();
        
        switch (menu) {
            case 1 -> {
                // Triángulo
                System.out.println("\n-------------- Triángulo ------------------");

                
                do {
                    System.out.print("Digite la base: ");
                    ladoA = scan.nextDouble();
                    if (ladoA <= 0) {
                        System.out.println("La base debe ser mayor que cero.");
                    }
                } while (ladoA <= 0);

                
                do {
                    System.out.print("Digite la altura: ");
                    ladoB = scan.nextDouble();
                    if (ladoB <= 0) {
                        System.out.println("La altura debe ser mayor que cero.");
                    }
                } while (ladoB <= 0);

                area = (ladoA * ladoB) / 2;
                ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2)); // Hipotenusa
                perimetro = ladoA + ladoB + ladoC;

                
                System.out.println("\nLa Figura es un:   Triangulo");
                System.out.println("Su area es:        " + area + " metros cuadrados");
                System.out.println("Su perimetro es:   " + perimetro + " metros");
            }

            case 2 -> {
                // Rectángulo
                System.out.println("\n-------------- Rectángulo ------------------");

                do {
                    System.out.print("Digite el lado A: ");
                    ladoA = scan.nextDouble();
                    System.out.print("Digite el lado B: ");
                    ladoB = scan.nextDouble();

                    if (ladoA <= 0 || ladoB <= 0) {
                        System.out.println("Ambos lados deben ser mayores que cero.");
                    }
                } while (ladoA <= 0 || ladoB <= 0);

                area = ladoA * ladoB;
                perimetro = 2 * (ladoA + ladoB);

                
                System.out.println("\nLa Figura es un:   Rectangulo");
                System.out.println("Su area es:        " + area + " metros cuadrados");
                System.out.println("Su perimetro es:   " + perimetro + " metros");
            }

            case 3 -> {
                // Círculo
                System.out.println("\n-------------- Circulo ------------------");

                do {
                    System.out.print("Digite el radio: ");
                    radio = scan.nextDouble();
                    if (radio <= 0) {
                        System.out.println("El radio debe ser mayor que cero.");
                    }
                } while (radio <= 0);

                area = Math.PI * Math.pow(radio, 2);
                perimetro = 2 * Math.PI * radio;

                
                System.out.println("\nLa Figura es un:        Circulo");
                System.out.println("Su area es:             " + area + " metros cuadrados");
                System.out.println("Su circunferencia es:   " + perimetro + " metros");
            }

            default -> System.out.println("La opción del menu no existe.");
        }
    }
    
}
