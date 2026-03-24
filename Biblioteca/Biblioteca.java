package com.mycompany.libreria;
import java.util.*;
import java.util.ArrayList;
public class Biblioteca {
    private List<Libro> listaLibros;
    private List<Prestamo> listaPrestamos;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
        this.listaPrestamos = new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        listaLibros.add(libro);
    }
    public void agregarPrestamo(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }
    public Libro buscarLibro(String isbn){
        for(Libro libro: listaLibros){
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }
    public void mostrarLibros(){
        listaLibros.forEach(System.out::println);
    }
    public void mostarPrestamos(){
        listaPrestamos.forEach(System.out::println);
    }
}
