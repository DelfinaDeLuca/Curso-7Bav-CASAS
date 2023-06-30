import java.util.Scanner;

public class Ej8Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1:");
        int jugador1 = leerJugada(scanner);

        System.out.println("Jugador 2:");
        int jugador2 = leerJugada(scanner);

        determinarGanador(jugador1, jugador2);
    }

    private static int leerJugada(Scanner scanner) {
        System.out.print("Ingrese su jugada (0 para piedra, 1 para papel, 2 para tijera): ");
        return scanner.nextInt();
    }

    private static void determinarGanador(int jugador1, int jugador2) {
        if (jugador1 == jugador2) {
            System.out.println("¡Es un empate!");
        } else if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("¡Jugador 1 es el ganador!");
        } else {
            System.out.println("¡Jugador 2 es el ganador!");
        }
    }
}
