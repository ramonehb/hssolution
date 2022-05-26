/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entidades.Cliente;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author SAMUEL
 */
public class ClienteDAL extends Conexao{
    
    private Connection conn;
    private PreparedStatement query;
    private ResultSet res;
    
    public boolean criarCliente(Cliente cliente) throws SQLException{
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Insert Into Cliente (Nome, Email, DT_Nasc, Telefone, TP_Cliente, CpfCnpj, Cep, Endereco, Bairro, Cidade, Estado) Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            query.setString(1, cliente.getNome());
            query.setString(2, cliente.getEmail());
            query.setDate(3, new java.sql.Date(cliente.getDataNascimento()));
            query.setString(4, cliente.getTelefone());
            query.setString(5, cliente.getTpCliente());
            query.setString(6, cliente.getCpfCnpj());
            query.setString(7, cliente.getCep());
            query.setString(8, cliente.getEndereco());
            query.setString(9, cliente.getBairro());
            query.setString(10, cliente.getCidade());
            query.setString(11, cliente.getEstado());
            query.execute();
            
            sucesso = true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
    }
    
}
