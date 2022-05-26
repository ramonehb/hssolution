/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author SAMUEL
 */
public class Cliente {
    
    private int ID_Cliente;
    private String Nome;
    private String Email;
    private Date DT_Nasc;
    private String Telefone;
    private String TP_Cliente;
    private String CpfCnpj;
    private String Cep;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String Estado;
    
    public Cliente(){
    }
    
    public int getIdCliente(){
        return this.ID_Cliente;
    }
    
    public void setIdCliente(int id){
        this.ID_Cliente = id;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public String getEmail(){
        return this.Email;
    }
    
    public void setEmail(String email){
        this.Email = email;
    }
    
    public Date getDataNascimento(){
        return this.DT_Nasc;
    }
    
    public void setDataNascimento(Date dtNascimento){
        this.DT_Nasc = dtNascimento;
    }
    
    public String getTelefone(){
        return this.Telefone;
    }
    
    public void setTelefone(String telefone){
        this.Telefone = telefone;
    }
    
    public String getTpCliente(){
        return this.TP_Cliente;
    }
    
    public void setTpCliente(String tpCliente){
        this.TP_Cliente = tpCliente;
    }
    
    public String getCpfCnpj(){
        return this.CpfCnpj;
    }
    
    public void setCpfCnpj(String cpfCnpj){
        this.CpfCnpj = cpfCnpj;
    }
    
    public String getCep(){
        return this.Cep;
    }
    
    public void setCep(String cep){
        this.Cep = cep;
    }
    
    public String getEndereco(){
        return this.Endereco;
    }
    
    public void setEndereco(String endereco){
        this.Endereco = endereco;
    }
    
    public String getBairro(){
        return this.Bairro;
    }
    
    public void setBairro(String bairro){
        this.Bairro = bairro;
    }
    
    public String getCidade(){
        return this.Cidade;
    }
    
    public void setCidade(String cidade){
        this.Cidade = cidade;
    }
    
    public String getEstado(){
        return this.Estado;
    }
    
    public void setEstado(String estado){
        this.Estado = estado;
    }
    
}
