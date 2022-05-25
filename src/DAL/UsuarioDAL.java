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
    private ResultSet res;

    public Usuario autenticacao(String login, String senha) throws SQLException {
        Usuario usuario = new Usuario();
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Select * From Usuario Where Login = ? And Senha = ? Limit 1");
            query.setString(1, login);
            query.setString(2, senha);
             
            res = query.executeQuery();
            while (res.next()){
                usuario.setIdUsuario(res.getInt("ID_Usuario"));
                usuario.setLogin(res.getString("Login"));
                usuario.setTipoUsuario(res.getInt("ID_TipoUsuario"));
                usuario.setLogado(true);
            }
            
        } catch (SQLException e) {
            return null;
        }catch (Exception e) {
            return null;
        }

        return usuario;
    }

    public boolean criarUsuario(Usuario usuario) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Insert Into Usuario (Nome, Login, Senha, Email, Telefone, FL_Habilitado, ID_TipoUsuario) Values (?, ?, ?, ?, ?, ?, ?)");
            query.setString(1, usuario.getNome());
            query.setString(2, usuario.getLogin());
            query.setString(3, usuario.getSenha());
            query.setString(4, usuario.getEmail());
            query.setString(5, usuario.getTelefone());
            query.setBoolean(6, usuario.getFlHabilitado());
            query.setInt(7, usuario.getTipoUsuario());
            query.execute();
            sucesso = true;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
    }

    public boolean atualizarUsuario(Usuario usuario) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Update Usuario Set Nome = ?, Login = ?, Senha = ?, Email = ?, Telefone = ?, FL_Habilitado = ?, ID_TipoUsuario = ? Where ID_Usuario = ?");
            query.setString(1, usuario.getNome());
            query.setString(2, usuario.getLogin());
            query.setString(3, usuario.getSenha());
            query.setString(4, usuario.getEmail());
            query.setString(5,  usuario.getTelefone());
            query.setBoolean(6, usuario.getFlHabilitado());
            query.setInt(7, usuario.getIdUsuario());
            query.setInt(8, usuario.getTipoUsuario());
            query.execute();
            sucesso = true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
            sucesso = false;
        }
        
        return sucesso;
    }
    
    public ArrayList<Usuario> listarUsuarios() throws SQLException {
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("SELECT * FROM Usuario");
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
        }
        
        return usuarios;
    }
    
    public boolean deletarUsuario(int idUsuario) throws SQLException {
        boolean sucesso;
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Delete From Usuario Where ID_Usuario = ?");
            query.setInt(1, idUsuario);
            query.execute();
            sucesso = true;
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
           sucesso = false;
        }
        
        return sucesso;
    }
    
    public ResultSet listaTipoUsuario(){
        try {
            conn = Conexao.abreConexao();
            query = conn.prepareStatement("Select * From TipoUsuario");
            return query.executeQuery();
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Contate o adminsitrador", JOptionPane.INFORMATION_MESSAGE);
           return null;
        }
    }
}
