/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KOPERASI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
class tampilTabelModel {
     public Vector tampilpengguna(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi", "root", "");
            String query = "SELECT * FROM datapengguna ORDER BY idpengguna";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("idpengguna"));
                kolom.add(rs.getString("namapengguna"));
                kolom.add(rs.getString("alamat"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
       public Vector tampilanggota(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi", "root", "");
            String query = "SELECT * FROM dataanggota ORDER BY idanggota";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("idanggota"));
                kolom.add(rs.getString("namaanggota"));
                kolom.add(rs.getString("ttl"));
                kolom.add(rs.getString("alamat"));
                kolom.add(rs.getString("jeniskelamin"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
          public Vector tampilpinjaman(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi", "root", "");
            String query = "SELECT * FROM datapinjaman ORDER BY noanggota";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("noanggota"));
                kolom.add(rs.getString("namaanggota"));
                kolom.add(rs.getString("kodepinjam"));
                kolom.add(rs.getString("tanggalpinjam"));
                kolom.add(rs.getString("jumlahpinjam"));
                kolom.add(rs.getString("lamapinjam"));
                kolom.add(rs.getString("bunga"));
                kolom.add(rs.getString("angsuran"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
          public Vector tampilsimpan(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi", "root", "");
            String query = "SELECT * FROM datasimpanan ORDER BY noanggota";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("noanggota"));
                kolom.add(rs.getString("namaanggota"));
                kolom.add(rs.getString("tanggalsimpan"));
                kolom.add(rs.getString("simpananpokok"));
                kolom.add(rs.getString("simpananwajib"));
                kolom.add(rs.getString("simpanansukarela"));
                kolom.add(rs.getString("Total"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
          
            public Vector tampilangsuran(){
        Vector baris = new Vector();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/koperasi", "root", "");
            String query = "SELECT * FROM dataangsuran ORDER BY noanggota";
            PreparedStatement prestat = koneksi.prepareStatement(query);
            ResultSet rs = prestat.executeQuery();
            while(rs.next()){
                Vector kolom = new Vector();
                kolom.add(rs.getString("noanggota"));
                kolom.add(rs.getString("namaanggota"));
                kolom.add(rs.getString("tanggalpinjam"));
                kolom.add(rs.getString("tanggalangsur"));
                kolom.add(rs.getString("lamapinjam"));
                kolom.add(rs.getString("totalpinjam"));
                kolom.add(rs.getString("totalbayar"));
                kolom.add(rs.getString("angsuran"));
                kolom.add(rs.getString("sisa"));
                baris.add(kolom);
            }
            koneksi.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return baris;
    }
}
