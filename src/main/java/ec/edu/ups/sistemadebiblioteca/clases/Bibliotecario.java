/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemadebiblioteca.clases;

/**
 *
 * @author USER
 */
public class Bibliotecario extends Usuario {

    private String rol;

    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, int codigo, String rol) {
        super(nombre, codigo);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void registrarPrestamo() {
        System.out.println("Prestamo registrado.");
    }

    @Override
    public String toString() {
        return (super.toString() + " - " + "Rol: " + rol);
    }
}
