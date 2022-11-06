/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qwa.model;

/**
 *
 * @author rakshit
 */

//Lib import
import java.sql.*;
// Packages import
import qwa.database.Admin;
import qwa.database.Provider;

public class Admin_db {
    public static boolean doValidate(Admin ad) {
         
        boolean status = false;
        try
        {
            Connection con = Provider.getConnection();
            String sql = "select * from admintable where userid=? and password=?"; // SQL Query
	    PreparedStatement pst = con.prepareStatement(sql);
	    pst.setString(1, ad.getUsername());
	    pst.setString(2, ad.getPassword());
	    ResultSet rs = pst.executeQuery();
	    if(rs.next())
            {
                status = true;
	    }
	    else
            {
                status = false;
            }
        }catch(Exception e){System.out.println(e);}
	return status;
    }
}
