import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos de la consola
        Scanner scanner = new Scanner(System.in);

        // Crear dos objetos Persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        //////////////// Ingresar información para persona1 ////////////////
        System.out.println("/////////// INGRESO DE DATOS PARA PERSONA 1 ///////////");
        System.out.print("Nombre: ");
        persona1.setNombre(scanner.nextLine());
        System.out.print("Edad: ");
        persona1.setEdad(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("DNI: ");
        persona1.setDni(scanner.nextLine());

        //////////////// Ingresar información para persona2 ////////////////
        System.out.println("\n/////////// INGRESO DE DATOS PARA PERSONA 2 ///////////");
        persona2.setNombre(ingresarDato("Nombre", scanner));
        persona2.setEdad(ingresarDatoEntero("Edad", scanner));

        // Validación de DNI único
        boolean dniValido = false;
        while (!dniValido) {
            System.out.print("DNI: ");
            String dni = scanner.nextLine();

            if (dni.equals(persona1.getDni())) {
                System.out.println("¡Cédula idéntica! Vuelva a ingresar un DNI diferente.");
            } else {
                persona2.setDni(dni);
                dniValido = true;
            }
        }

        //////////////// Mostrar información de ambas personas ////////////////
        System.out.println("\n/////////// INFORMACIÓN DE PERSONAS ///////////");
        System.out.println("Información de Persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("DNI: " + persona1.getDni());

        System.out.println("\nInformación de Persona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("DNI: " + persona2.getDni());

        // Cerrar el scanner
        scanner.close();
    }

    //////////////// Métodos auxiliares para la entrada ////////////////
    public static String ingresarDato(String campo, Scanner scanner) {
        System.out.print(campo + ": ");
        return scanner.nextLine();
    }

    public static int ingresarDatoEntero(String campo, Scanner scanner) {
        System.out.print(campo + ": ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un valor válido para " + campo + ".");
            System.out.print(campo + ": ");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return valor;
    }
}
