package Select;

import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author acer
 */
import Main.Main;

public class ThreePlayers extends javax.swing.JFrame {

    /**
     * Creates new form ThreePlayers
     */
    public ThreePlayers() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player1 = new javax.swing.JComboBox<>();
        player2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        player3 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        player1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Character", "Character 1", "Character 2", "Character 3", "Character 4" }));
        player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1ActionPerformed(evt);
            }
        });

        player2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Character", "Character 1", "Character 2", "Character 3", "Character 4" }));
        player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2ActionPerformed(evt);
            }
        });

        jButton1.setText("Play");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        player3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Character", "Character 1", "Character 2", "Character 3", "Character 4" }));
        player3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player3ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player 2");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player 1");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player 3");

        pic2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pic3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        pic1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(player2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(pic3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pic3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1ActionPerformed
        // TODO add your handling code here:
        if(player1.getSelectedItem() == "Select Character"){
            pic1.setIcon(null);
        } else if (player1.getSelectedItem() == "Character 1"){
            ImageIcon picture = new ImageIcon("res/Picture/c1.png");
            pic1.setIcon(picture);
            id1 = 1;
        } else if (player1.getSelectedItem() == "Character 2"){
            ImageIcon picture = new ImageIcon("res/Picture/c2.png");
            pic1.setIcon(picture);
            id1 = 2;
        } else if (player1.getSelectedItem() == "Character 3"){
            ImageIcon picture = new ImageIcon("res/Picture/c3.png");
            pic1.setIcon(picture);
            id1 = 3;
        }else if (player1.getSelectedItem() == "Character 4"){
            ImageIcon picture = new ImageIcon("res/Picture/c4.png");
            pic1.setIcon(picture);
            id1 = 4;
        }
    }//GEN-LAST:event_player1ActionPerformed

    //PLay Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Main.showWindow();
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2ActionPerformed
        // TODO add your handling code here:
        if(player2.getSelectedItem() == "Select Character"){
            pic2.setIcon(null);
        } else if (player2.getSelectedItem() == "Character 1"){
            ImageIcon picture = new ImageIcon("res/Picture/c1.png");
            pic2.setIcon(picture);
            id2 = 1;
        } else if (player2.getSelectedItem() == "Character 2"){
            ImageIcon picture = new ImageIcon("res/Picture/c2.png");
            pic2.setIcon(picture);
            id2 = 2;
        } else if (player2.getSelectedItem() == "Character 3"){
            ImageIcon picture = new ImageIcon("res/Picture/c3.png");
            pic2.setIcon(picture);
            id2 = 3;
        }else if (player2.getSelectedItem() == "Character 4"){
            ImageIcon picture = new ImageIcon("res/Picture/c4.png");
            pic2.setIcon(picture);
            id2 = 4;
        }
    }//GEN-LAST:event_player2ActionPerformed

    private void player3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player3ActionPerformed
        // TODO add your handling code here:
        if(player3.getSelectedItem() == "Select Character"){
            pic3.setIcon(null);
        } else if (player3.getSelectedItem() == "Character 1"){
            ImageIcon picture = new ImageIcon("res/Picture/c1.png");
            pic3.setIcon(picture);
            id3 = 1;
        } else if (player3.getSelectedItem() == "Character 2"){
            ImageIcon picture = new ImageIcon("res/Picture/c2.png");
            pic3.setIcon(picture);
            id3 = 2;
        } else if (player3.getSelectedItem() == "Character 3"){
            ImageIcon picture = new ImageIcon("res/Picture/c3.png");
            pic3.setIcon(picture);
            id3 = 3;
        }else if (player3.getSelectedItem() == "Character 4"){
            ImageIcon picture = new ImageIcon("res/Picture/c4.png");
            pic3.setIcon(picture);
            id3 = 4;
        }
    }//GEN-LAST:event_player3ActionPerformed

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
            java.util.logging.Logger.getLogger(ThreePlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreePlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreePlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreePlayers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreePlayers().setVisible(true);
            }
        });
    }

    public static int getID1(){
        return id1;
    }

    public static int getID2(){
        return id2;
    }

    public static int getID3(){
        return id3;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JComboBox<String> player1;
    private javax.swing.JComboBox<String> player2;
    private javax.swing.JComboBox<String> player3;

    private static int id1;
    private static int id2;
    private static int id3;
    // End of variables declaration//GEN-END:variables
}
