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
    private TipoCliente TipoCliente;
    private String CpfCnpj;
    private Endereco Enderco;
    
    public Cliente(){}
    
    public Cliente(TipoCliente tipoCliente){
        this.TipoCliente = new TipoCliente();
    }
    
    public Cliente(Endereco endereco){
        this.Enderco = new Endereco();
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
    
    public TipoCliente getTipoCliente(){
        return TipoCliente;
    }
    
    public void setTipoCliente(TipoCliente tipoCliente){
        this.TipoCliente = tipoCliente;
    }
    
    public String getCpfCnpj(){
        return this.CpfCnpj;
    }
    public void setCpfCnpj(String cpfCnpj){
        this.CpfCnpj = cpfCnpj;
    }    
    
    public Endereco getEndereco(){
        return this.Enderco;
    }
    public void setEndereco(Endereco endereco){
        this.Enderco = endereco;
    }
}
