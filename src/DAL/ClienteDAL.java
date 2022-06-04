package DAL;

import Entidades.Cliente;
import Entidades.EnderecoCliente;
import javax.swing.JOptionPane;
import java.sql.Connection;
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
    
    public int criarCliente(Cliente cliente) throws SQLException{
        int idCliente = 0;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Insert Into Cliente (Nome, Email, DT_Nasc, Telefone, ID_TipoCliente, CpfCnpj) Values (?, ?, ?, ?, ?, ?) ");
            query.setString(1, cliente.getNome());
            query.setString(2, cliente.getEmail());
            query.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
            query.setString(4, cliente.getTelefone().replace(" ","").replace("(", "").replace(")", "").replace("-", ""));
            query.setInt(5, cliente.getIdTipoCliente());
            query.setString(6, cliente.getCpfCnpj().replace("-", "").replace("/","").replace(".",""));
            query.execute();
            idCliente = cliente.getIdCliente();
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        return idCliente;
    }
    
    public ResultSet listaTipoCliente(){
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Select * From TipoCliente");
            return query.executeQuery();
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
           return null;
        }
    }
    
    public boolean criarEndereco(EnderecoCliente enderecoCliente) throws SQLException{
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Insert Into EnderecoCliente (ID_Cliente, Cep, , Endereco, Bairro, Uf, Numero, Complemento) Values (?, ?, ?, ?, ?, ?, ?)");
            query.setInt(1, enderecoCliente.getIdCliente());
            query.setString(2, enderecoCliente.getCep().replace("-",""));
            query.setString(3, enderecoCliente.getEndereco());
            query.setString(4, enderecoCliente.getBairro());
            query.setString(5, enderecoCliente.getUf());
            query.setInt(6, enderecoCliente.getNumero());
            query.setString(7, enderecoCliente.getComplemento());
            query.execute();
            
            sucesso = true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
    }
}
