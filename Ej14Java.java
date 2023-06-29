import java.util.Scanner;

public class MostrarPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una categoría (a, b o c): ");
        char categoria = scanner.nextLine().charAt(0);

        String palabra;

        switch (categoria) {
            case 'a':
                palabra = "hijo";
                break;
            case 'b':
                palabra = "padres";
                break;
            case 'c':
                palabra = "abuelos";
                break;
            default:
                palabra = "Categoría inválida";
                break;
        }

        System.out.println("Palabra correspondiente a la categoría " + categoria + ": " + palabra);
    }
}
