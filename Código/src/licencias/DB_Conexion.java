/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licencias;
import java.sql.Connection;
import java.sql.DriverManager;


public class DB_Conexion {
    Connection conectar = null;
    
    public Connection getConexion()
    {
    try
    { 
        Class.forName("com.mysql.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/licencias", "root", "123456");
       
    } 
    catch (Exception e)
    {
        System.out.print(e.getMessage());
    }
       return conectar; 
    }
    
    }
