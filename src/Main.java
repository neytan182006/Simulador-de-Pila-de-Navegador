import java.util.Scanner;

/**
 * Simulador de Pila de Navegador - Estructuras de Datos.
 * Simula el boton "Atras" de un navegador con una Pila (LIFO) propia.
 */
public class Main {

    private static final Scanner TECLADO = new Scanner(System.in);
    private static final PilaNavegacion historial = new PilaNavegacion();
    private static String paginaActual = "about:blank";

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opcion: ");

            try {
                switch (opcion) {
                    case 1 -> visitarPagina();
                    case 2 -> retroceder();
                    case 3 -> historial.mostrarHistorial();
                    case 4 -> System.out.println("Pagina actual: " + paginaActual);
                    case 0 -> System.out.println("Cerrando navegador.");
                    default -> System.out.println("Opcion invalida.");
                }
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== SIMULADOR DE NAVEGADOR (pagina actual: " + paginaActual + ") ===");
        System.out.println("1. Visitar nueva pagina");
        System.out.println("2. Atras");
        System.out.println("3. Ver historial completo");
        System.out.println("4. Ver pagina actual");
        System.out.println("0. Salir");
    }

    private static void visitarPagina() {
        System.out.print("URL a visitar: ");
        String url = TECLADO.nextLine();
        historial.push(paginaActual);
        paginaActual = url;
        System.out.println("Navegando a: " + paginaActual);
    }

    private static void retroceder() {
        paginaActual = historial.pop();
        System.out.println("Regresando a: " + paginaActual);
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!TECLADO.hasNextInt()) {
            System.out.print("Ingrese un numero valido: ");
            TECLADO.next();
        }
        int valor = TECLADO.nextInt();
        TECLADO.nextLine();
        return valor;
    }
}
