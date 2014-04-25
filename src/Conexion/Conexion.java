/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Administrador
 */
public class Conexion {
    private Connection conn;
public Conexion()
{
verificar();
conectarse();
}
public boolean verificar()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
return true;
}
catch(ClassNotFoundException ex)
{
    System.out.println("error :c");
return false;
}
}
public boolean conectarse()
{
try
{
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/redbanc","root","" );
return true;
}
catch(SQLException a)
{
    System.out.println(a.getMessage());
return false;

}

}

public PreparedStatement crearSentencia(String consulta)
{


try{ 
return conn.prepareStatement(consulta);
}
catch(SQLException ex)
{
return null;
}
}
}
