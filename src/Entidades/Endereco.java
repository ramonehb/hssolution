package Entidades;

/**
 *
 * @author Humberto Ramone
 */
public class Endereco {
    private String Cep;
    private String Endereco;
    private String Bairro;
    private String Cidade;
    private String Estado;
    
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
