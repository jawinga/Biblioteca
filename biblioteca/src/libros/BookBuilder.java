package libros;

public class BookBuilder {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int isbn;
    private TipoHumor tipoHumor;
    private int calificacion;
    private boolean esMisterio;
    private int personajes;

    public BookBuilder setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public BookBuilder setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public BookBuilder setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
        return this;
    }

    public BookBuilder setIsbn(int isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder setTipoHumor(TipoHumor tipoHumor) {
        this.tipoHumor = tipoHumor;
        return this;
    }

    public BookBuilder setCalificacion(int calificacion) {
        this.calificacion = calificacion;
        return this;
    }

    public BookBuilder setEsMisterio(boolean esMisterio) {
        this.esMisterio = esMisterio;
        return this;
    }

    public BookBuilder setPersonajes(int personajes) {
        this.personajes = personajes;
        return this;
    }

    public Book build() {
        if (tipoHumor != null) {
            return new Comedia(titulo, autor, numeroPaginas, isbn, tipoHumor);
        } else if (calificacion != 0) {
            return new Terror(titulo, autor, numeroPaginas, isbn, calificacion);
        } else {
            return new Policiaca(titulo, autor, numeroPaginas, isbn, esMisterio, personajes);
        }
    }
}