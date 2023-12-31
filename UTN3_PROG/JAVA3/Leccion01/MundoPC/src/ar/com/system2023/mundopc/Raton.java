// hija Raton de clase padre dispositivo entrada
package ar.com.system2023.mundopc;

/**creamos la clase hija raton y creamos los atributos
 *hablamos delas caracteristicas de la clase hija
 * ahora creamos el constructor
 * @author ANDRES
 */
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton =++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ","+super.toString()+"}";
    }
    
}
