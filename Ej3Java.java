import java.util.Scanner;

public class CantidadDiasMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de un mes:");
        String nombreMes = sc.nextLine();

        int cantidadDias;

        switch (nombreMes.toLowerCase()) {
            case "noviembre":
            case "abril":
            case "junio":
                cantidadDias = 30;
                break;
            case "septiembre":
                cantidadDias = 28;
                break;
            default:
                cantidadDias = 31;
                break;
        }

        System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
    }
}
