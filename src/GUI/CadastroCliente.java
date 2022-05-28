package GUI;

import DAL.ClienteDAL;
import Entidades.Cliente;
import Entidades.Endereco;
import Jm.JMascara;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author SAMUEL
 */
public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelTpCliente = new javax.swing.JLabel();
        jCbTpCliente = new javax.swing.JComboBox<>();
        jLabelCpfCnpj = new javax.swing.JLabel();
        jTextCpfCnpj = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jFormattedCep = new javax.swing.JFormattedTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jTextEstado = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextTelefone = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelDataNascimento = new javax.swing.JLabel();
        jTextDataNascimento = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Cliente");

        jLabelNome.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextNome.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabelTpCliente.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelTpCliente.setText("Tipo Cliente:");

        jCbTpCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Jurídica" }));
        jCbTpCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbTpClienteActionPerformed(evt);
            }
        });

        jLabelCpfCnpj.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelCpfCnpj.setText("CPF:");

        jTextCpfCnpj.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextCpfCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextCpfCnpjKeyReleased(evt);
            }
        });

        jLabelCep.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelCep.setText("CEP:");

        try {
            jFormattedCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelEndereco.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelEndereco.setText("Endereço:");

        jTextEndereco.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabelBairro.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jTextBairro.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabelCidade.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jTextCidade.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jTextEstado.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabelEstado.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelEstado.setText("Estado:");

        jLabelEmail.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelEmail.setText("E-mail:");

        jTextEmail.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N

        jLabelTelefone.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelTelefone.setText("Telefone:");

        jTextTelefone.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jTextTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextTelefoneKeyReleased(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelDataNascimento.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabelDataNascimento.setText("Data Nascimento:");

        jTextDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jTextEmail))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jButtonCadastrar)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCpfCnpj)
                                    .addComponent(jLabelTpCliente)
                                    .addComponent(jLabelCep)
                                    .addComponent(jLabelEndereco)
                                    .addComponent(jLabelBairro)
                                    .addComponent(jLabelCidade)
                                    .addComponent(jLabelEstado)
                                    .addComponent(jLabelTelefone))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCbTpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedCep, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataNascimento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbTpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTpCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpfCnpj)
                    .addComponent(jTextCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCep))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCpfCnpjKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCpfCnpjKeyReleased
        jTextCpfCnpj.setText(JMascara.GetJmascaraCpfCnpj(jTextCpfCnpj.getText()));
    }//GEN-LAST:event_jTextCpfCnpjKeyReleased

    private void jCbTpClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbTpClienteActionPerformed
        jLabelCpfCnpj.setText(jCbTpCliente.getSelectedIndex() == 0 ? "CPF:" : "CNPJ:");
    }//GEN-LAST:event_jCbTpClienteActionPerformed

    private void jTextTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelefoneKeyReleased
        jTextTelefone.setText(JMascara.GetJmascaraFone(jTextTelefone.getText()));
    }//GEN-LAST:event_jTextTelefoneKeyReleased

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        
        String mensagem = "";
        int erro = 0;
        
        if(jTextNome.getText() == null || jTextNome.getText().equals("")){
            mensagem += "Digite o nome\n";
            erro++;
        }
        if(jTextEmail.getText() == null || jTextEmail.getText().equals("")){
            mensagem += "Digite o e-mail\n";
            erro++;
        }
        if(jTextDataNascimento.getText() == null || jTextDataNascimento.getText().equals("")){
            mensagem += "Digite a data de nascimento\n";
            erro++;
        }
        if(jTextTelefone.getText() == null || jTextTelefone.getText().equals("")){
            mensagem += "Digite o número de telefone\n";
            erro++;
        }
        if(jTextCpfCnpj.getText() == null || jTextCpfCnpj.getText().equals("")){
            mensagem += "Digite o número de CPF ou CNPJ\n";
            erro++;
        }
            
            
        
        if(erro > 0){
            JOptionPane.showMessageDialog(null,mensagem,"Atenção", JOptionPane.CANCEL_OPTION);
            return;
        }
        
        try {
            SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
            Date dtNasc = dt.parse(jTextDataNascimento.getText());
            Cliente cliente = new Cliente();
            cliente.setNome(jTextNome.getText());
            cliente.setEmail(jTextEmail.getText());
            cliente.setDataNascimento(dtNasc);
            cliente.setTelefone(jTextTelefone.getText());
            cliente.setTpCliente(jCbTpCliente.getSelectedItem().toString() == "0" ? "Física" : "Juridica");
            cliente.setCpfCnpj(jTextCpfCnpj.getText());
            Endereco endereco = new Endereco();
            endereco.setCidade(jTextCidade.getText());
            endereco.setBairro(jTextBairro.getText());
            endereco.setCep(jFormattedCep.getText());
            endereco.setEndereco(jTextEndereco.getText());
            cliente.setEndereco(endereco);
            
        
            ClienteDAL clienteDAL = new ClienteDAL();
            
            if(clienteDAL.criarCliente(cliente)){
                JOptionPane.showMessageDialog(null,"Cliente cadastrado com sucesso!","Atenção", JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Contate o administrador!","Atenção", JOptionPane.CANCEL_OPTION);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jCbTpCliente;
    private javax.swing.JFormattedTextField jFormattedCep;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpfCnpj;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTpCliente;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextCpfCnpj;
    private javax.swing.JFormattedTextField jTextDataNascimento;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
