package UTN.datos;
import static UTN.conexion.Conexion.getConnection;
import UTN.dominio.Estudiante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    //Metod listar
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // creamos algunos objetos que son neces para la comunicacion c/bdd
        PreparedStatement ps;//envia la sentencia a la base de datos
        ResultSet rs;// almacena lo que obtenemos de la base de datos
        //creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes2022 ORDER BY idestudiantes2022";
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               var estudiante = new Estudiante();
               estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
               estudiante.setNombre(rs.getString("nombre"));
               estudiante.setApellido(rs.getString("Apellido"));
               estudiante.setTelefono(rs.getString("Telefono"));
               estudiante.setEmail(rs.getString("email"));
               //falta agregar a la lista
               estudiantes.add(estudiante);
            }

        } catch (Exception e){
            System.out.println("Ocurrio un error al seleccionar datos: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("ocurrio un error al cerrar la conexion "+e.getMessage());
            }
        }// fin finally
        return estudiantes;
    }// fin metodo listar
    //Metodo por id-> fin by id
    public boolean buscarEstudiantePorId(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT  * FROM estudiantes2022 WHERE idestudiantes2022=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if(rs.next()){
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; //se encontro un registro
            } // fin if
        } catch (Exception e){
            System.out.println("ocurrio un erro al buscar"+e.getMessage());
        }
        finally {
            try{
               con.close();
        } catch (Exception e){
                System.out.println("Ocurrio un error al cerrar la conexion"+e.getMessage());
            }//fin catch

            }//fin finally
        return false;
    }
    // Metodo agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes2022(nombre, apellido, telefono, email) VALUES (?, ?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Ocurrio un error al agregar al estudiante"+e.getMessage());
        }// fin de catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Error al cerrar la conexion "+e.getMessage());
            }// fin catch
        }// fin finally
        return false;
    }
    /// bis metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=?) WHERE idEstudiante=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al modificar  estudiante"+e.getMessage());

        }// fin de catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Error al cerrar la conexion "+e.getMessage());
            }// fin catch
        }// fin finally
        return false;
    }

    // Metodo Eliminar estudiante
    public boolean eliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=?) WHERE idEstudiante=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(15, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al eliminar estudiante"+e.getMessage());

        }// fin de catch
        finally {
            try{
                con.close();
            } catch (Exception e){
                System.out.println("Error al cerrar la conexion "+e.getMessage());
            }// fin catch
        }// fin finally
        return false;
    }



    public static void main(String[] args) {
        //listar los estudiantes
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);//FUNCION LAMBDA para imprimir

        // Modificar Estudiante
        var estudianteModificado = new Estudiante(1, "Carlos", "Lara", "458922", "clara@gmail.com");
        var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
        if(modificado)
            System.out.println("Estudiante Modificado "+estudianteModificado);
        else
            System.out.println("No se a modificado estudiante"+estudianteModificado);


        //Agregar nuevo estudiante
        var nuevoEstudiante = new Estudiante("Carlos", "Lara", "458922", "clara@gmail.com");
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if(agregado)
            System.out.println("Estudiante agregado "+nuevoEstudiante);
        else
            System.out.println("No se a agregado un nuevo estudiante"+nuevoEstudiante);

        //Eliminar estudiante
        var estudianteEliminar = new Estudiante(15);
        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminar);
        if(eliminado)
            System.out.println("Estudiante eliminado "+nuevoEstudiante);
        else
            System.out.println("No se elimino estudiante"+estudianteEliminar);

        // Buscar por id
       // var estudiante1 = new Estudiante(1);
      //  System.out.println("Estudiantes antes de la busquedad "+estudiante1);
      //  var encontrado = estudianteDao.buscarEstudiantePorId(estudiante1);
     //   if (encontrado)
      //      System.out.println("Estudiante encontrado "+estudiante1);
    //    else
        //    System.out.println("No se encontro el estudiante solicitado"+estudiante1.getIdEstudiante());

    }
}
