/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriq
 */
public class Carretera {
    private int numeroUnico;
    private int distancia;

    public Carretera() {
    }

    public Carretera(int numeroUnico, int distancia) {
        this.numeroUnico = numeroUnico;
        this.distancia = distancia;
    }

    public int getNumeroUnico() {
        return numeroUnico;
    }

    public void setNumeroUnico(int numeroUnico) {
        this.numeroUnico = numeroUnico;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "La distancia es "+ distancia;
    }
    
    
}
