package DAL;

import Entidades.Cliente;
import Entidades.Endereco;
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
    
    public boolean criarCliente(Cliente cliente) throws SQLException{
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Insert Into Cliente (Nome, Email, DT_Nasc, Telefone, ID_TipoCliente, CpfCnpj, Cep, Endereco, Bairro, Uf, Numero, Complemento) Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            query.setString(1, cliente.getNome());
            query.setString(2, cliente.getEmail());
            query.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
            query.setString(4, cliente.getTelefone().replace(" ","").replace("(", "").replace(")", "").replace("-", ""));
            query.setInt(5, cliente.getIdTipoCliente());
            query.setString(6, cliente.getCpfCnpj().replace("-", "").replace("/","").replace(".",""));
            query.setString(7, cliente.getEndereco().getCep().replace("-",""));
            query.setString(8, cliente.getEndereco().getEndereco());
            query.setString(9, cliente.getEndereco().getBairro());
            query.setString(10, cliente.getEndereco().getUf());
            query.setInt(11, cliente.getEndereco().getNumero());
            query.setString(12, cliente.getEndereco().getComplemento());
            query.execute();
            
            sucesso = true;            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
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
}
