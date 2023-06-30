import java.util.Scanner;

public class Ej12Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if ((numero >= 1 && numero <= 12) || (numero >= 25 && numero <= 36)) {
            System.out.println("El número está en la primera o tercera docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número está en la segunda docena.");
        } else {
            System.out.println("El número no pertenece a ninguna docena válida.");
        }
    }
}
