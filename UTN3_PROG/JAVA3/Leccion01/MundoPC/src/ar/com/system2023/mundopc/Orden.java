package ar.com.system2023.mundopc;


public class Orden {
    private final int idOrden;
    private Computadora computadora[];//Arreglo de obejtos
    private static int contadorOrdenes;
    private  static final int Max_COMPUTADORAS = 10;
    private int contadorComputadora;
    //constructor vacio
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.Max_COMPUTADORAS];
    }
    //Metodo para agregar una nueva computadora al areglo
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora<Orden.Max_COMPUTADORAS){
          this.computadora[this.contadorComputadora++]=computadora;
        }
        else{
            System.out.println("has superador el limite: "+Orden.Max_COMPUTADORAS);
        }
    }
    // Mostrar orden
    public void mostrarOrden(){
        System.out.println("Orden #: "+this.idOrden);
        System.out.println("Computadora de la roden #: "+this.idOrden);
        for(int i = 0; i<this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }//hasta clase 1 video 7
}
