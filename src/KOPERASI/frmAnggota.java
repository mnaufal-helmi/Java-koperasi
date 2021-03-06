/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KOPERASI;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class frmAnggota extends javax.swing.JFrame {
 inputModelTabel imt = new inputModelTabel();
    deleteModelTabel dmt = new deleteModelTabel();
    updateModelTabel umt = new updateModelTabel();
    tampilTabelModel ttm = new tampilTabelModel();
    /**
     * Creates new form frmAnggota
     */
    public frmAnggota() {
        initComponents();
        clearData();
        tampilpengguna();
    }
    final void clearData(){
        txtidanggota.setText("");
        txtnamaanggota.setText("");
        txtalamat.setText("");
        txtttl.setText("");
        txtJeniskelamin.setSelectedItem("");
    }
      final void tampilpengguna(){
        Vector judulTabel = new Vector();
        judulTabel.add("idanggota");
        judulTabel.add("namaanggota");      
        judulTabel.add("ttl");
        judulTabel.add("alamat");
        judulTabel.add("jeniskelamin");
        Vector isiTabel = ttm.tampilanggota();
        jTable1.setModel(new DefaultTableModel(isiTabel, judulTabel));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtidanggota = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJeniskelamin = new javax.swing.JComboBox<String>();
        txtttl = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnamaanggota = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnPengguna.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnAnggota.png"))); // NOI18N
        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnPinjaman.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 200, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnSimpanan.png"))); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnAngsuran.png"))); // NOI18N
        jButton5.setText("jButton5");
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 200, 40));

        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 170, 30));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 26)); // NOI18N
        jLabel2.setText("Data Anggota");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 180, 40));

        txtidanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidanggotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtidanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 230, -1));

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 230, -1));

        jLabel3.setText("ID Anggota              :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 240, 140, -1));

        jLabel4.setText("Nama Anggota          : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 140, -1));

        jLabel5.setText("Alamat                     :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 140, 20));

        jLabel6.setText("Tempat Tanggal lahir :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 150, -1));

        txtJeniskelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jenis Kelamin", "laki laki", "perempuan" }));
        txtJeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJeniskelaminActionPerformed(evt);
            }
        });
        getContentPane().add(txtJeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 230, 20));
        getContentPane().add(txtttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 230, -1));

        jLabel7.setText("Jenis Kelamin            :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 140, -1));

        txtnamaanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaanggotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnamaanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 230, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_new.png"))); // NOI18N
        jButton10.setText("simpan");
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_edit.png"))); // NOI18N
        btnedit.setText("Edit");
        btnedit.setContentAreaFilled(false);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 100, 40));

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_delete.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.setContentAreaFilled(false);
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 110, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id anggota", "nama anggota", "TTL", "alamat", "Jenis Kelamin"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 1030, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/koperasi1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new formPengguna().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new frmPinjaman().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new frmSimpanan().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new frmAngsuran().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new formlogin().setVisible(true); this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtidanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidanggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidanggotaActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void txtJeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJeniskelaminActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtJeniskelaminActionPerformed

    private void txtnamaanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaanggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaanggotaActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DISIMPAN?", "INFORMASI", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION) {
            imt.inputanggota(txtidanggota.getText(),
                txtnamaanggota.getText(),
                txtttl.getText(),txtalamat.getText(),
                (String) txtJeniskelamin.getSelectedItem());
            JOptionPane.showMessageDialog(null, "DATA TELAH DISIMPAN", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }
        clearData();
        tampilpengguna();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DIUBAH?","INFORMASI",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION){
            umt.updateanggota(txtidanggota.getText(),
                txtnamaanggota.getText(),
                txtttl.getText(),txtalamat.getText(),
                (String) txtJeniskelamin.getSelectedItem());
            JOptionPane.showMessageDialog(null, "DATA TELAH DIUBAH", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

        }
        clearData();
        tampilpengguna();// TODO add your handling code here:
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DIHAPUS?","INFORMASI",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION){
            dmt.hapusanggota(txtidanggota.getText());
            JOptionPane.showMessageDialog(null, "DATA TELAH DIHAPUS", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

        }
        clearData();
        tampilpengguna();// TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
             int baris = jTable1.rowAtPoint(evt.getPoint());
    String idanggota=jTable1.getValueAt(baris, 0).toString();
    txtidanggota.setText(idanggota);
    String namaanggota=jTable1.getValueAt(baris, 1).toString();
    txtnamaanggota.setText(namaanggota);
    String ttl=jTable1.getValueAt(baris, 2).toString();
    txtttl.setText(ttl);
    String alamat=jTable1.getValueAt(baris, 3).toString();
    txtalamat.setText(alamat);
    String Jeniskelamin=jTable1.getValueAt(baris, 4).toString();
    txtJeniskelamin.setSelectedItem(Jeniskelamin);
    
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> txtJeniskelamin;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtidanggota;
    private javax.swing.JTextField txtnamaanggota;
    private javax.swing.JTextField txtttl;
    // End of variables declaration//GEN-END:variables
}
