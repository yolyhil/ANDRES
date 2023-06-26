package paquete2;


public class Clase4 {
    private String atributoPrivate = "atributo privado";
    
    private Clase4() {
        System.out.println("Constructor Privado");
    }
    // creamos un costructor public para poder crear objetos
    public Clase4(String argumento){//aqui se puede llamar al constructor vscio
        this();
        System.out.println("constructor publico");
    }
    //Metodo Private
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
    
    
}
