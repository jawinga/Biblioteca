package libros;

public class Comedia extends Book {
    private TipoHumor tipoHumor;

    public Comedia(String titulo, String autor, int numeroPaginas, int isbn, TipoHumor tipoHumor) {
        super(titulo, autor, numeroPaginas, isbn);
        this.tipoHumor = tipoHumor;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("ISBN: " + isbn);
        System.out.println("Tipo de humor: " + tipoHumor);
    }

    @Override
    public String toString() {
        return "Comedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", isbn=" + isbn +
                ", tipoHumor=" + tipoHumor +
                '}';
    }

    public TipoHumor getTipoHumor() {
        return tipoHumor;
    }

    public void setTipoHumor(TipoHumor tipoHumor) {
        this.tipoHumor = tipoHumor;
    }
}