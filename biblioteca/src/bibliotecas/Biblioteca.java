package bibliotecas;

import libros.Book;
import exceptions.LibraryException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

public class Biblioteca implements Serializable {
    private static Biblioteca instance;
    private String nombreBiblioteca;
    private ArrayList<Book> catalogo;
    private HashSet<Integer> duplicadosISBN;

    private Biblioteca() {
        this.nombreBiblioteca = "Biblioteca General";
        this.catalogo = new ArrayList<>();
        this.duplicadosISBN = new HashSet<>();
    }

    public static Biblioteca getInstance() {
        if (instance == null) {
            instance = new Biblioteca();
        }
        return instance;
    }

    public Book aniadirLibro(Book book) throws LibraryException {
        if (!duplicadosISBN.add(book.getIsbn())) {
            throw new LibraryException("Libro duplicado: " + book.getTitulo());
        }
        catalogo.add(book);
        System.out.println("Libro añadido: " + book.getTitulo());
        return book;
    }

    public void mostrarCatalogo() {
        System.out.println("\nTodos los libros dentro del catálogo:");
        catalogo.stream()
                .map(Book::getTitulo)
                .forEach(System.out::println);
    }

    public void buscarLibro(int isbn) {
        catalogo.stream()
                .filter(book -> book.getIsbn() == isbn)
                .findFirst()
                .ifPresentOrElse(
                        book -> System.out.println("Libro encontrado: " + book.getTitulo()),
                        () -> System.out.println("Libro con ISBN " + isbn + " no encontrado.")
                );
    }

    public void mostrarNumeroLibros() {
        System.out.println("El catálogo de " + nombreBiblioteca + " contiene " + catalogo.size() + " libros.");
    }

    public void eliminarLibro(Book book) {
        catalogo.remove(book);
        duplicadosISBN.remove(book.getIsbn());
        System.out.println(book.getTitulo() + " ha sido eliminado del catálogo " + nombreBiblioteca);
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public ArrayList<Book> getCatalogo() {
        return new ArrayList<>(catalogo);
    }
}