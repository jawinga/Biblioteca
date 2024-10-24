package libros;

public class Policiaca extends Book {
    private boolean esMisterio;
    private int personajes;

    public Policiaca(String titulo, String autor, int numeroPaginas, int isbn, boolean esMisterio, int personajes) {
        super(titulo, autor, numeroPaginas, isbn);
        this.esMisterio = esMisterio;
        this.personajes = personajes;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("ISBN: " + isbn);
        System.out.println("Es misterio: " + esMisterio);
        System.out.println("Número de personajes: " + personajes);
    }

    public boolean isEsMisterio() {
        return esMisterio;
    }

    public void setEsMisterio(boolean esMisterio) {
        this.esMisterio = esMisterio;
    }

    public int getPersonajes() {
        return personajes;
    }

    public void setPersonajes(int personajes) {
        this.personajes = personajes;
    }
}