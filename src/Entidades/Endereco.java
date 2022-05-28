package Entidades;

/**
 *
 * @author Humberto Ramone
 */
public class Endereco {
    private String Cep;
    private String logradouro;
    private String bairro;
    private String localidade; //cidade
    private String uf;
    private String complemento;
    private int numero;
    
    public String getCep(){
        return this.Cep;
    }
    
    public void setCep(String cep){
        this.Cep = cep;
    }
    
    public String getLogradouro(){
        return this.logradouro;
    }
    
    public void setLogradouro(String endereco){
        this.logradouro = endereco;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getLocalidade(){
        return this.localidade;
    }
    
    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
    
    public String getUf(){
        return this.uf;
    }
    
    public void setUf(String uf){
        this.uf = uf;
    }
    
    public String getComplemento(){
        return this.complemento;
    }
    
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
}
