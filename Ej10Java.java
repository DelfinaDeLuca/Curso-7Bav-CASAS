
import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de la primera variable: ");
        int variable1 = scanner.nextInt();

        System.out.print("Ingrese el valor de la segunda variable: ");
        int variable2 = scanner.nextInt();

        System.out.print("Ingrese el valor de la tercera variable: ");
        int variable3 = scanner.nextInt();

        int mayor = variable1;

        if (variable2 > mayor && variable2 > variable3) {
            mayor = variable2;
        } else if (variable3 > mayor && variable3 > variable2) {
            mayor = variable3;
        }

        System.out.println("La mayor de las tres variables es: " + mayor);
    }
}
