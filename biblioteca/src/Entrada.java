package main;

import bibliotecas.*;
import libros.*;
import exceptions.LibraryException;

public class Entrada {

    public static void main(String[] args) {
        try {
            // Crear instancias de las bibliotecas
            Biblioteca biblioteca = Biblioteca.getInstance();
            Biblioteca_Terror biblioTerror = new Biblioteca_Terror();
            Biblioteca_Policiaca biblioPoliciaca = new Biblioteca_Policiaca();
            Biblioteca_Comedia biblioComedia = new Biblioteca_Comedia();

            // Crear libros usando el BookBuilder
            Book comedia1 = new BookBuilder()
                    .setTitulo("El Quijote")
                    .setAutor("Miguel de Cervantes")
                    .setNumeroPaginas(863)
                    .setIsbn(1234567890)
                    .setTipoHumor(TipoHumor.SATIRICO)
                    .build();

            Book terror1 = new BookBuilder()
                    .setTitulo("It")
                    .setAutor("Stephen King")
                    .setNumeroPaginas(1138)
                    .setIsbn(1357924689)
                    .setCalificacion(9)
                    .build();

            Book policiaca1 = new BookBuilder()
                    .setTitulo("El nombre de la rosa")
                    .setAutor("Umberto Eco")
                    .setNumeroPaginas(503)
                    .setIsbn(1357924680)
                    .setEsMisterio(true)
                    .setPersonajes(8)
                    .build();

            // Añadir libros a las bibliotecas correctas
            biblioComedia.aniadirLibro((Comedia) comedia1);
            biblioTerror.aniadirLibro((Terror) terror1);
            biblioPoliciaca.aniadirLibro((Policiaca) policiaca1);

            // Mostrar los catálogos de las bibliotecas
            biblioComedia.mostrarCatalogo();
            biblioTerror.mostrarCatalogo();
            biblioPoliciaca.mostrarCatalogo();

        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}