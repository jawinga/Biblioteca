package bibliotecas;

import libros.Book;
import exceptions.LibraryException;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class Biblioteca_Base<T extends Book> {
    protected String nombreBiblioteca;
    protected ArrayList<T> catalogo;
    protected HashSet<Integer> duplicadosISBN;

    public Biblioteca_Base() {
        this.catalogo = new ArrayList<>();
        this.duplicadosISBN = new HashSet<>();
    }

    public abstract T aniadirLibro(T book) throws LibraryException;

    public abstract void buscarLibro(int isbn);

    public abstract void mostrarCatalogo();

    public abstract void mostrarNumeroLibros();

    public abstract void eliminarLibro(T book);

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public ArrayList<T> getCatalogo() {
        return new ArrayList<>(catalogo);
    }
}