package test;
    import enumeraciones.Dias;
    import enumeraciones.Continentes;
/**
 *
 * @author hilda ALIAS  ANDRES
 */
public class TestEnumeraciones {
    public static void main(String[] args){
        //SON ATRIBUTOS ESTATICOS Y FINALES
       // System.out.println("Dia 1"+Dias.LUNES);
       // indicarDiaSemana(Dias.LUNES);
        System.out.println("continente nro 1 "+Continentes.AFRICA);
        System.out.println("nro de paises en el 1 continente : "
                +Continentes.AFRICA.getPaises());
        System.out.println("nro de habitantes en el 1 continente : "
                +Continentes.AFRICA.getHabitantes());
        System.out.println("continente nro 2 "+Continentes.EUROPA);
        System.out.println("nro de paises en el 2 continente : "
                +Continentes.EUROPA.getPaises());
        System.out.println("nro de habitantes en el 2 continente : "
                +Continentes.EUROPA.getHabitantes());
        System.out.println("continente nro 3 "+Continentes.ASIA);
        System.out.println("nro de paises en el 3 continente : "
                +Continentes.ASIA.getPaises());
        System.out.println("nro de habitantes en el 3 continente : "
                +Continentes.ASIA.getHabitantes());
        System.out.println("continente nro 4 "+Continentes.AMERICA);
        System.out.println("nro de paises en el 4 continente : "
                +Continentes.AMERICA.getPaises());
        System.out.println("nro de habitantes en el 4 continente : "
                +Continentes.AMERICA.getHabitantes());
        System.out.println("continente nro 5 "+Continentes.OCEANIA);
        System.out.println("nro de paises en el 5 continente : "
                +Continentes.OCEANIA.getPaises());
        System.out.println("nro de habitantes en el 5 continente : "
                +Continentes.OCEANIA.getHabitantes());
    
    }
    private static void indicarDiaSemana(Dias dias){
        //LAS ENUMERACIONES SE TRATAN COMO cadenas,
        
        //ahora no se deben utilizar comillas, se accede a traves del operador de punto
        switch(dias){
            case LUNES:
                System.out.println(" primer dia de la semana");
                break;
            case MARTES:
                System.out.println("2 dia de la semana");
                
            case MIERCOLES:
                System.out.println(" 3 dia de la semana");
                break;
            case JUEVES:
                System.out.println(" 4 dia de la semana");
                break;
            case VIERNES:
                System.out.println(" 5 dia de la semana");
                break;
            case SABADO:
                System.out.println(" 6 dia de la semana");
           case DOMINGO:
                System.out.println(" 7 dia de la semana");
                break;
           // case :
            //    System.out.println("2 dia de la semana");
                        
        }           
        }
    }    

