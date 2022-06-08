package DAL;

import Entidades.Produto;
import Entidades.TipoProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public ArrayList<Produto> listarProdutos() throws SQLException {
        
        ArrayList<Produto> produtos = new ArrayList<>();
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Select P.ID_Produto, P.Nome, TP.ID_TipoProduto, TP.Categoria, P.VL_Pago, P.VL_Venda, P.Quantidade, P.ID_UsuarioCadastro From Produto As P Inner Join TipoProduto as TP On P.ID_TipoProduto = TP.ID_TipoProduto");
            res = query.executeQuery();

            while (res.next()) {
                Produto p = new Produto();
                TipoProduto t = new TipoProduto();
                p.setIdProduto(res.getInt("ID_Produto"));
                p.setNome(res.getString("Nome"));
                t.setIdTipoProduto(res.getInt("ID_TipoProduto"));
                t.setNome(res.getString("Categoria"));
                p.setVL_Pago(res.getDouble("VL_Pago"));
                p.setVL_Venda(res.getDouble("VL_Venda"));
                p.setQuantidade(res.getInt("Quantidade"));
                p.setIdUsuarioCadastro(res.getInt("ID_UsuarioCadastro"));
                p.setTipoProduto(t);
                
                produtos.add(p);
            }            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return produtos;
    }
    
    public boolean deletarProduto(int idProduto) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Delete From Produto Where ID_Produto = ?");
            query.setInt(1, idProduto);
            query.execute();
            sucesso = true;
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
           sucesso = false;
        }
        
        return sucesso;
    }
    
    public void atualizarProduto(Produto produto) throws SQLException {
        try {
            conn = Conexao.abreConexao();
            query = (PreparedStatement) conn.prepareStatement("Update Produto Set ID_TipoProduto = ?, Nome = ?, VL_Pago = ?, VL_Venda = ?, Quantidade = ? Where ID_Produto = ?");
            query.setInt(1, produto.getTipoProduto().getIdTipoProduto());
            query.setString(2, produto.getNome());
            query.setDouble(3, produto.getVL_Pago());
            query.setDouble(4, produto.getVL_Venda());
            query.setInt(5,  produto.getQuantidade());
            query.setInt(6, produto.getIdProduto());
            query.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
