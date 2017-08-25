
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class Lugar {
    public String nombre;
    private String direccion;
    private int nivelDeSeguridad;
    

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int nivelDeSeguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivelDeSeguridad = nivelDeSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNivelDeSeguridad() {
        return nivelDeSeguridad;
    }

    public void setNivelDeSeguridad(int nivelDeSeguridad) {
        this.nivelDeSeguridad = nivelDeSeguridad;
    }
    @Override
    public String toString() {
        return nombre;
    }
    
    
}
