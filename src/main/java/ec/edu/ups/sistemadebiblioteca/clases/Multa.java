/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.sistemadebiblioteca.clases;

/**
 *
 * @author USER
 */
public class Multa {
    //
    private double multa;
    private String motivo;
    
    public Multa(){
        
    }

    public Multa(double multa, String motivo) {
        this.multa = multa;
        this.motivo = motivo;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    public void mostrarMulta(){
        System.out.println("Multa: " + multa);
        System.out.println("Motivo: " + motivo);
        
    }

    @Override
    public String toString() {
        return "Multa{" + "multa=" + multa + ", motivo=" + motivo + '}';
    }
    
}
