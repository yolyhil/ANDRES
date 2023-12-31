/*
 * creacion de la clase hija Monitor 
 * 
 */
package ar.com.system2023.mundopc;

public class Monitor {
    
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores; //vamos a crear el contructor vacio
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamanio){
        this();// llamada al constructor vacio
        this.marca=marca;
        this.tamanio= tamanio;
    }//termine el constructor que se necesita de tipo publico

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
//ingresamos manual el getidMonitor
    public int getIdMonitor(){
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }
    
}
