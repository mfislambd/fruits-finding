/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Jframe;
import all_classes.database_con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author CETC
 */
public class Statictic_from extends javax.swing.JDialog {

    /**
     * Creates new form Statictic_from
     */
    public Statictic_from(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon img=new ImageIcon("img\\icon\\sta.png");
        this.setIconImage(img.getImage());
        bg_sta.setIcon(new javax.swing.ImageIcon("img\\sta.png"));
        lav1.setIcon(new javax.swing.ImageIcon("img\\arrow.png"));
    lav2.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
    lav3.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
    lav4.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
    lav5.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
    lav6.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
    infoup("lav1");
    }
    static public int nam()
    {
        return flag;
    }
     public void infoup(String ss)
    {
        try {
            Connection con=database_con.db_check();
            String sql="select * from info where name='"+ss+"' ";
            PreparedStatement st=con.prepareCall(sql);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                tp.setText(String.valueOf(rs.getInt(2)));
                tw.setText(String.valueOf(rs.getInt(3)));
                tl.setText(String.valueOf(rs.getInt(4)));
                ab.setText(String.valueOf(rs.getInt(5)));
                bsc.setText(String.valueOf(rs.getInt(6)));
                mt.setText(String.valueOf(rs.getInt(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(sta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tp = new javax.swing.JLabel();
        tw = new javax.swing.JLabel();
        tl = new javax.swing.JLabel();
        bsc = new javax.swing.JLabel();
        mt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ab = new javax.swing.JLabel();
        lav1 = new javax.swing.JLabel();
        lav2 = new javax.swing.JLabel();
        lav3 = new javax.swing.JLabel();
        lav4 = new javax.swing.JLabel();
        lav5 = new javax.swing.JLabel();
        lav6 = new javax.swing.JLabel();
        bg_sta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Summary of all level ");
        setResizable(false);

        jPanel2.setLayout(null);

        jPanel1.setOpaque(false);

        jButton6.setText("Level 6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Level 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Level 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Level 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Level 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Level 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(30, 40, 87, 273);

        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Total played    :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setText("Total won        :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Total loss         :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Best score       :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Minimum time :");

        tp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tp.setForeground(new java.awt.Color(204, 255, 204));
        tp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tp.setText("jLabel6");

        tw.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tw.setForeground(new java.awt.Color(204, 255, 204));
        tw.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tw.setText("jLabel7");

        tl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tl.setForeground(new java.awt.Color(204, 255, 204));
        tl.setText("jLabel8");

        bsc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bsc.setForeground(new java.awt.Color(204, 255, 204));
        bsc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bsc.setText("jLabel9");

        mt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mt.setForeground(new java.awt.Color(204, 255, 204));
        mt.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
        jLabel11.setText("Abandon         :");

        ab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ab.setForeground(new java.awt.Color(204, 255, 204));
        ab.setText("jLabel12");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bsc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mt, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(ab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ab, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(180, 40, 410, 280);

        lav1.setBackground(new java.awt.Color(255, 0, 0));
        lav1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lav1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lav1);
        lav1.setBounds(110, 50, 70, 30);

        lav2.setBackground(new java.awt.Color(255, 51, 51));
        lav2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lav2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lav2);
        lav2.setBounds(110, 100, 70, 30);

        lav3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lav3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lav3);
        lav3.setBounds(110, 140, 70, 30);

        lav4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lav4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lav4);
        lav4.setBounds(110, 190, 70, 30);

        lav5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lav5.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lav5);
        lav5.setBounds(110, 230, 70, 30);

        lav6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lav6.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lav6);
        lav6.setBounds(110, 270, 70, 30);
        jPanel2.add(bg_sta);
        bg_sta.setBounds(4, 4, 700, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        lav1.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav2.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav3.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav4.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav5.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav6.setIcon(new javax.swing.ImageIcon("img\\arrow.png"));
        infoup("lav6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lav1.setIcon(new javax.swing.ImageIcon("img\\arrow.png"));
        lav2.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav3.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav4.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav5.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav6.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        infoup("lav1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lav1.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav2.setIcon(new javax.swing.ImageIcon("img\\arrow.png"));
        lav3.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav4.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav5.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav6.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        infoup("lav2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        lav1.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav2.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav3.setIcon(new javax.swing.ImageIcon("img\\arrow.png"));
        lav4.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav5.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav6.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        infoup("lav3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        lav1.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav2.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav3.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav4.setIcon(new javax.swing.ImageIcon("img\\arrow.png"));
        lav5.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav6.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        infoup("lav4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        lav1.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav2.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav3.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav4.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        lav5.setIcon(new javax.swing.ImageIcon("img\\arrow.png"));
        lav6.setIcon(new javax.swing.ImageIcon("img\\arrw.png"));
        infoup("lav5");
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Statictic_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Statictic_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Statictic_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Statictic_from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Statictic_from dialog = new Statictic_from(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ab;
    private javax.swing.JLabel bg_sta;
    private javax.swing.JLabel bsc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lav1;
    private javax.swing.JLabel lav2;
    private javax.swing.JLabel lav3;
    private javax.swing.JLabel lav4;
    private javax.swing.JLabel lav5;
    private javax.swing.JLabel lav6;
    private javax.swing.JLabel mt;
    private javax.swing.JLabel tl;
    private javax.swing.JLabel tp;
    private javax.swing.JLabel tw;
    // End of variables declaration//GEN-END:variables
static int flag=0;
}
