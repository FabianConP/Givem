/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fabian
 */
public class Conexion {

    public Connection c;

    public Conexion() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String dbUrl = "jdbc:mysql://localhost/db_Givem";
        try {
            c = DriverManager.getConnection(dbUrl, "root", "1234");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

}
