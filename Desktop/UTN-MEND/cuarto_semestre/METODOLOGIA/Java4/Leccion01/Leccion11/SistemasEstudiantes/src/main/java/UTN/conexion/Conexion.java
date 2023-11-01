package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        //variable de conexion a la base de datos
        var basedeDatos = "estudiantes";
        var url = "jdbc:mysql://localhost:3306/"+basedeDatos;
        var usuario = "root";
        var password = "Admin";
        // cargamos el driver de mysql en memoria
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);

        } catch (ClassNotFoundException | SQLException e){
            System.out.println("ocurrio un error en la conexion: "+e.getMessage());
        }//fin catch
        return conexion;
    }//Fin metodo conecction
}//
