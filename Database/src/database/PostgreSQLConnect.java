/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import inputOutput.ConnectionData;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author danielledalessio
 */
public class PostgreSQLConnect {
    
    Connection connect = null;
    
    public PostgreSQLConnect (ConnectionData data)
    {
        //try and catch
        try
        {
            Class.forName(data.getType());
            connect = DriverManager.getConnection(data.toString(), data.getLogin(), data.getPassword());
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        //print if opened
        System.out.println("Opened database successfully");
    }
    
    public Connection getConnection()
    {
        return connect;
    }
}