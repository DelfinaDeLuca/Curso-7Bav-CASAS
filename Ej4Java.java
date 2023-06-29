import java.util.Scanner;

public class RelacionFamiliar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una categoría (a, b o c):");
        String categoria = sc.nextLine();

        String relacion;

        switch (categoria.toLowerCase()) {
            case "a":
                relacion = "hijo";
                break;
            case "b":
                relacion = "padres";
                break;
            case "c":
                relacion = "abuelos";
                break;
            default:
                relacion = "categoría inválida";
                break;
        }

        System.out.println("La relación correspondiente es: " + relacion);
    }
}
