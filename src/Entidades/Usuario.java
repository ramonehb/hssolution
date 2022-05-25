package Entidades;

/**
 *
 * @author Humberto Ramone
 */
public class Usuario {
    private int idUsuario;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private String telefone;
    private boolean flHabilitado;
    private int idTipoUsuario;
    private boolean logado;
    
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
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
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
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public boolean getFlHabilitado(){
        return flHabilitado ;
    }
    public void setFlHabilitado(boolean habilitado){
        this.flHabilitado = habilitado;
    }
    
    public int getTipoUsuario(){
        return idTipoUsuario;
    }
    public void setTipoUsuario(int id){
        this.idTipoUsuario = id;
    }
     public boolean getLogado(){
        return logado ;
    }
    public void setLogado(boolean logado){
        this.logado = logado;
    }
    
    public String toString() {
        return "";
    }
}
