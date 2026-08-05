public class NodoPagina {

    private final String url;
    private NodoPagina siguiente;

    public NodoPagina(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public NodoPagina getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPagina siguiente) {
        this.siguiente = siguiente;
    }
}
