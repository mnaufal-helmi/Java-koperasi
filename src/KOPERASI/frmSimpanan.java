/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package KOPERASI;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class frmSimpanan extends javax.swing.JFrame {
inputModelTabel imt = new inputModelTabel();
    deleteModelTabel dmt = new deleteModelTabel();
    updateModelTabel umt = new updateModelTabel();
    tampilTabelModel ttm = new tampilTabelModel();
    /**
     * Creates new form frmSimpanan
     */
    public frmSimpanan() {
        initComponents();
        clearData();
        tampilpengguna();
    }
 final void clearData(){
        txtnoanggota.setText("");
        txtnamaanggota.setText("");
        txttanggalsimpan.setText("");
        txtsimppokok.setText("");
        txtsimpwajib.setText("");
        txtsimpsukarela.setText("");
        txttotal.setText("");
    }
      final void tampilpengguna(){
        Vector judulTabel = new Vector();
        judulTabel.add("idanggota");
        judulTabel.add("namaanggota");      
        judulTabel.add("tanggalsimpan");
        judulTabel.add("simpanpokok");
        judulTabel.add("simpanwajib");
        judulTabel.add("simpansukarela");
        judulTabel.add("total");
        Vector isiTabel = ttm.tampilsimpan();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnamaanggota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttanggalsimpan = new javax.swing.JTextField();
        txtsimppokok = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsimpwajib = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsimpsukarela = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtnoanggota = new javax.swing.JTextField();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 200, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnAnggota.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnPinjaman.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 200, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnSimpanan.png"))); // NOI18N
        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 200, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnAngsuran.png"))); // NOI18N
        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 200, 40));

        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 200, 40));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 26)); // NOI18N
        jLabel2.setText("Data Simpanan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 250, 50));

        jLabel3.setText("No Anggota");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 70, -1));

        jLabel4.setText("Nama Anggota");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 100, -1));
        getContentPane().add(txtnamaanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 130, -1));

        jLabel5.setText("tanggal simpan");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));
        getContentPane().add(txttanggalsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 150, -1));
        getContentPane().add(txtsimppokok, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 210, -1));

        jLabel6.setText("simp. wajib");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));
        getContentPane().add(txtsimpwajib, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 210, -1));

        jLabel7.setText("simp Pokok");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        jLabel8.setText("simp. sukarela");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));
        getContentPane().add(txtsimpsukarela, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 210, -1));

        jLabel9.setText("Total");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, -1, -1));
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 210, -1));

        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_new.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setContentAreaFilled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 120, 50));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setContentAreaFilled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 90, 50));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NoAnggota", "NoTrans", "TglTrans", "Wajib", "Sukarela"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 1050, 100));

        jButton8.setText("Cetak");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, -1, -1));

        jButton7.setText("Hitung");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, -1, -1));

        txtnoanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoanggotaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnoanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/koperasi1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new formPengguna().SetVisible(true);this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new frmAnggota().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         new frmPinjaman().setVisible(true);this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new frmAngsuran().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new formlogin().setVisible(true); this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DIUBAH?","INFORMASI",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION){
            umt.updatesimpanan(txtnoanggota.getText(),
                txtnamaanggota.getText(),
                txttanggalsimpan.getText(),txtsimppokok.getText(),
                txtsimpwajib.getText(),txtsimpsukarela.getText(),txttotal.getText());
            JOptionPane.showMessageDialog(null, "DATA TELAH DIUBAH", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

        }
        clearData();
        tampilpengguna();        // TODO add your handling code here:
   
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DIHAPUS?","INFORMASI",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION){
            dmt.hapussimpanan(txtnoanggota.getText());
            JOptionPane.showMessageDialog(null, "DATA TELAH DIHAPUS", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

        }
        clearData();
        tampilpengguna();        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DISIMPAN?", "INFORMASI", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION) {
            imt.inputsimpanan(txtnoanggota.getText(),
                txtnamaanggota.getText(),
                txttanggalsimpan.getText(),txtsimppokok.getText(),
                 txtsimpwajib.getText(),txtsimpsukarela.getText(),txttotal.getText());
            JOptionPane.showMessageDialog(null, "DATA TELAH DISIMPAN", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }
        clearData();
        tampilpengguna();         //      
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtnoanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoanggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoanggotaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int baris = jTable1.rowAtPoint(evt.getPoint());
    String noanggota=jTable1.getValueAt(baris, 0).toString();
    txtnoanggota.setText(noanggota);
    String namaanggota=jTable1.getValueAt(baris, 1).toString();
    txtnamaanggota.setText(namaanggota);
    String tanggalsimpan=jTable1.getValueAt(baris, 2).toString();
    txttanggalsimpan.setText(tanggalsimpan);
    String simppokok=jTable1.getValueAt(baris, 3).toString();
    txtsimppokok.setText(simppokok);
    String simpwajib=jTable1.getValueAt(baris, 4).toString();
    txtsimpwajib.setText(simpwajib); 
    String simpsukarela=jTable1.getValueAt(baris, 5).toString();
    txtsimpsukarela.setText(simpsukarela); 
    String total=jTable1.getValueAt(baris, 6).toString();
    txttotal.setText(total); 
    // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    float bil1, bil2,bil3, hasil1;
bil1= Float.parseFloat(txtsimppokok.getText());
bil2= Float.parseFloat(txtsimpwajib.getText());
bil3= Float.parseFloat(txtsimpsukarela.getText());

hasil1 =bil1+bil2+bil3;


//// TODO add your handling code here:
 
txttotal.setText(String.valueOf(hasil1));        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new cetak_simpanan().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(frmSimpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSimpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSimpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSimpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSimpanan().setVisible(true);
            }
        });

   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtnamaanggota;
    private javax.swing.JTextField txtnoanggota;
    private javax.swing.JTextField txtsimppokok;
    private javax.swing.JTextField txtsimpsukarela;
    private javax.swing.JTextField txtsimpwajib;
    private javax.swing.JTextField txttanggalsimpan;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}