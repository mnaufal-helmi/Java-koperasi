/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KOPERASI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */

public class koneksiDB {
    Connection con;
    Statement stm;
    public void config(){
        try{
            String url = "jdbc:mysql://localhost:3306/koperasi";
            String user = "root";
            String password = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/koperasi","root","");
            stm=con.createStatement ();
            System.out.println("koneksi Berhasil");
        }
        catch(Exception t){
            JOptionPane.showMessageDialog(null,"error membuat koneksi !!!!" + t.getMessage());
        }
    }
}

    

