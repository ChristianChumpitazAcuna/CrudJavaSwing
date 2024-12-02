/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.vallegrande.swingcrud.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chris
 */
public class ConectionDB {
    
    String hostname = "database-3.cjaum2c8c7pw.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/usersDB";
    String user = "admin";
    String password = "ValleGrande";

    Connection con;

    public ConectionDB() {
        try {

            con = DriverManager.getConnection(jdbcUrl, user, password);

        } catch (SQLException e) {
            System.out.println("error en la conexion: " + e);
        }
    }

    public Connection getConexion() {
        return con;
    }
}
