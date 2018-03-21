/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Clases.Asignacion;
import DAT.DATAsignacion;
import DAT.DATConexion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rebec
 */
public class BLAsignacion {
    DATAsignacion objDATVuelos = new DATAsignacion();
    DATConexion objDATConexion = new DATConexion();

    public static ArrayList<Asignacion> ArrayAsignacion = new ArrayList<Asignacion>();

    public ArrayList<Asignacion> Consultar() throws ClassNotFoundException, SQLException {
        ResultSet rs;
        rs = objDATVuelos.ConsultarAsign();
        ResultSetMetaData rm = rs.getMetaData();

        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        while (rs.next()) {
            Asignacion objAsignacion = new Asignacion();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("id_asignacion")) {
                    objAsignacion.setId_asignacion(Integer.parseInt(value));
                }
                if (columnName.equals("Tutor")) {
                    objAsignacion.tutor.setNombre(value);
                }
                if (columnName.equals("Curso")) {
                    objAsignacion.curso.setNombre(value);
                }
                if (columnName.equals("Paralelo")) {
                    objAsignacion.setParalelo(value);
                }

            }
            ArrayAsignacion.add(objAsignacion);
        }
        return ArrayAsignacion;
    }

    public int InsertarAsign(Asignacion objVuelo) throws SQLException, ClassNotFoundException {
        int retorno = 0;

        retorno = this.objDATVuelos.InsertarAsign(objVuelo);

        this.cerrarConexion();
        return retorno;
        
    }
    
//    public int Actualizar(int asientoActual, int asiento) throws ClassNotFoundException, SQLException{
//        return objDATVuelos.ActualizarVuelos(asientoActual, asiento);
//        
//    }

    public void cerrarConexion() throws SQLException {
        objDATConexion.CerrarConexion();
    }
}
