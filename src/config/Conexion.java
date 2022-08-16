
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/TablaJava?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contra = "17@93j3A_1jE";
    
    public Connection getConnection(){
        
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contra);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion: " + ex);
        }
        return conexion;
    }
    
}
