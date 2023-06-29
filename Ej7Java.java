import java.util.Scanner;

public class Ej7Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la primera variable: ");
        int variable1 = scanner.nextInt();

        System.out.print("Ingrese el valor de la segunda variable: ");
        int variable2 = scanner.nextInt();

        System.out.print("Ingrese el valor de la tercera variable: ");
        int variable3 = scanner.nextInt();

        int mayor = variable1;

        if (variable2 > mayor) {
            mayor = variable2;
        }

        if (variable3 > mayor) {
            mayor = variable3;
        }

        System.out.println("La mayor de las tres variables es: " + mayor);
    }
}
