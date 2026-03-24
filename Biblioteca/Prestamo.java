package com.mycompany.libreria;
import java.time.LocalDate;
import java.util.*;
public class Prestamo {
    private int numero;
    private LocalDate fechaPrestamo;
    private Libro libro;
    private Estudiante estudiante;

    public Prestamo(int numero, Libro libro, Estudiante estudiante) {
        this.numero = numero;
        this.libro = libro;
        this.estudiante = estudiante;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "numero=" + numero + ", fechaPrestamo=" + fechaPrestamo + ", libro=" + libro + ", estudiante=" + estudiante + '}';
    }
    
}
