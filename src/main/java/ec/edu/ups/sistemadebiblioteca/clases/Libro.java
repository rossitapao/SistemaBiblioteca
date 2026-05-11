/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemadebiblioteca.clases;

/**
 *
 * @author USER
 */
public class Libro {

    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponible;
    private String ISBN;
    private int yearPublicacion;
    private String editorial;
    
    public Libro(){
        
    }

    public Libro(String titulo, Autor autor, String genero, boolean disponible, String ISBN, int yearPublicacion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
        this.ISBN = ISBN;
        this.yearPublicacion = yearPublicacion;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYearPublicacion() {
        return yearPublicacion;
    }

    public void setYearPublicacion(int yearPublicacion) {
        this.yearPublicacion = yearPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    public void prestarLibro(){
    disponible = false;
    }

    public void devolverLibro(){
        disponible = true;
    }
    
    public void mostrarLibro(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Genero: " + genero);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Año de publicacion: " + yearPublicacion);
        System.out.println("Editorial: " + editorial);
        System.out.println("Disponibilidad: " + disponible);
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", disponible=" + disponible + ", ISBN=" + ISBN + ", yearPublicacion=" + yearPublicacion + ", editorial=" + editorial + '}';
    }
    
    //
}
