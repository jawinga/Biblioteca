package bibliotecas;

import libros.Book;
import libros.Terror;
import exceptions.LibraryException;

public class Biblioteca_Terror extends Biblioteca_Base<Terror> {
    private LibroAdditionStrategy additionStrategy;

    public Biblioteca_Terror() {
        this.nombreBiblioteca = "Biblioteca de Terror";
        this.additionStrategy = new TerrorAdditionStrategy();
    }

    @Override
    public Terror aniadirLibro(Terror book) throws LibraryException {
        if (additionStrategy.canAddBook(book)) {
            if (!duplicadosISBN.add(book.getIsbn())) {
                throw new LibraryException("ISBN duplicado: " + book.getTitulo());
            }
            catalogo.add(book);
            System.out.println("Libro añadido a la biblioteca: " + book.getTitulo());
            return book;
        } else {
            throw new LibraryException("Solo se pueden añadir libros de terror.");
        }
    }

    @Override
    public void buscarLibro(int isbn) {
        catalogo.stream()
                .filter(book -> book.getIsbn() == isbn)
                .findFirst()
                .ifPresentOrElse(
                        book -> System.out.println("Libro encontrado: " + book.getTitulo()),
                        () -> System.out.println("No se encontró un libro con el ISBN: " + isbn)
                );
    }

    @Override
    public void mostrarCatalogo() {
        System.out.println("\nLibros en la biblioteca " + nombreBiblioteca + ":");
        catalogo.stream().map(Book::getTitulo).forEach(System.out::println);
    }

    @Override
    public void mostrarNumeroLibros() {
        System.out.println("El catálogo de " + nombreBiblioteca + " contiene " + catalogo.size() + " libros.");
    }

    @Override
    public void eliminarLibro(Terror book) {
        if (catalogo.remove(book)) {
            duplicadosISBN.remove(book.getIsbn());
            System.out.println(book.getTitulo() + " fue eliminado de la biblioteca.");
        } else {
            System.out.println("El libro no se encontró en la biblioteca.");
        }
    }
}