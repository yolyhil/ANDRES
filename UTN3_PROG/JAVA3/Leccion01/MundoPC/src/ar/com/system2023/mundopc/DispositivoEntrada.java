//clase 1 de programacion 3
package ar.com.system2023.mundopc;

/**
 *
 * @author ANDRES- hilda- primer constructor realizado
 */
public class DispositivoEntrada {
   private String tipoEntrada;
   private String marca;
   public DispositivoEntrada(String tipoEntrada, String marca){
       this.tipoEntrada= tipoEntrada;
       this.marca = marca;
    }

    public String getTipoEntrada() {
        return this.tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }// con esto esta creado la clase dispositivo entrada;nuestra clase de disp e/
    // ahora crear clases hijas
}
