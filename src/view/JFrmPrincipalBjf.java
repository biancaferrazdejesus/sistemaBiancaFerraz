/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Meire
 */
public class JFrmPrincipalBjf extends javax.swing.JFrame {

    /**
     * Creates new form JFrmPrincipal
     */
    public JFrmPrincipalBjf() {
        initComponents();
        setTitle("Sistema de Compra e Venda");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMmuSair = new javax.swing.JMenu();
        jMmuUsuarios = new javax.swing.JMenuItem();
        jMmuClientes = new javax.swing.JMenuItem();
        jMmuFuncionarios = new javax.swing.JMenuItem();
        jMmuFuncionarios1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMmuSairr = new javax.swing.JMenuItem();
        jMmuSair1 = new javax.swing.JMenu();
        jMmuUsuarios1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 51, 102));

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setForeground(new java.awt.Color(204, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 0, 102));
        jLabel1.setForeground(new java.awt.Color(255, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/agoravai.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(0, 940));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2020, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 0, 102));
        jMenuBar1.setForeground(new java.awt.Color(255, 0, 102));

        jMmuSair.setBackground(new java.awt.Color(255, 0, 102));
        jMmuSair.setForeground(new java.awt.Color(255, 0, 102));
        jMmuSair.setMnemonic('C');
        jMmuSair.setText("Cadastros");
        jMmuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuSairActionPerformed(evt);
            }
        });

        jMmuUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMmuUsuarios.setMnemonic('u');
        jMmuUsuarios.setText("Usuarios");
        jMmuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuUsuariosActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuUsuarios);

        jMmuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMmuClientes.setMnemonic('c');
        jMmuClientes.setText("Clientes");
        jMmuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuClientesActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuClientes);

        jMmuFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMmuFuncionarios.setMnemonic('f');
        jMmuFuncionarios.setText("Funcionario");
        jMmuFuncionarios.setMaximumSize(new java.awt.Dimension(32667, 32767));
        jMmuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuFuncionariosActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuFuncionarios);

        jMmuFuncionarios1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMmuFuncionarios1.setMnemonic('f');
        jMmuFuncionarios1.setText("Produtos");
        jMmuFuncionarios1.setMaximumSize(new java.awt.Dimension(32667, 32767));
        jMmuFuncionarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuFuncionarios1ActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuFuncionarios1);
        jMmuSair.add(jSeparator1);

        jMmuSairr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMmuSairr.setMnemonic('s');
        jMmuSairr.setText("Sair");
        jMmuSairr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuSairrActionPerformed(evt);
            }
        });
        jMmuSair.add(jMmuSairr);

        jMenuBar1.add(jMmuSair);

        jMmuSair1.setForeground(new java.awt.Color(255, 0, 102));
        jMmuSair1.setMnemonic('C');
        jMmuSair1.setText("Movimento");
        jMmuSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuSair1ActionPerformed(evt);
            }
        });

        jMmuUsuarios1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMmuUsuarios1.setMnemonic('u');
        jMmuUsuarios1.setText("Vendas");
        jMmuUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmuUsuarios1ActionPerformed(evt);
            }
        });
        jMmuSair1.add(jMmuUsuarios1);

        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jSeparator2.setDoubleBuffered(true);
        jMmuSair1.add(jSeparator2);

        jMenuBar1.add(jMmuSair1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMmuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuUsuariosActionPerformed
        // TODO add your handling code here
        JDlgUsuariosBjf jDlgUsuarios = new JDlgUsuariosBjf(this, true);
        jDlgUsuarios.setVisible(true);
    }//GEN-LAST:event_jMmuUsuariosActionPerformed

    private void jMmuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuClientesActionPerformed
        // TODO add your handling code here:
        JDlgClientesBjf jDlgClientes = new JDlgClientesBjf(this, true);
        jDlgClientes.setVisible(true);
    }//GEN-LAST:event_jMmuClientesActionPerformed

    private void jMmuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuFuncionariosActionPerformed
        JDlgFuncionariosNovoBjf jDlgFuncionariosNovo = new JDlgFuncionariosNovoBjf(this, true);
        jDlgFuncionariosNovo.setVisible(true);
    }//GEN-LAST:event_jMmuFuncionariosActionPerformed

    private void jMmuFuncionarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuFuncionarios1ActionPerformed
        // TODO add your handling code here:
        JDlgProdutoNovoBjf jDlgProdutoNovo = new JDlgProdutoNovoBjf(this, true);
        jDlgProdutoNovo.setVisible(true);
    }//GEN-LAST:event_jMmuFuncionarios1ActionPerformed

    private void jMmuSairrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuSairrActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMmuSairrActionPerformed

    private void jMmuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMmuSairActionPerformed

    private void jMmuUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuUsuarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMmuUsuarios1ActionPerformed

    private void jMmuSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmuSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMmuSair1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmPrincipalBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmPrincipalBjf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmPrincipalBjf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMmuClientes;
    private javax.swing.JMenuItem jMmuFuncionarios;
    private javax.swing.JMenuItem jMmuFuncionarios1;
    private javax.swing.JMenu jMmuSair;
    private javax.swing.JMenu jMmuSair1;
    private javax.swing.JMenuItem jMmuSairr;
    private javax.swing.JMenuItem jMmuUsuarios;
    private javax.swing.JMenuItem jMmuUsuarios1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
