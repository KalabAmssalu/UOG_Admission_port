/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityadmission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kalab
 */
public class databaseConnection {
    public static Connection connectdb(){
        String url = "jdbc:derby://localhost:1527/UniversityAdmission";
        String un = "UOG";
        String ps = "group3";
        Connection con = null;
        try {
            con =  DriverManager.getConnection(url,un,ps);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(databaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
