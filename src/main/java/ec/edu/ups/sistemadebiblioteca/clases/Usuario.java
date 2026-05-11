/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemadebiblioteca.clases;

/**
 *
 * @author USER
 */
public class Usuario {

    private String nombre;
    private int codigo;

    public Usuario() {
    }

    public Usuario(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void mostrarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
    }

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " - " + "Codigo: " + codigo);
    }
}