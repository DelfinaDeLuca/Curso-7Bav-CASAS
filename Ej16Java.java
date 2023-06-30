import java.util.Scanner;

public class Ej16Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        int valor = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + valor + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.println(valor + " x " + i + " = " + resultado);
        }
    }
}
