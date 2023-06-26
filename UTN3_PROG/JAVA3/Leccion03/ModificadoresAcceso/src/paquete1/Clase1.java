package paquete1;

/**
 *
 * @author hilda alias ANDRES
 */
public class Clase1 {
    public String atributoPublic  = "valor atributo public";
    protected String atributoProtected = "valor atriboto protected";
    public Clase1(){
        System.out.println("constructor public");
    }
    protected Clase1(String atributopublic){
        System.out.println("constructor protected ");
        
    }
    
    public void metodoPublico(){
        System.out.println("Metodo public");
    }
    protected void metodoProtected(){
        System.out.println("Metodo Protected");
    }
}
