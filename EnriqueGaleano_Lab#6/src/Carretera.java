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
    private Lugar inicio;
    private Lugar fin;

    public Carretera() {
    }

    public Carretera(int numeroUnico, int distancia, Lugar inicio, Lugar fin) {
        this.numeroUnico = numeroUnico;
        this.distancia = distancia;
        this.inicio = inicio;
        this.fin = fin;
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

    public Lugar getInicio() {
        return inicio;
    }

    public void setInicio(Lugar inicio) {
        this.inicio = inicio;
    }

    public Lugar getFin() {
        return fin;
    }

    public void setFin(Lugar fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "La distancia es "+ distancia;
    }
    
    
}
