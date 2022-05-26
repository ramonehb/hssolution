/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAL.UsuarioDAL;
import Entidades.Usuario;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Felipe And Humberto
 */
public class CadastroUsuario extends javax.swing.JFrame {
    public CadastroUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        listaTipoProduto();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButtonFinalizar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextLogin = new javax.swing.JTextField();
        jTextSenha = new javax.swing.JPasswordField();
        jTextConfSenha = new javax.swing.JPasswordField();
        jTextEmail = new javax.swing.JTextField();
        jTextTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxTipoProduto = new javax.swing.JComboBox<>();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Cadastre-se");

        jButtonFinalizar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel5.setText("Confirme a senha:");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel6.setText("E-mail:");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Telefone:");

        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNomeKeyTyped(evt);
            }
        });

        jTextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextLoginActionPerformed(evt);
            }
        });
        jTextLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextLoginKeyTyped(evt);
            }
        });

        jTextSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextSenhaKeyTyped(evt);
            }
        });

        jTextConfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextConfSenhaKeyTyped(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });
        jTextEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEmailKeyTyped(evt);
            }
        });

        jTextTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelefoneKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Tipo do usuário:");

        jComboBoxTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFinalizar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                .addComponent(jTextLogin)
                                .addComponent(jTextNome)
                                .addComponent(jTextConfSenha)
                                .addComponent(jTextEmail)
                                .addComponent(jTextTelefone))
                            .addComponent(jLabel1)))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFinalizar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
       boolean retorno = ValidaCadastro();
       try {
            if(retorno){
                Usuario usuario = new Usuario();
                usuario.setNome(jTextNome.getText());
                usuario.setLogin(jTextLogin.getText());
                usuario.setSenha(jTextSenha.getText());
                usuario.setEmail(jTextEmail.getText());
                usuario.setTelefone(jTextTelefone.getText());
                usuario.setTipoUsuario(jComboBoxTipoProduto.getSelectedItem().toString() == "Administrador" ? 1 : 2);
                usuario.setFlHabilitado(true);
           
                UsuarioDAL usuarioDAL = new UsuarioDAL();
                if (usuarioDAL.criarUsuario(usuario)){
                    JOptionPane.showMessageDialog(null,"Usuário cadastrado","Atenção", JOptionPane.INFORMATION_MESSAGE);
                    new Login().setVisible(true);
                    setVisible(false);
                }
            }   
       }catch (HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null,"Contate o administrador","Atenção", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButtonFinalizarActionPerformed
    
    public void listaTipoProduto(){
        try {
            UsuarioDAL usuarioDAL = new UsuarioDAL();
            ResultSet res = usuarioDAL.listaTipoUsuario();
            
            while (res.next()){
                jComboBoxTipoProduto.addItem(res.getString(2));
            }
        } catch (Exception e) {
        }
    }
    
    private boolean ValidaCadastro(){
        String mensagem = "";
        int erro = 0;
       
        if (jTextNome.getText().equals("")){
            mensagem += "Digite o nome.\n";
            erro++;
        }
        
        if (jTextLogin.getText().equals("")){
            mensagem += "Digite o login.\n";
            erro++;
        }
       
        if (jTextSenha.getText().equals("")){
            mensagem += "Digite a senha.\n";
            erro++;
        }
        
        if (jTextConfSenha.getText().equals("")){
            mensagem += "Digite a confirmação de senha.\n";
            erro++;
        }
        
        if (jTextEmail.getText().equals("")){
            mensagem += "Digite o e-mail\n";
            erro++;
        }
        if (!jTextSenha.getText().equals(jTextConfSenha.getText())){
            mensagem += "As senhas são diferentes.\n";
            erro++;
        }
        if (jComboBoxTipoProduto.getSelectedItem().toString() == "Selecione"){
            mensagem += "Selecione o tipo do usuário.\n";
            erro++;
        }
       
       if (erro  >  0){
           JOptionPane.showMessageDialog(null, mensagem, "Atenção", JOptionPane.CANCEL_OPTION);
       }       
       
       return erro == 0;
    }
    
    private void jTextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyTyped
        if (jTextNome.getText().length() >=100){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextNomeKeyTyped

    private void jTextLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextLoginKeyTyped
        if (jTextLogin.getText().length() >=20){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextLoginKeyTyped

    private void jTextSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSenhaKeyTyped
        if (jTextSenha.getText().length() >=10){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextSenhaKeyTyped

    private void jTextConfSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextConfSenhaKeyTyped
        if (jTextConfSenha.getText().length() >=10){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextConfSenhaKeyTyped

    private void jTextEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEmailKeyTyped
        if (jTextEmail.getText().length() >=100){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextEmailKeyTyped
    
    private void jTextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextLoginActionPerformed

    private void jTextTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefoneKeyTyped
        if (jTextTelefone.getText().length() >=20){
        evt.consume();
        Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jTextTelefoneKeyTyped

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonFinalizar;
    private javax.swing.JComboBox<String> jComboBoxTipoProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPasswordField jTextConfSenha;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JPasswordField jTextSenha;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
