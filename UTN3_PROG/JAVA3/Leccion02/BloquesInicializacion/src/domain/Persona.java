package domain;

/**
 *
 * @author hilda alias  ANDRES
 * tenemos bloques de inicializacion son dos tipos
 * estaticos y no estaticos, primero se ejecuta el b estatico
 */
public class Persona {
    private final int idPersona;//atributo no estatico
    private static int contadorPersonas;
    static{//bloque de inicializacion estatico o inicializacion
        System.out.println("Ejecucion de bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10;no es estatico por eso el error
    }
    { //Bloque de inicailizacion No estatico{contexto dinamico)
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;// incrementamos el atributo
    }
    // los bloques de inicializacion se ejecutan antes del constructor 
    public Persona(){
        System.out.println("es la ejecucion del constructor");
    }
    public int getIdPersona(){
        return this.idPersona;
    }
    @Override
    public String toString(){
        return " persona{ "+" idPersona = "+idPersona +'}';
    }
}
