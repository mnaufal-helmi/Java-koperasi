/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KOPERASI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
class deleteModelTabel {
    public void hapusdatapengguna(String idpengguna){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "DELETE FROM datapengguna WHERE idpengguna=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, idpengguna);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
     public void hapusanggota(String idanggota){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "DELETE FROM dataanggota WHERE idanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, idanggota);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
      public void hapuspinjaman(String noanggota){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "DELETE FROM datapinjaman WHERE noanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, noanggota);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
      }
         public void hapussimpanan(String noanggota){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "DELETE FROM datasimpanan WHERE noanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, noanggota);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
         }
         public void hapusangsuran(String noanggota){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "DELETE FROM dataangsuran WHERE noanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, noanggota);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
}
