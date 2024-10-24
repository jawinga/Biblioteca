package bibliotecas;

import libros.Book;
import libros.Terror;

public class TerrorAdditionStrategy implements LibroAdditionStrategy {

    @Override
    public boolean canAddBook(Book book) {
        return book instanceof Terror;
    }
}