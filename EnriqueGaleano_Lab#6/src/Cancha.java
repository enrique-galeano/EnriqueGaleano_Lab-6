/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class Cancha extends Lugar{
    private String categoria;
    private boolean estado;

    public Cancha() {
    super();
    }

    public Cancha(String categoria, boolean estado, String nombre, String direccion, int nivelDeSeguridad) {
        super(nombre, direccion, nivelDeSeguridad);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
