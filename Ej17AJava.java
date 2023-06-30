import java.util.Scanner;

public class EvaluacionAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota de la primera evaluación: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la segunda evaluación: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota de la tercera evaluación: ");
        double nota3 = scanner.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio del alumno: " + promedio);

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        int sumaPares = 0;

        if (nota1 % 2 == 0) {
            sumaPares += nota1;
        }
        if (nota2 % 2 == 0) {
            sumaPares += nota2;
        }
        if (nota3 % 2 == 0) {
            sumaPares += nota3;
        }

        System.out.println("Suma de los valores pares: " + sumaPares);
    }
}
