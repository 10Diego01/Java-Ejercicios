package com.mycompany.libreria;

public class Libreria {
    public static void main(String[] args) {
       
        Biblioteca miBiblioteca = new Biblioteca();

       
        Estudiante est = new Estudiante("Juan Perez");
        Libro libro1 = new Libro("Cien años de soledad", "García Márquez", "12345");

       
        miBiblioteca.agregarLibro(libro1);

        
        Prestamo pres = new Prestamo(1, libro1, est);
        miBiblioteca.agregarPrestamo(pres);

      
        System.out.println("Lista de Libros:");
        miBiblioteca.mostrarLibros();
    }
}
