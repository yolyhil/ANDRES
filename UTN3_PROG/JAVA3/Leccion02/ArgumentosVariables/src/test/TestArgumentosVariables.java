package test;

/**
 *
 * @author hilda alias ANDRES
 */
public class TestArgumentosVariables {
    public static void main(String[] args){
    imprimirNumeros(3,4,5);
    imprimirNumeros(1,2);
    variosParametros("Juan","Perez", 7,8, 9);
}
    private static void variosParametros(String nombre,String apellido, int...numeros){
        // podemos pasar varios argumentos pero siempre al final va el variable
        System.out.println("Nombre "+nombre+ " Apellido "+apellido);
        System.out.println("Apellido "+apellido);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int ...numeros){
        //se convierte en un areglos de elementos variables cant indefinida
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elementos: "+ numeros[i]);
        }
    }
}

