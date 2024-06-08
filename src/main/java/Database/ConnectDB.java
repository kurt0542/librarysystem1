/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class ConnectDB {
    
    public static Connection Conn() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = "C:\\Users\\STUDENT\\OneDrive\\Documents\\NetBeansProjects\\portal-ni-benhamin\\db\\DatabaseNiBFF.accdb";
            String url = "jdbc:ucanaccess://" + path;  
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
