package source;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextLogin = new javax.swing.JTextField();
        jButtonEntrar = new javax.swing.JButton();
        jLabelLoginVal = new javax.swing.JLabel();
        jLabelSenhaVal = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabelEsqueciSenha = new javax.swing.JLabel();

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

        jButtonEntrar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonEntrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        jLabelLoginVal.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabelSenhaVal.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabelCadastrar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelCadastrar.setText("Cadastra-se");

        jPasswordSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel3.setText("Acesse com suas credencias");

        jLabelEsqueciSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabelEsqueciSenha.setText("Esqueci a senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabelCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
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
                    .addComponent(jLabelLoginVal)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenhaVal))
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
                .addGap(47, 47, 47)
                .addComponent(jLabelLoginVal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogin)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabelSenhaVal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastrar)
                    .addComponent(jLabelEsqueciSenha))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        jLabelLoginVal.setForeground(Color.red);
        jLabelSenhaVal.setForeground(Color.red);
        var valida = 0;
        var mensagem = "";
        
        if(jTextLogin.getText().equals("")){
            mensagem += "Digite o usúario!\n";
            valida++;
        } else {
            if(jTextLogin.getText().length() >= 10 || jTextLogin.getText().length() < 3){
                jLabelLoginVal.setText("Caracteres Inválido!");
            }else{
                 jLabelLoginVal.setText("");
            }
        }
        
        if (jPasswordSenha.getText().equals("")){
            mensagem += "Digite a senha!";
            valida++;
        } else {
            if(jPasswordSenha.getText().length() >= 10 || jPasswordSenha.getText().length() < 3){
                jLabelSenhaVal.setText("Caracteres Inválido!");
            }
            else{
                jLabelSenhaVal.setText("");
            }
        }
        
        if(valida > 0){
            JOptionPane.showMessageDialog(null,mensagem,"Atenção", JOptionPane.CANCEL_OPTION);
        }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelEsqueciSenha;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLoginVal;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSenhaVal;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JTextField jTextLogin;
    // End of variables declaration//GEN-END:variables
}
