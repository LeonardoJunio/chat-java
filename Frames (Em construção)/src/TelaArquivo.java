/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mballem.app.bean.frame;

import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

/**
 *
 * @author leonardo
 */
public class TelaArquivo extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private Socket socket;
    private ObjectOutputStream outputStream;

    
    public TelaArquivo() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        TextFieldNome = new javax.swing.JTextField();
        ButtonEntrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ButtonAnexarArquivo = new javax.swing.JButton();
        LabelStatusEnvio = new javax.swing.JLabel();
        LabelNomeQuemEnviou = new javax.swing.JLabel();
        LabelNomeArquivoEnviou = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        LabelNome.setText("Digite seu nome:");

        TextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNomeActionPerformed(evt);
            }
        });

        ButtonEntrar.setText("Entrar");

        jButton2.setText("Sair");

        ButtonAnexarArquivo.setText("Anexar arquivo");
        ButtonAnexarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnexarArquivoActionPerformed(evt);
            }
        });

        LabelStatusEnvio.setText("Arquivo xxx enviado");

        LabelNomeQuemEnviou.setText("Pessoa A enviou um arquivo");

        LabelNomeArquivoEnviou.setText("O nome do arquivo e:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addGap(0, 362, Short.MAX_VALUE)
        							.addComponent(jButton2))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(LabelStatusEnvio)
        							.addGap(0, 286, Short.MAX_VALUE))
        						.addGroup(jPanel1Layout.createSequentialGroup()
        							.addComponent(LabelNome)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(TextFieldNome, 196, 196, 196)
        							.addGap(18)
        							.addComponent(ButtonEntrar))))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(LabelNomeQuemEnviou)
        					.addGap(0, 149, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(LabelNomeArquivoEnviou)))
        			.addContainerGap())
        		.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap(160, Short.MAX_VALUE)
        			.addComponent(ButtonAnexarArquivo)
        			.addGap(148))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(LabelNome)
        				.addComponent(TextFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(ButtonEntrar))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(ButtonAnexarArquivo)
        			.addGap(53)
        			.addComponent(LabelStatusEnvio)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(LabelNomeQuemEnviou)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(LabelNomeArquivoEnviou)
        			.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
        			.addComponent(jButton2)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNomeActionPerformed

    private void ButtonAnexarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnexarArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAnexarArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaArquivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaArquivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnexarArquivo;
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelNomeArquivoEnviou;
    private javax.swing.JLabel LabelNomeQuemEnviou;
    private javax.swing.JLabel LabelStatusEnvio;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
