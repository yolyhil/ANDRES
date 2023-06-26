/*
 video 8 de clase 1
 */
package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
 public static void main(String[] args) {
      Monitor monitorHP = new Monitor("HP", 13);//Importar la clase
      Teclado tecladoHP = new Teclado("Bluetooth", "HP");
      Raton ratonHP = new Raton("Bluetooth", "HP");
      Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
      //Creamos otros objetos de diferente marca
      Monitor monitorGamer = new Monitor("Gamer", 32);
      Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
      Raton ratonGamer = new Raton("Bluetooth", "Gamer");
      Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
      Orden orden1 = new Orden();// inicializamos el areglo vacio
      Orden orden2 = new Orden();
      orden1.agregarComputadora(computadoraHP);
      orden1.agregarComputadora(computadoraGamer);
      Computadora computadorasVarias = new Computadora("computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
      orden2.agregarComputadora(computadorasVarias);
      orden1.mostrarOrden();
      orden2.mostrarOrden();
    } 
}