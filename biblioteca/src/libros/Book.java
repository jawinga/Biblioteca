package libros;

import java.io.Serializable;

public abstract class Book implements Serializable {
    protected String titulo;
    protected String autor;
    protected int numeroPaginas;
    protected int isbn;

    public Book(String titulo, String autor, int numeroPaginas, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
    }

    public abstract void mostrarDatos();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}