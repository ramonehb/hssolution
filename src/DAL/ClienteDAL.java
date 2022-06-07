package DAL;

import Entidades.Cliente;
import Entidades.Endereco;
import Entidades.TipoCliente;
import Entidades.Usuario;
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
            query = conn.prepareStatement("Insert Into Cliente (Nome, Email, DT_Nasc, Telefone, ID_TipoCliente, CpfCnpj, Cep, Endereco, Bairro, Uf, Numero, Complemento) Values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ");
            query.setString(1, cliente.getNome());
            query.setString(2, cliente.getEmail());
            query.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
            query.setString(4, cliente.getTelefone().replace(" ","").replace("(", "").replace(")", "").replace("-", ""));
            query.setInt(5, cliente.getTipoCliente().getIdTipoCliente());
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
    
    public void atualizarCliente(Cliente cliente) throws SQLException {
        try {
            conn = Conexao.abreConexao();
            query = (PreparedStatement) conn.prepareStatement("Update Cliente Set Nome = ?, Email = ?, DT_Nasc = ?, Telefone = ?, ID_TipoCliente = ?, CpfCnpj = ?, Cep = ?, Endereco = ?, Bairro = ?, Uf = ?, Numero = ?, Complemento = ? Where ID_Cliente = ?");
            
            query.setString(1, cliente.getNome());
            query.setString(2, cliente.getEmail());
            query.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
            query.setString(4, cliente.getTelefone().replace(" ","").replace("(", "").replace(")", "").replace("-", ""));
            query.setInt(5, cliente.getTipoCliente().getIdTipoCliente());
            query.setString(6, cliente.getCpfCnpj().replace("-", "").replace("/","").replace(".",""));
            query.setString(7, cliente.getEndereco().getCep().replace("-",""));
            query.setString(8, cliente.getEndereco().getEndereco());
            query.setString(9, cliente.getEndereco().getBairro());
            query.setString(10, cliente.getEndereco().getUf());
            query.setInt(11, cliente.getEndereco().getNumero());
            query.setString(12, cliente.getEndereco().getComplemento());
            query.setInt(13, cliente.getIdCliente());
            query.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
        }
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
    
    public ArrayList<Cliente> listarClientes() throws SQLException{
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("SELECT * FROM Cliente");
            res = query.executeQuery();
            
            while(res.next()){
                Cliente c = new Cliente();
                Endereco e = new Endereco();
                TipoCliente t = new TipoCliente();
                c.setIdCliente(res.getInt("ID_Cliente"));
                c.setNome(res.getString("Nome"));
                c.setEmail(res.getString("Email"));
                c.setDataNascimento(res.getDate("DT_Nasc"));
                c.setTelefone(res.getString("Telefone"));
                t.setIdTipoCliente(res.getInt("ID_TipoCliente"));
                c.setCpfCnpj(res.getString("CpfCnpj"));
                e.setCep(res.getString("CEP"));
                e.setEndereco(res.getString("Endereco"));
                e.setBairro(res.getString("Bairro"));
                e.setUf(res.getString("Uf"));
                e.setNumero(res.getInt("Numero"));
                e.setComplemento(res.getString("Complemento"));
                clientes.add(c);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return clientes;
    }
}
