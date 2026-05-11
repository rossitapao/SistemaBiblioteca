/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemadebiblioteca.clases;

/**
 *
 * @author USER
 */
public class Estudiante extends Usuario {

    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, int codigo, String carrera) {
        super(nombre, codigo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void solicitarLibro() {
        System.out.println("Libro solicitado.");
    }

    @Override
    public String toString() {
        return (super.toString() + " - " + "Carrera: " + carrera);
    }
}