public class Ej15Java {
    public static void main(String[] args) {
        char claseAuto = 'b'; // Puedes modificar este valor según la clase del auto que deseas mostrar

        System.out.println("Características del auto:");

        switch (claseAuto) {
            case 'a':
                System.out.println("Clase: A");
                System.out.println("Ruedas: 4");
                System.out.println("Motor: Sí");
                break;
            case 'b':
                System.out.println("Clase: B");
                System.out.println("Ruedas: 4");
                System.out.println("Motor: Sí");
                System.out.println("Cierre centralizado: Sí");
                System.out.println("Aire acondicionado: Sí");
                break;
            case 'c':
                System.out.println("Clase: C");
                System.out.println("Ruedas: 4");
                System.out.println("Motor: Sí");
                System.out.println("Cierre centralizado: Sí");
                System.out.println("Aire acondicionado: Sí");
                System.out.println("Airbag: Sí");
                break;
            default:
                System.out.println("Clase inválida");
                break;
        }
    }
}
