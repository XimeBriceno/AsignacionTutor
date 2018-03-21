/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Clases.Curso;
import DAT.DATConexion;
import DAT.DATCurso;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rebec
 */
public class BLCurso {
    DATCurso objDATCurso = new DATCurso();
    DATConexion objDATConexion = new DATConexion();

    public static ArrayList<Curso> ArrayCurso = new ArrayList<Curso>();
    
    public ArrayList<Curso> Consultar() throws ClassNotFoundException, SQLException {
    ResultSet rs;
    rs = objDATCurso.ConsultarCurso();
    ResultSetMetaData rm = rs.getMetaData();
    
    int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        while (rs.next()) 
        {
            Curso objOrigen = new Curso();
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("id_curso"))
                    objOrigen.setId_curso(Integer.parseInt(value));
                if (columnName.equals("Nombre"))
                    objOrigen.setNombre(value);
                
            }
            ArrayCurso.add(objOrigen);
        }
        return ArrayCurso;
    }
    public int InsertarOrigen(Curso objCurso) throws SQLException, ClassNotFoundException{
        int retorno=0;
  
        retorno=this.objDATCurso.InsertarOrigen(objCurso);
        
        this.cerrarConexion();
        return retorno;
    }
    
    public void cerrarConexion() throws SQLException{
        objDATConexion.CerrarConexion();
    }
}
