package UTN.presentacion;

import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;
import UTN.conexion.Conexion;
import java.util.Scanner;

public class SistemaEstudiantesApp {
    public static void main(String[] args) {
        var salir = false; //recuerden ya lo hicimos antes
        var consola = new Scanner(System.in);//para leer informacion de la consola
        //se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDao = new EstudianteDAO();// esta instancia debe hacerse una vez
        while (!salir) {
            try {
                mostrarMenu();//este metodo ejecutar opciones devolvera un booleano
                salir = ejecutarOpciones(consola, estudianteDao);//este arroja una exception
            } catch (Exception e) {
                System.out.println("Ocurrio un erro al ejecutar la operacion: " + e.getMessage());
            }
        }//Fin while
    }//Fin main

    private static void mostrarMenu() {
        System.out.print("""
                ********  SISTEMAS DE ESTUDIANTES  *******
                                
                1- LISTAR ESTUDIANTES
                2- BUSCAR ESTUDIANTES
                3- AGREGAR ESTUDIANTES
                4- MODIFICAR ESTUDIANTES
                5- ELIMINAR ESTUDIANTES
                6- SALIR
                                
                ELIGE UNA OPCION:
                                
                """);
    }//fin metodo mostrar menu

    // Metodo par ejercutar las opciones,va regresar un valor booleano
    //ya que es el que puede modificar el valor de la variable salir, si es
    //verdadero termina el ciclo while
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> {//Listar estudiantes
                System.out.println(" Listados de Estudiantes ---");
                //no muestra la informacion, solo recupera la info y regresa una lista
                var estudiante = estudianteDAO.listarEstudiantes();//recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiante.forEach(System.out::println);//para imprimir la lista
            }//fin case 1
            case 2 -> {//Buscar estudiante por id
                System.out.println(" Introduce el id_estudiante a buscar ---");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if (encontrado)
                    System.out.println(" Estudiante encontrado " + estudiante);
                else
                    System.out.println(" Estudiante No encontrado " + estudiante);
            }//fin case 2
            case 3 -> {//Agregar estudiantes
                System.out.println(" Agregar Estudiantes ---");
                System.out.print(" Nombre ");
                var nombre = consola.nextLine();
                System.out.print(" Apellido ");
                var apellido = consola.nextLine();
                System.out.print(" Telefono ");
                var telefono = consola.nextLine();
                System.out.print(" Email ");
                var email = consola.nextLine();
                //crear objeto estudiante (sin id)
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDAO.agregarEstudiante(estudiante);
                if (agregado)
                    System.out.println(" Estudiante agregado: " + estudiante);
                else
                    System.out.println(" Estudiante No agregado " + estudiante);
            }//fin case 3
            case 4 -> {// Modificar estudiante
                System.out.println(" Modificar Estudiante: ");
                //Aqui lo primero es especificar cual es el id del objeto a modificar
                System.out.println(" Id Estudiante");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.print(" Nombre ");
                var nombre = consola.nextLine();
                System.out.print(" Apellido ");
                var apellido = consola.nextLine();
                System.out.print(" Telefono ");
                var telefono = consola.nextLine();
                System.out.print(" Email ");
                var email = consola.nextLine();
                //crear el objeto estudiante a modificar
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var modificado = estudianteDAO.modificarEstudiante(estudiante);
                if (modificado)
                    System.out.println(" Estudiante modificado: " + estudiante);
                else
                    System.out.println(" Estudiante No modificado " + estudiante);
            }//fin case 4
            case 5 -> {// Eliminar estudiante
                System.out.println(" Eliminar Estudiante: ");
                System.out.println(" Id Estudiante");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDAO.eliminarEstudiante(estudiante);
                if (eliminado)
                    System.out.println(" Estudiante Eliminado: " + estudiante);
                else
                    System.out.println(" Estudiante No Eliminado " + estudiante);
            }//fin case 5
            case 6 -> {//salir
                System.out.println(" Hasta Pronto !!! ");
                salir = true;
            }// fin case 6
            default -> System.out.println(" Opcion no valida, ingrese otra opcion");
        }// fin switch
        return salir;
    }
} // Fin clase





