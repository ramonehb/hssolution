package Entidades;

/**
 *
 * @author Humberto Ramone
 */
public class Usuario {
    private int ID_Usuario;
    private String Nome;
    private String Login;
    private String Senha;
    private String Email;
    private String Telefone;
    private boolean FL_Habilitado;
    private TipoUsuario TipoUsuario;
    private boolean Logado;
    
    public Usuario(){}
    
    public Usuario(TipoUsuario endereco){
        this.TipoUsuario = new TipoUsuario();
    }
    
    public int getIdUsuario(){
        return ID_Usuario;
    }
    public void setIdUsuario(int id){
        this.ID_Usuario = id;
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public String getLogin(){
        return Login;
    }
    public void setLogin(String login){
        this.Login = login;
    }
    
    public String getSenha(){
        return Senha;
    }
    public void setSenha(String pass){
        this.Senha = pass;
    }
    
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    
    public String getTelefone(){
        return Telefone;
    }
    public void setTelefone(String telefone){
        this.Telefone = telefone;
    }
    
    public boolean getFlHabilitado(){
        return FL_Habilitado ;
    }
    public void setFlHabilitado(boolean habilitado){
        this.FL_Habilitado = habilitado;
    }
    
    public TipoUsuario getTipoUsuario(){
        return TipoUsuario;
    }
    public void setTipoUsuario(TipoUsuario tipoUsuario){
        this.TipoUsuario = tipoUsuario;
    }
     public boolean getLogado(){
        return Logado;
    }
    public void setLogado(boolean logado){
        this.Logado = logado;
    }
}
