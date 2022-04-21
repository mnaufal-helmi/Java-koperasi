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
public class inputModelTabel {
    public void inputnamapengguna(String idnamapengguna, String namapengguna, String alamat){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "INSERT INTO datapengguna VALUES (?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, idnamapengguna);
            prestat.setString(2, namapengguna);
            prestat.setString(3, alamat);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
}
    
      public void inputanggota(String idanggota, String namaanggota, String ttl, String alamat, String jeniskelamin){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "INSERT INTO dataanggota VALUES (?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, idanggota);
            prestat.setString(2, namaanggota);
            prestat.setString(3, ttl);
            prestat.setString(4, alamat);
            prestat.setString(5, jeniskelamin);
            
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
}
         public void inputpinjaman(String noanggota, String namaanggota, String kodepinjam, String tanggalpinjam, String jumlahpinjam, String lamaangsuran, String Bunga, String Angsuran){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "INSERT INTO datapinjaman VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, noanggota);
            prestat.setString(2, namaanggota);
            prestat.setString(3, kodepinjam);
            prestat.setString(4, tanggalpinjam);
            prestat.setString(5, jumlahpinjam);
            prestat.setString(6, lamaangsuran);
            prestat.setString(7, Bunga);
            prestat.setString(8, Angsuran);
            
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
     }   
         public void inputsimpanan(String noanggota, String namaanggota, String tanggalsimpan, String simpananpokok, String simpananwajib, String simpanansukarela, String total){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "INSERT INTO datasimpanan VALUES (?,?,?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, noanggota);
            prestat.setString(2, namaanggota);
            prestat.setString(3, tanggalsimpan);
            prestat.setString(4, simpananpokok);
            prestat.setString(5, simpananwajib);
            prestat.setString(6, simpanansukarela);
            prestat.setString(7, total);
         
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
}
        public void inputangsuran(String noanggota, String namaanggota, String tanggalpinjam, String tanggalangsur, String lamapinjam, String totalpinjam,String angsuran, String totalbayar, String sisa){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "INSERT INTO dataangsuran VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            prestat.setString(1, noanggota);
            prestat.setString(2, namaanggota);
            prestat.setString(3, tanggalpinjam);
            prestat.setString(4, tanggalangsur);
            prestat.setString(5, lamapinjam);
            prestat.setString(6, totalpinjam);
            prestat.setString(7, angsuran);
            prestat.setString(8, totalbayar);
            prestat.setString(9, sisa);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
}
}
