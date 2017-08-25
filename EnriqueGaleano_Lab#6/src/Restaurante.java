/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class Restaurante extends Lugar{
    private String gategoria;
    private int clasificacion;

    public Restaurante() {
        super();
    }

    public Restaurante(String gategoria, int clasificacion, String nombre, String direccion, int nivelDeSeguridad) {
        super(nombre, direccion, nivelDeSeguridad);
        this.gategoria = gategoria;
        this.clasificacion = clasificacion;
    }

    public String getGategoria() {
        return gategoria;
    }

    public void setGategoria(String gategoria) {
        this.gategoria = gategoria;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
    
}
