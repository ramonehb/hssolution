package Entidades;

/**
 *
 * @author Humberto Ramone
 */
public class Endereco {
    private String Cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String Complemento;
    private int Numero;

     public String getCep(){
        return this.Cep;
    }
    
    public void setCep(String cep){
        this.Cep = cep;
    }
    
    public String getEndereco(){
        return this.logradouro;
    }
    
    public void setEndereco(String endereco){
        this.logradouro = endereco;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
       
    public String getCidade(){
        return this.localidade;
    }
    
    public void setCidade(String cidade){
        this.localidade = cidade;
    }
    
    public String getUf(){
        return this.uf;
    }
    
    public void setUf(String uf){
        this.uf = uf;
    }
    
    public String getComplemento(){
        return this.Complemento;
    }
    
    public void setComplemento(String complemento){
        this.Complemento = complemento;
    }
    
    public int getNumero(){
        return this.Numero;
    }
    
    public void setNumero(int numero){
        this.Numero = numero;
    }
    
   
}
