/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author 55119
 */
public class Usuario {
     public int idUsuario;
    public String nome;
    public String login;
    public String senha;
    public String email;
    public String telefone;
    
    public Usuario(){}
    
    public int getIdUsuario(){
        return idUsuario;
    }
    public void setIdUsuario(int id){
        this.idUsuario = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String user){
        this.login = user;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String pass){
        this.senha = pass;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
     public String getTelefone(){
        return email;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
