/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import DAT.DATConexion;
import java.sql.SQLException;

/**
 *
 * @author rebec
 */
public class BLConexion {
    //para poder acceder a paquete DAT
    DATConexion ManejadorConexion = new DATConexion();
    public void CerrarConexion() throws SQLException
    {
        ManejadorConexion.CerrarConexion();
    }
}
