/*
 * extencion de la clase padre dispositivoEntrada
 * 
 */
package ar.com.system2023.mundopc;

/**
 *
 * @author ANDRES
 */
public class Teclado extends DispositivoEntrada{
    private final int idTeclados;
    private static int contadorTeclados;
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclados =++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclados + ","+super.toString()+"}";
    }
    
}

    

