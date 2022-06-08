package DAL;

import Entidades.Produto;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Humberto Ramone
 */
public class ProdutoDAL {
    private Connection conn;
    private PreparedStatement query;
    private ResultSet res;
    
    public boolean criarProduto(Produto produto) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Insert Into Produto (ID_TipoProduto, Nome, VL_Pago, VL_Venda, Quantidade, ID_UsuarioCadastro) Values (?, ?, ?, ?, ?, ?)");
            query.setInt(1, produto.getTipoProduto().getIdTipoProduto());
            query.setString(2, produto.getNome());
            query.setDouble(3, produto.getVL_Pago());
            query.setDouble(4, produto.getVL_Venda());
            query.setInt(5, produto.getQuantidade());
            query.setInt(6, produto.getIdUsuarioCadastro());
            query.execute();
            sucesso = true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
    }
    
    public ResultSet listaTipoProduto(){
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Select * From TipoProduto");
            return query.executeQuery();
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
           return null;
        }
    }
}
