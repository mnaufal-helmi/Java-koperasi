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
public class frmPinjaman extends javax.swing.JFrame {
 inputModelTabel imt = new inputModelTabel();
    deleteModelTabel dmt = new deleteModelTabel();
    updateModelTabel umt = new updateModelTabel();
    tampilTabelModel ttm = new tampilTabelModel();
    /**
     * Creates new form frmPinjaman
     */
    public frmPinjaman() {
        initComponents();
        clearData();
        tampilpengguna();
    }
    final void clearData(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
       jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }
      final void tampilpengguna(){
        Vector judulTabel = new Vector();
        judulTabel.add("noanggota");
        judulTabel.add("namaanggota");      
        judulTabel.add("kodepinjam");
        judulTabel.add("tanggalpinjam");
        judulTabel.add("jumlahpinjam");
        judulTabel.add("lamaangsuran");
        judulTabel.add("bunga");
        judulTabel.add("angsuran");
        Vector isiTabel = ttm.tampilpinjaman();
        tabelpinjam.setModel(new DefaultTableModel(isiTabel, judulTabel));
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpinjam = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, 200, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnAnggota.png"))); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnSimpanan.png"))); // NOI18N
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 363, 190, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/btnPinjaman.png"))); // NOI18N
        jButton4.setText("jButton4");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 200, 50));

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
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 80));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 26)); // NOI18N
        jLabel2.setText("Data Pinjaman");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 240, 50));

        jLabel3.setText("No Anggota");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel4.setText("Nama Anggota");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel5.setText("Kode Pinjam");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel6.setText("tgl pinjam");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 200, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 200, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 200, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 200, -1));

        jLabel7.setText("jumlah pinjam");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 100, 20));

        jLabel8.setText("lama pinjam");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 80, 20));

        jLabel9.setText("bunga (%)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 80, -1));

        jLabel10.setText("Angsuran");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 80, 20));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 190, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 40, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 130, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 190, -1));

        tabelpinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NoAnggota", "NamaAnggota", "KodePinjam ", "TglPinjam", "JumlahPinjam", "LamaPinjam", "Bunga", "Angsuran"
            }
        ));
        tabelpinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpinjamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpinjam);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 1060, 90));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_new.png"))); // NOI18N
        jButton7.setText("Simpan");
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_edit.png"))); // NOI18N
        jButton8.setText("edit");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        jButton11.setText("Cetak");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/doc_delete.png"))); // NOI18N
        jButton9.setText("hapus");
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jTextField9.setEditable(false);
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("15 %");
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 40, -1));

        jButton10.setText("Hitung");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Pilih >", "Hari", "Bulan", "Tahun" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/form1/images/koperasi1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new formPengguna().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new frmSimpanan().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new frmAnggota().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new frmAngsuran().setVisible(true);this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new formlogin().setVisible(true); this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void tabelpinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpinjamMouseClicked
    int baris = tabelpinjam.rowAtPoint(evt.getPoint());
        String noanggota=tabelpinjam.getValueAt(baris, 0).toString();
        jTextField1.setText(noanggota);
        String namaanggota=tabelpinjam.getValueAt(baris, 1).toString();
        jTextField2.setText(namaanggota);
        String kodepinjam=tabelpinjam.getValueAt(baris, 2).toString();
        jTextField3.setText(kodepinjam);
        String tanggalpinjam=tabelpinjam.getValueAt(baris, 3).toString();
        jTextField4.setText(tanggalpinjam); 
        String jumlahpinjam=tabelpinjam.getValueAt(baris, 4).toString();
        jTextField5.setText(jumlahpinjam); 
        String lamaangsuran=tabelpinjam.getValueAt(baris, 5).toString();
        jTextField6.setText(lamaangsuran);
        String bunga=tabelpinjam.getValueAt(baris, 6).toString();
        jTextField7.setText(bunga);
        String angsuran=tabelpinjam.getValueAt(baris, 7).toString();
        jTextField8.setText(angsuran); // TODO add your handling code here:
    }//GEN-LAST:event_tabelpinjamMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DISIMPAN?", "INFORMASI", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION) {
            imt.inputpinjaman(jTextField1.getText(),
                    jTextField2.getText(),
                    jTextField3.getText(),
                    jTextField4.getText(),
                    jTextField5.getText(),
                    jTextField6.getText(),
                    jTextField7.getText(),
                 jTextField8.getText());
            JOptionPane.showMessageDialog(null, "DATA TELAH DISIMPAN", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        }
        clearData();
        tampilpengguna();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DIUBAH?","INFORMASI",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION){
            umt.updatepinjaman(jTextField1.getText(),
                    jTextField2.getText(),
                    jTextField3.getText(),
                    jTextField4.getText(),
                    jTextField5.getText(),
                    jTextField6.getText(),
                    jTextField7.getText(),
                 jTextField8.getText());
            JOptionPane.showMessageDialog(null, "DATA TELAH DIUBAH", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

        }
        clearData();
        tampilpengguna();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     int tanya = JOptionPane.showConfirmDialog(null, "ANDA YAKIN DATA INI INGIN DIHAPUS?","INFORMASI",JOptionPane.CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (tanya == JOptionPane.OK_OPTION){
            dmt.hapuspinjaman(jTextField1.getText());
            JOptionPane.showMessageDialog(null, "DATA TELAH DIHAPUS", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

        }
        clearData();
        tampilpengguna();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        float bil1, bil2,bil3, hasil1;
    double diskon;
bil1= Float.parseFloat(jTextField5.getText());
bil2= Float.parseFloat(jTextField6.getText());

hasil1 =bil1*bil2;
diskon=hasil1*0.05;
double hasil=hasil1-diskon;

//// TODO add your handling code here:
jTextField7.setText(String.valueOf(diskon)); 
jTextField8.setText(String.valueOf(hasil));
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new cetak_pinjaman().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPinjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPinjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabelpinjam;
    // End of variables declaration//GEN-END:variables
}
