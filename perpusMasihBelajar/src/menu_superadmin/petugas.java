/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu_superadmin;

import handler_class.AccesSuperAdmin;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luthf
 */
public class Petugas extends javax.swing.JFrame implements AccesSuperAdmin{

    /**
     * Creates new form LogIn
     */
    public Petugas() {
        initComponents();
        loadTable();
    }
    
    
    private void kosong(){
        id_petugas.setText("ID Petugas");
        id_petugas.setForeground(new Color(153, 153, 153));
        nama_petugas.setText("Nama Petugas");
        nama_petugas.setForeground(new Color(153, 153, 153));
        username.setText("Username");
        username.setForeground(new Color(153, 153, 153));
        password.setText("Password");
        password.setForeground(new Color(153, 153, 153));
        level.setSelectedItem("level");
        level.setForeground(new Color(153, 153, 153));
        loadTable();
    }
    
    protected void loadTable() {
        Object[]baris={"ID Petugas","Nama Petugas","Username","Password","Level"};
        DefaultTableModel tablek = new DefaultTableModel(null, baris);
        tabledor.setModel(tablek);
        
        try{
            Statement state= handler_class.Koneksi.konek().createStatement();
            String sql = "select * from petugas ";
            ResultSet cari = state.executeQuery(sql);
            
            while (cari.next()){
            String a = cari.getString(1);
            String b = cari.getString(2);
            String c = cari.getString(3);
            String d = cari.getString(4);
            String e = cari.getString(5);
            Object[]data={a,b,c,d,e};
            tablek.addRow(data);
        }
    }catch (Exception e){
    }
    }
    
    @Override
    public void manageBuku() {
        new Buku().show();
    }
    @Override
    public void manageAnggota() {
        new Siswa().show();
    }
    @Override
    public void manageAdmin() {
        new Petugas().show();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_petugas = new javax.swing.JTextField();
        nama_petugas = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledor = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        level = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Data Petugas");

        id_petugas.setBackground(new java.awt.Color(208, 239, 239));
        id_petugas.setForeground(new java.awt.Color(153, 153, 153));
        id_petugas.setText("ID Petugas");
        id_petugas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_petugasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_petugasFocusLost(evt);
            }
        });
        id_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_petugasActionPerformed(evt);
            }
        });

        nama_petugas.setBackground(new java.awt.Color(208, 239, 239));
        nama_petugas.setForeground(new java.awt.Color(153, 153, 153));
        nama_petugas.setText("Nama Petugas");
        nama_petugas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nama_petugasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nama_petugasFocusLost(evt);
            }
        });
        nama_petugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_petugasActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(208, 239, 239));
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Username");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(208, 239, 239));
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("Password");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        tabledor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Petugas", "Nama Petugas", "Username", "Password", "Level"
            }
        ));
        tabledor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabledor);

        btnSimpan.setBackground(new java.awt.Color(0, 0, 0));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(0, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Bersihkan Form");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeluar.setBackground(new java.awt.Color(0, 0, 0));
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "level", "admin", "superadmin" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(id_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(nama_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeluar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_petugas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
                    .addComponent(btnEdit)
                    .addComponent(btnReset)
                    .addComponent(btnKeluar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void nama_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_petugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_petugasActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void id_petugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_petugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_petugasActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try{
            Statement state = handler_class.Koneksi.konek().createStatement();
            String sql = "INSERT INTO petugas VALUES ('"+id_petugas.getText()+"','"+nama_petugas.getText()+"','"+username.getText()+"','"+password.getText()+"','"+level.getSelectedItem().toString()+"')";
            state.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }catch (HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Data Tidak Tersimpan");
        }
        loadTable();
        kosong();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btnResetActionPerformed

    private void id_petugasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_petugasFocusGained
        // TODO add your handling code here:
        if ("ID Petugas".equals(id_petugas.getText())) {
            id_petugas.setText("");
            id_petugas.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_id_petugasFocusGained

    private void id_petugasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_petugasFocusLost
        // TODO add your handling code here:
        if ("".equals(id_petugas.getText())) {

            id_petugas.setText("ID Petugas");
            id_petugas.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_id_petugasFocusLost

    private void nama_petugasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nama_petugasFocusGained
        // TODO add your handling code here:
        if ("Nama Petugas".equals(nama_petugas.getText())) {
            nama_petugas.setText("");
            nama_petugas.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_nama_petugasFocusGained

    private void nama_petugasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nama_petugasFocusLost
        // TODO add your handling code here:
        if ("".equals(nama_petugas.getText())) {

            nama_petugas.setText("Nama Petugas");
            nama_petugas.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_nama_petugasFocusLost

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        if ("Username".equals(username.getText())) {
            username.setText("");
            username.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        if ("".equals(username.getText())) {

            username.setText("Username");
            username.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        if ("Password".equals(password.getText())) {
            password.setText("");
            password.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
        if ("".equals(password.getText())) {

            password.setText("Password");
            password.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_passwordFocusLost

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try{
            Statement state = handler_class.Koneksi.konek().createStatement();
            String sql = "delete from petugas where id_petugas= '"+id_petugas.getText()+"'";
            state.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Dihapus");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Tidak Dihapus");
        }
        loadTable();
        kosong();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try{
            Statement state = handler_class.Koneksi.konek().createStatement();
            String sql = "update petugas set nama_petugas='"+nama_petugas.getText()+"',username='"+username.getText()+"',password='"+password.getText()+"',level='"+level.getSelectedItem()+"' where id_petugas='"+id_petugas.getText()+"'";
            state.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Di Edit");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Tidak Di Edit");
        }
        loadTable();
        kosong();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        new MenuUtamaSuperAdmin().show();
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void tabledorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledorMouseClicked
        // TODO add your handling code here:
        int baris = tabledor.rowAtPoint(evt.getPoint());
        String id_pet = tabledor.getValueAt(baris, 0).toString();
        id_petugas.setText(id_pet);
        id_petugas.setForeground(new Color(0, 0, 0));
        String b = tabledor.getValueAt(baris, 1).toString();
        nama_petugas.setText(b);
        nama_petugas.setForeground(new Color(0, 0, 0));
        String c = tabledor.getValueAt(baris, 2).toString();
        username.setText(c);
        username.setForeground(new Color(0, 0, 0));
        String d = tabledor.getValueAt(baris, 3).toString();
        password.setText(d);
        password.setForeground(new Color(0, 0, 0));
        String e = tabledor.getValueAt(baris, 4).toString();
        level.setSelectedItem(e);
        level.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_tabledorMouseClicked

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
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JTextField id_petugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> level;
    private javax.swing.JTextField nama_petugas;
    private javax.swing.JTextField password;
    private javax.swing.JTable tabledor;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    @Override
    public void peminjaman() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void pengembalian() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void laporan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}