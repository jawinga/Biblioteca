package libros;

public class Terror extends Book {
    private int calificacion;

    public Terror(String titulo, String autor, int numeroPaginas, int isbn, int calificacion) {
        super(titulo, autor, numeroPaginas, isbn);
        this.calificacion = calificacion;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("ISBN: " + isbn);
        System.out.println("Calificación: " + calificacion);
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}