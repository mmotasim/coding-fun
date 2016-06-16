/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package open.application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author mothi
 */
public class mjf extends javax.swing.JFrame {

    /**
     * Creates new form mjf
     */
    Hashtable<String, String> allfiles = new Hashtable<>();
    
    public mjf() {
        initComponents();
        Dimension sz = Toolkit.getDefaultToolkit().getScreenSize();
        this.setBounds(sz.width/2-150,sz.height/2-110,300,220);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("Apps-nepomuk-icon.png")).getImage());
        allfiles.put("cr","chrome.exe");
        allfiles.put("ps","Photoshop.exe");
        allfiles.put("lr","light.bat");
        allfiles.put("nb","netbe.bat");
        allfiles.put("dw", "Dreamweaver.exe");
        allfiles.put("np", "notepad.exe");
        allfiles.put("cc","calc.exe");
        allfiles.put("cp","control.exe");
        allfiles.put("cmd", "cmd.exe");
        allfiles.put("f", "fifa.bat");
        allfiles.put("sk", "skype.exe");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APP SHORTCUT");
        setIconImage(new ImageIcon(getClass().getResource("Oxygen-Icons.org-Oxygen-Apps-preferences-desktop-icons.ico")).getImage());
        getContentPane().setLayout(null);

        jTextField1.setText("ENTER APPLICATION NAME");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(29, 32, 217, 49);

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\mothi\\Desktop\\open.png")); // NOI18N
        jButton1.setFocusCycleRoot(true);
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(136, 107, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/application/Applications-icon2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1, 6, 270, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setText(null);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String prgname = "";
        String cmd =jTextField1.getText();
        prgname= allfiles.get(jTextField1.getText());
        String comm = "cmd /c ch.bat "+prgname;
        if(cmd.equals(""))
        {
            JOptionPane.showMessageDialog(null,"PLEASE ENTER A COMMAND");
            
        }
        
        else if(!allfiles.containsKey(cmd))
        {
            JOptionPane.showMessageDialog(null,"INVALID COMMAND");
            
        }
        else 
        {
            try{
                Runtime.getRuntime().exec(comm);
            }
            catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null,"NOT RESPONDING");
                    }
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
       if(evt.getKeyCode()== KeyEvent.VK_ENTER)
       {
          
           jButton1ActionPerformed(null);
       }
    }//GEN-LAST:event_jTextField1KeyReleased

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
            java.util.logging.Logger.getLogger(mjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mjf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}