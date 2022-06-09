package DAL;

import Entidades.TipoProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Humberto
 */
public class TipoProdutoDAL {
    private Connection conn;
    private PreparedStatement query;
    private ResultSet res;
    
    public boolean criarTipoProduto(TipoProduto tipoProduto) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Insert Into TipoProduto (Categoria) Values (?)");
            query.setString(1, tipoProduto.getNome());
            query.execute();
            sucesso = true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o administrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
    } 
}
