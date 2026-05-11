/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemadebiblioteca.clases;

import java.util.Date;
//
/**
 *
 * @author USER
 */
public class Prestamo {
    
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Usuario usuario;
    private Libro libro;
    private Multa multa;
    
    public Prestamo(){
        
    }

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Usuario usuario, Libro libro, Multa multa) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.usuario = usuario;
        this.libro = libro;
        this.multa = multa;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }
    
    public void mostrarPrestamo(){
        System.out.println("Fecha del prestamo: " + fechaPrestamo);
        System.out.println("Fecha de devolucion: " + fechaDevolucion);
        System.out.println("Usuario: " + usuario);
        System.out.println("Libro: " + libro);
        System.out.println("Multa: " + multa);
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", usuario=" + usuario + ", libro=" + libro + ", multa=" + multa + '}';
    }
    
    
    
    
    
}
