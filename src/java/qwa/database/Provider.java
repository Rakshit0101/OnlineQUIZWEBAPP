/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwa.database;

/**
 *
 * @author rakshit
 */
import java.util.Scanner;
import java.sql.*;
public class Provider {
    public static Connection getConnection()
    {
        Connection con = null;
	try
        { 
            Class.forName("com.mysql.jdbc.Driver");
            
	    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizwebapp_database","root","qwerty");
	    System.out.println("Connection successful!");
	}catch (Exception e) {System.out.println(e);}
    return con;
    }
}