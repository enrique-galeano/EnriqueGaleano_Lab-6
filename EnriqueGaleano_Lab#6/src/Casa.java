/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class Casa extends Lugar{
    private String categoriaDeLujos;

    public Casa() {
        super();
    }

    public Casa(String categoriaDeLujos, String nombre, String direccion, int nivelDeSeguridad) {
        super(nombre, direccion, nivelDeSeguridad);
        this.categoriaDeLujos = categoriaDeLujos;
    }

    public String getCategoriaDeLujos() {
        return categoriaDeLujos;
    }

    public void setCategoriaDeLujos(String categoriaDeLujos) {
        this.categoriaDeLujos = categoriaDeLujos;
    }
    
    
}
