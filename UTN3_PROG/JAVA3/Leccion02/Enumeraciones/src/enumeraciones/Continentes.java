package enumeraciones;

/**
 *
 * @author HILDA ALIAS ANDRES
 */
public enum Continentes {
        AFRICA(53," 1.2 billones "),
        EUROPA(46," 1.1 billones "),
        ASIA(44," 1.9 billones "),
        AMERICA(34," 150.2 millones "),
        OCEANIA(14," 1.2 billones ");
        private final int paises;
        private String habitantes;
        //definimos un contructor para asociar a 
        //cada  elemento de la enumeracion
        Continentes(int paises, String habitantes){
            this.paises = paises;
            this.habitantes = habitantes;
        }
           // METODO GET
        public int getPaises(){
            return this.paises;
        }
        public String getHabitantes(){
            return this.habitantes;
        }
        
    
}
