package DAL;

import Entidades.Cliente;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
            query.setDate(3, (Date) cliente.getDataNascimento());
            query.setString(4, cliente.getTelefone());
            query.setString(5, cliente.getTpCliente());
            query.setString(6, cliente.getCpfCnpj());
            query.setString(7, cliente.getEndereco().getCep());
            query.setString(8, cliente.getEndereco().getEndereco());
            query.setString(9, cliente.getEndereco().getBairro());
            query.setString(10, cliente.getEndereco().getCidade());
            query.setString(11, cliente.getEndereco().getEstado());
            query.execute();
            
            sucesso = true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
    }
    
}
