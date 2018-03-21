/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import Clases.Asignacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rebec
 */
public class DATAsignacion {
    DATConexion objDATConexion = new DATConexion();

    static String senStr;

    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        Statement st = objDATConexion.AbrirConexion().createStatement();//obj para poder manipular abre coneccion y crea unStatement 
        String Sentencia = "SELECT * FROM asignarTutor";//crea un a varible y ponermos la cadena para recuperar todo desde la BDD
        ResultSet rs = st.executeQuery(Sentencia);//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }
    
    public ResultSet ConsultarAsign() throws ClassNotFoundException, SQLException {
        Statement st = objDATConexion.AbrirConexion().createStatement();//obj para poder manipular abre coneccion y crea unStatement 
        String Sentencia = "SELECT id_asignacion, Curso, Tutor, Paralelo FROM asignaciones";//crea un a varible y ponermos la cadena para recuperar todo desde la BDD
        ResultSet rs = st.executeQuery(Sentencia);//recuper un un ResultSet y envio la varible a executeQuery
        return rs;//retornma en un obj ResultSet rs
    }

    public ResultSet Consultar(int Id) throws ClassNotFoundException, SQLException {
        Statement st = objDATConexion.AbrirConexion().createStatement();//crea un puente entre la conexion
        String Sentencia = "SELECT id_asignacion, Curso, Tutor, Paralelo FROM asignaciones WHERE id_asignacion = " + Id;
        ResultSet rs = st.executeQuery(Sentencia);//guardo en ResultSet los datos de st que consulta
        return rs;
    }

//    public int InsertarAsign(Asignacion nuevoAsign) throws SQLException, ClassNotFoundException {
//        int intRetorno = 0;
//        Statement st = objDATConexion.AbrirConexion().createStatement();
//        String Sentencia = "INSERT INTO asignaciones (Tutor, Curso, Paralelo)  VALUES ( "
//                + "'" + nuevoAsign.getTutor() + "'" + ","
//                + "'" + nuevoAsign.getCurso() + "'" + ","
//                + "'" + nuevoAsign.getParalelo() + "'" + ")";
//        intRetorno = st.executeUpdate(Sentencia);
//        return intRetorno;
//    }
    
      public int InsertarAsign( Asignacion nuevoAsign ) throws SQLException, ClassNotFoundException{
        int intRetorno=0;
        Statement st = objDATConexion.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO asignaciones VALUES (0,'"+nuevoAsign.getTutor().getNombre() + "','"+nuevoAsign.getCurso().getNombre()+"','"+nuevoAsign.getParalelo()+"')";
        intRetorno = st.executeUpdate(Sentencia);
        return intRetorno;
      }
}
