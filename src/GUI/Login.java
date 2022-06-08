package GUI;

import DAL.UsuarioDAL;
import Entidades.Sessao.Session;
import Entidades.Usuario;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextLogin = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jPasswordSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabelEsqueciSenha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(java.awt.Color.red);
        setSize(new java.awt.Dimension(0, 0));

        jLabelLogin.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelLogin.setText("Login:");

        jLabelSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");

        jTextLogin.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextLogin.setName(""); // NOI18N

        jButtonEntrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jPasswordSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Acesse com suas credencias");

        jLabelEsqueciSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelEsqueciSenha.setText("Esqueci a senha");

        jButton1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton1.setText("Cadastra-se");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabelEsqueciSenha)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButtonEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogin)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEsqueciSenha)
                    .addComponent(jButton1))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        int erro = 0;
        String mensagem = "";
        
        if(jTextLogin.getText().equals("")){
            mensagem += "Digite o usúario!\n";
            erro++;
        } else {
            if(jTextLogin.getText().length() >= 10 || jTextLogin.getText().length() < 3){
                mensagem += "Usúario inválido\n";
                erro++;
            }
        }
        
        if (jPasswordSenha.getText().equals("")){
            mensagem += "Digite a senha!";
            erro++;
        } 
        
        if(erro > 0){
            JOptionPane.showMessageDialog(null,mensagem,"Atenção", JOptionPane.CANCEL_OPTION);
            return;
        }
        
        String login = jTextLogin.getText();
        String senha = jPasswordSenha.getText();
        UsuarioDAL usuario = new UsuarioDAL();
        try {
            Usuario us = usuario.autenticacao(login, senha);
            if (us.getLogado() == true){
                Session.ID_Usuario = us.getIdUsuario();
                Session.Login = us.getLogin();
                Session.ID_TipoUsuario = us.getTipoUsuario().getIdTipoUsuario();
               
                JOptionPane.showMessageDialog(null,"Bem-vindo " + jTextLogin.getText(),"HSSolution", JOptionPane.INFORMATION_MESSAGE);
                new TelaInicial().setVisible(true);
                this.setVisible(false);
            }else {
                JOptionPane.showMessageDialog(null,"Usuário não localizado","HSSolution", JOptionPane.ERROR_MESSAGE);
            }
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Contate o administrador","Atenção", JOptionPane.ERROR_MESSAGE);
        }
        
        

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CadastroUsuario().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEsqueciSenha;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextLogin;
    // End of variables declaration//GEN-END:variables
}
