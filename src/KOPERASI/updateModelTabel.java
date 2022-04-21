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
class updateModelTabel {
    public void updatepengguna(String idpengguna, String namapengguna, String alamat){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "UPDATE datapengguna SET namapengguna=?,alamat=? where idpengguna=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            
            prestat.setString(1, namapengguna);
            prestat.setString(2, alamat);
            prestat.setString(3, idpengguna);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
     public void updateanggota(String idanggota, String namaanggota, String ttl, String alamat, String jeniskelamin){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "UPDATE dataanggota SET namaanggota=?,ttl=?,alamat=?,jeniskelamin=? WHERE idanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            
            prestat.setString(1, namaanggota);
            prestat.setString(2, ttl);
            prestat.setString(3, alamat);
            prestat.setString(4, jeniskelamin);
            prestat.setString(5, idanggota);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }
      public void updatepinjaman(String noanggota, String namaanggota, String kodepinjam, String tanggalpinjam, String jumlahpinjam, String lamaangsuran, String Bunga, String Angsuran){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "UPDATE datapinjaman SET namaanggota=?,kodepinjam=?,tanggalpinjam=?,jumlahpinjam=?,lamapinjam=?,bunga=?,angsuran=? where noanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            
            prestat.setString(1, namaanggota);
            prestat.setString(2, kodepinjam);
            prestat.setString(3, tanggalpinjam);
            prestat.setString(4, jumlahpinjam);
            prestat.setString(5, lamaangsuran);
            prestat.setString(6, Bunga);
            prestat.setString(7, Angsuran);
            prestat.setString(8, noanggota);
            
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
}
      public void updatesimpanan(String noanggota, String namaanggota, String tanggalsimpan, String simpananpokok, String simpananwajib, String simpanansukarela, String total){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "UPDATE datasimpanan SET namaanggota=?,tanggalsimpan=?,simpananpokok=?,simpananwajib=?,simpanansukarela=?,total=? where noanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            
            prestat.setString(1, namaanggota);
            prestat.setString(2, tanggalsimpan);
            prestat.setString(3, simpananpokok);
            prestat.setString(4, simpananwajib);
            prestat.setString(5, simpanansukarela);
            prestat.setString(6, total);
            prestat.setString(7, noanggota);
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
}
      public void updateangsuran(String noanggota, String namaanggota, String tanggalpinjam, String lamapinjam, String angsuran, String tanggalangsur, String totalpinjam, String totalbayar, String sisa){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi","root","");
            String query = "UPDATE dataangsuran SET namaanggota=?,tanggalpinjam=?,lamapinjam=?,angsuran=?,tanggalangsur=?,totalpinjam=?,totalbayar=?,sisa=? where noanggota=?";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            
            prestat.setString(1, namaanggota);
            prestat.setString(2, tanggalpinjam);
            prestat.setString(3, lamapinjam);
            prestat.setString(4, angsuran);
            prestat.setString(5, tanggalangsur);
            prestat.setString(6, totalpinjam);
            prestat.setString(7, totalbayar);
            prestat.setString(8, sisa);
            prestat.setString(9, noanggota);
            
            prestat.executeUpdate();
            koneksi.close();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "QUERRY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        } 
}
}