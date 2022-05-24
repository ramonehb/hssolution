/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entidades.Usuario;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Humberto Ramone
 */
public class UsuarioDAL extends Conexao {

    private Connection conn;
    private PreparedStatement query;
    private PreparedStatement use;
    private ResultSet res;

    public boolean autenticacao(String login, String senha) throws SQLException {
        boolean sucesso = false;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Select * From Usuario Where Login = ? And Senha = ?");
            query.setString(1, login);
            query.setString(2, senha);
             
            res = query.executeQuery();
            if (res.next())
                sucesso = true;
            
        } catch (SQLException e) {
            sucesso = false;
        }catch (Exception e) {
            sucesso = false;
        }

        return sucesso;
    }

    public boolean criarUsuario(Usuario usuario) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            assert conn != null;
            use = conn.prepareStatement("Use HSSolution");
            use.executeQuery();
            query = conn.prepareStatement("Insert Into Usuario"+
                                                    "Values (?, ?, ?, ?, ?, ?)");
            query.setString(1, usuario.nome);
            query.setString(2, usuario.login);
            query.setString(3, usuario.senha);
            query.setString(4, usuario.email);
            query.setString(5, usuario.telefone);
            query.setBoolean(6, usuario.flHabilitado);
            
            sucesso = query.execute();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        } finally {
            use.close();
            query.close();
            conn.close();
        }

        return sucesso;
    }

    public boolean atualizarUsuario(Usuario usuario) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            assert conn != null;
            use = conn.prepareStatement("Use HSSolution");
            use.executeQuery();
            query = conn.prepareStatement("Update Usuario "
                    + "Set Nome = ?"
                    + ",Login = ?"
                    + ",Senha = ?"
                    + ",Email = ?"
                    + ",Telefone"
                    + ",FL_Habilitado = ?"
                    + "Where ID_Usuario = ?");
            query.setString(1, usuario.nome);
            query.setString(2, usuario.login);
            query.setString(3, usuario.senha);
            query.setString(4, usuario.email);
            query.setString(5, usuario.telefone);
            query.setBoolean(6, usuario.flHabilitado);
            query.setInt(7, usuario.idUsuario);

            sucesso = query.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        } finally {
            use.close();
            query.close();
            conn.close();
        }

        return sucesso;
    }
    
    public ArrayList<Usuario> listarUsuarios() throws SQLException {
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            conn = Conexao.abreConexao();
            assert conn != null;
            use = conn.prepareStatement("USE HSSolution");
            use.executeQuery();
            query = conn.prepareStatement("SELECT * "+
                                                "FROM Usuario");
            res = query.executeQuery();

            while (res.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(res.getInt("ID_Usuario"));
                u.setNome(res.getString("Nome"));
                u.setLogin(res.getString("Login"));
                u.setSenha(res.getString("Senha"));
                u.setEmail(res.getString("Email"));
                u.setTelefone(res.getString("Telefone"));
                u.setFlHabilitado(res.getBoolean("FL_Habilitado"));
                usuarios.add(u);
            }            
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
        }finally {
            conn.close();
            use.close();
            query.close();
            res.close();
        }
        
        return usuarios;
    }
    
    public boolean deletarUsuario(int idUsuario) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            assert conn != null;
            use = conn.prepareStatement("Use HSSolution");
            use.executeQuery();
            query = conn.prepareStatement("Delete From Usuario "+
                                          "Where ID_Usuario = ?");
            query.setInt(1, idUsuario);
            sucesso = query.execute();
           
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
           sucesso = false;
        }finally {
            conn.close();
            use.close();
            query.close();
        }
        
        return sucesso;
    }
}
