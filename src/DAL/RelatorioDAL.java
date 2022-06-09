package DAL;

import Entidades.Relatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Humberto
 */
public class RelatorioDAL {
    private Connection conn;
    private PreparedStatement query;
    private ResultSet res;
    
    public ArrayList<Relatorio> listarRelatorio(Date inicio, Date fim) throws SQLException{
        
        ArrayList<Relatorio> relatorios = new ArrayList<>();
        
        try {
            conn = Conexao.abreConexao();
            // 
            query = conn.prepareStatement("Select P.ID_Pedido,C.Nome,FP.Descricao,PS.Descricao,P.DT_Venda,PR.Nome,IP.Quantidade,IP.SubTotal From Pedido As P Inner Join Cliente As C On P.ID_Cliente = C.ID_Cliente Inner Join ItemPedido As IP On P.ID_Pedido = IP.ID_Pedido	Inner Join Produto as PR On IP.ID_Produto = PR.ID_Produto Inner Join FormaPagamento As FP On P.ID_FormaPagamento = FP.ID_FormaPagamento	Inner Join PedidoStatus As PS On PS.ID_PedidoStatus = P.ID_PedidoStatus Where P.DT_Venda >= ? && P.DT_Venda <= ? Order By P.ID_Pedido");
            query.setDate(1, new java.sql.Date(inicio.getTime()));
            query.setDate(2, new java.sql.Date(fim.getTime()));
            res = query.executeQuery();
            
            while(res.next()){
                Relatorio r = new Relatorio();
                r.IdPedido = res.getInt("P.ID_Pedido");
                r.NomeCliente = res.getString("C.Nome");
                r.FormaPagamento = res.getString("FP.Descricao");
                r.PedidoStatus = res.getString("PS.Descricao");
                r.DataVenda = res.getString("P.DT_Venda");
                r.NomeProduto = res.getString("PR.Nome");
                r.Quantidade = res.getInt("IP.Quantidade");
                r.Total = res.getDouble("IP.SubTotal");
                
                relatorios.add(r);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return relatorios;
    }
    
    public ArrayList<Relatorio> listarRelatorio() throws SQLException{
        
        ArrayList<Relatorio> relatorios = new ArrayList<>();
        
        try {
            conn = Conexao.abreConexao();
            // 
            query = conn.prepareStatement("Select P.ID_Pedido,C.Nome,FP.Descricao,PS.Descricao,P.DT_Venda,PR.Nome,IP.Quantidade,IP.SubTotal From Pedido As P Inner Join Cliente As C On P.ID_Cliente = C.ID_Cliente Inner Join ItemPedido As IP On P.ID_Pedido = IP.ID_Pedido	Inner Join Produto as PR On IP.ID_Produto = PR.ID_Produto Inner Join FormaPagamento As FP On P.ID_FormaPagamento = FP.ID_FormaPagamento	Inner Join PedidoStatus As PS On PS.ID_PedidoStatus = P.ID_PedidoStatus Order By P.ID_Pedido");
            res = query.executeQuery();
            
            while(res.next()){
                Relatorio r = new Relatorio();
                r.IdPedido = res.getInt("P.ID_Pedido");
                r.NomeCliente = res.getString("C.Nome");
                r.FormaPagamento = res.getString("FP.Descricao");
                r.PedidoStatus = res.getString("PS.Descricao");
                r.DataVenda = res.getString("P.DT_Venda");
                r.NomeProduto = res.getString("PR.Nome");
                r.Quantidade = res.getInt("IP.Quantidade");
                r.Total = res.getDouble("IP.SubTotal");
                
                relatorios.add(r);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
        }
        
        return relatorios;
    }
}
