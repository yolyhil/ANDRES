package paquete1;


class Clase2  {
    String atributoDefault = "valor del atributo default";
   // Clase2(){
    //    System.out.println("constructor default");
    //}
    public Clase2(){
        super();
        this.atributoDefault="Modificacion del atributo default";
        System.out.println("atributoDefault= "+this.atributoDefault);
        this.metodoDefault();
        
    }
    void metodoDefault(){
        System.out.println("Metodo default");
    }
        
    }
