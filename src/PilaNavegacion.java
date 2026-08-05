/**
 * Pila (LIFO) implementada a mano con nodos, usada para el historial
 * de "atras" del navegador (patron cima/top).
 */
public class PilaNavegacion {

    private NodoPagina cima;
    private int size;

    public void push(String url) {
        NodoPagina nuevo = new NodoPagina(url);
        nuevo.setSiguiente(cima);
        cima = nuevo;
        size++;
    }

    public String pop() {
        if (estaVacia()) {
            throw new IllegalStateException("No hay paginas en el historial (underflow)");
        }
        String url = cima.getUrl();
        cima = cima.getSiguiente();
        size--;
        return url;
    }

    public String peek() {
        if (estaVacia()) {
            throw new IllegalStateException("El historial esta vacio");
        }
        return cima.getUrl();
    }

    public boolean estaVacia() {
        return cima == null;
    }

    public int size() {
        return size;
    }

    public void mostrarHistorial() {
        if (estaVacia()) {
            System.out.println("Historial vacio.");
            return;
        }
        NodoPagina actual = cima;
        System.out.println("(mas reciente primero)");
        while (actual != null) {
            System.out.println("- " + actual.getUrl());
            actual = actual.getSiguiente();
        }
    }
}
