package bibliotecas;

import libros.Book;

public interface LibroAdditionStrategy {
    boolean canAddBook(Book book);
}