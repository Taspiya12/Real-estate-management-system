
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Family
 */
public class us_booking extends javax.swing.JFrame {

    /**
     * Creates new form us_booking
     */
    public us_booking() {
        initComponents();
        getautoId();
        getLandPropertyName();
        txt_user.setText(String.valueOf(login_pg.username));
    }
    Statement st;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_price = new javax.swing.JTextField();
        propertytypecb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        namecb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_id = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_book = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txt_owner = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paymentcb = new javax.swing.JComboBox<>();
        txt_user = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_price.setEditable(false);
        txt_price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 200, 30));

        propertytypecb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        propertytypecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Land", "Commercial", "Residential", "Industrial" }));
        propertytypecb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                propertytypecbItemStateChanged(evt);
            }
        });
        propertytypecb.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                propertytypecbPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        propertytypecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertytypecbActionPerformed(evt);
            }
        });
        getContentPane().add(propertytypecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 200, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Book Your Property");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        namecb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        namecb.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                namecbPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(namecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Property type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 100, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Date");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 80, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Booking ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText(" Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 60, 30));

        txt_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 200, 30));

        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 100, 40));

        btn_book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_book.setText("Book");
        btn_book.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookActionPerformed(evt);
            }
        });
        getContentPane().add(btn_book, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 100, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Phone");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 80, -1));

        txt_phone.setEditable(false);
        txt_phone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 190, 40));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 200, 30));

        txt_owner.setEditable(false);
        txt_owner.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_owner, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 190, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Owner");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 80, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Payment");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 90, 30));

        paymentcb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Online", "Cash" }));
        getContentPane().add(paymentcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 190, 30));

        txt_user.setEditable(false);
        txt_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("User");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 80, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booking property background.png"))); // NOI18N
        jLabel16.setText("cash");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getLandPropertyName() {
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("select * from land");
            namecb.removeAllItems();
            while (rs.next()) {
                String name = rs.getString("l_name");

                namecb.addItem(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getCommercialPropertyName() {
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("select * from commercial");
            namecb.removeAllItems();
            while (rs.next()) {
                String name = rs.getString("c_name");

                namecb.addItem(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getResidentialPropertyName() {
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("select * from residential");
            namecb.removeAllItems();
            while (rs.next()) {
                String name = rs.getString("r_name");

                namecb.addItem(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getIndustrialPropertyName() {
        try {
            st = THE_CONNECTION.getTheConnection().createStatement();
            rs = st.executeQuery("select * from industrial");
            namecb.removeAllItems();
            while (rs.next()) {
                String name = rs.getString("i_name");
                namecb.addItem(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void getautoId() {
        // Auto booking id
        try {
            pst = THE_CONNECTION.getTheConnection().prepareStatement("select max(b_id) from booking",
                    rs.TYPE_SCROLL_SENSITIVE,
                    rs.CONCUR_UPDATABLE);
            rs = pst.executeQuery();
            if (rs.first()) {
                int id = rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                txt_id.setText(str);
            } else {
                txt_id.setText("1");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void propertytypecbPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_propertytypecbPopupMenuWillBecomeInvisible

    }//GEN-LAST:event_propertytypecbPopupMenuWillBecomeInvisible

    private void namecbPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_namecbPopupMenuWillBecomeInvisible
        String x = propertytypecb.getSelectedItem().toString();
        if ("Land".equals(x)) {
            String y = namecb.getSelectedItem().toString();
            String sqlland = "select * from land where l_name=?";
            try {
                pst = THE_CONNECTION.getTheConnection().prepareStatement(sqlland);
                pst.setString(1, y);
                rs = pst.executeQuery();
                if (rs.next()) {
                    txt_price.setText(rs.getString("l_price"));
                    txt_owner.setText(rs.getString("l_owner"));
                    txt_phone.setText(rs.getString("l_phone"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if ("Commercial".equals(x)) {
            String y = namecb.getSelectedItem().toString();
            String sqlland = "select * from commercial where c_name=?";
            try {
                pst = THE_CONNECTION.getTheConnection().prepareStatement(sqlland);
                pst.setString(1, y);
                rs = pst.executeQuery();
                if (rs.next()) {
                    txt_price.setText(rs.getString("c_price"));
                    txt_owner.setText(rs.getString("c_owner"));
                    txt_phone.setText(rs.getString("c_phone"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if ("Industrial".equals(x)) {
            String y = namecb.getSelectedItem().toString();
            String sqlland = "select * from industrial where i_name=?";
            try {
                pst = THE_CONNECTION.getTheConnection().prepareStatement(sqlland);
                pst.setString(1, y);
                rs = pst.executeQuery();
                if (rs.next()) {
                    txt_price.setText(rs.getString("i_price"));
                    txt_owner.setText(rs.getString("i_owner"));
                    txt_phone.setText(rs.getString("i_phone"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if ("Residential".equals(x)) {
            String y = namecb.getSelectedItem().toString();
            String sqlland = "select * from residential where r_name=?";
            try {
                pst = THE_CONNECTION.getTheConnection().prepareStatement(sqlland);
                pst.setString(1, y);
                rs = pst.executeQuery();
                if (rs.next()) {
                    txt_price.setText(rs.getString("r_price"));
                    txt_owner.setText(rs.getString("r_owner"));
                    txt_phone.setText(rs.getString("r_phone"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_namecbPopupMenuWillBecomeInvisible

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // clear button
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void clear() {
        txt_id.setText("");
        txt_user.setText("");
        namecb.setSelectedIndex(0);
        propertytypecb.setSelectedIndex(0);
        txt_phone.setText("");
        txt_owner.setText("");
        txt_price.setText("");
        paymentcb.setSelectedIndex(0);
        jDateChooser1.setDate(null);
    }

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        us_propertytype s = new us_propertytype();
        this.hide();
        s.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookActionPerformed
        //book button
        if (jDateChooser1.equals(null) || txt_price.getText().isEmpty() || txt_owner.getText().isEmpty() || txt_phone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Information Missing");
        } else {
            try {
                pst = THE_CONNECTION.getTheConnection().prepareStatement("insert into booking values(?,?,?,?,?,?,?,?,?)");
                pst.setInt(1, Integer.valueOf(txt_id.getText()));
                pst.setString(2, txt_user.getText());
                pst.setString(3, propertytypecb.getSelectedItem().toString());
                pst.setString(4, namecb.getSelectedItem().toString());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(jDateChooser1.getDate());
                pst.setString(5, date);
                pst.setString(6, txt_price.getText());
                pst.setString(7, txt_owner.getText());
                pst.setString(8, txt_phone.getText());
                pst.setString(9, paymentcb.getSelectedItem().toString());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Successfully booked");
                us_propertytype up = new us_propertytype();
                this.hide();
                up.setVisible(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_bookActionPerformed

    private void propertytypecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertytypecbActionPerformed

    }//GEN-LAST:event_propertytypecbActionPerformed

    private void propertytypecbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_propertytypecbItemStateChanged
        Object obj = evt.getSource();
        if (obj == propertytypecb) {
            String x = propertytypecb.getSelectedItem().toString();
            if (null != x) {
                switch (x) {
                    case "Land":
                        getLandPropertyName();
                        break;
                    case "Commercial":
                        getCommercialPropertyName();
                        txt_price.setText("");
                        txt_owner.setText("");
                        txt_phone.setText("");
                        break;
                    case "Residential":
                        getResidentialPropertyName();
                        txt_price.setText("");
                        txt_owner.setText("");
                        txt_phone.setText("");
                        break;
                    case "Industrial":
                        getIndustrialPropertyName();
                        txt_price.setText("");
                        txt_owner.setText("");
                        txt_phone.setText("");
                        break;
                    default:
                        break;
                }
            }
        }
    }//GEN-LAST:event_propertytypecbItemStateChanged

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
            java.util.logging.Logger.getLogger(us_booking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(us_booking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(us_booking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(us_booking.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new us_booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_book;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> namecb;
    private javax.swing.JComboBox<String> paymentcb;
    private javax.swing.JComboBox<String> propertytypecb;
    private javax.swing.JLabel txt_id;
    private javax.swing.JTextField txt_owner;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
