/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rebec
 */
public class DATConexion {
    //Conectarse a la BDD
    public static Connection con;//obj tipo Conecction

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/asignartutor";
        Class.forName(driver);
        return DriverManager.getConnection(url, "root", "");
    }

    //Objeto tipo Connection para majenar la conecion
    public Connection AbrirConexion() throws ClassNotFoundException, SQLException {
        con = getConnection();
        return con;
    }

    //cerrar la coneccion 
    public void CerrarConexion() throws SQLException {
        con.close();
    }
}
