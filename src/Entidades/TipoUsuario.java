package Entidades;

/**
 *
 * @author Humberto Ramone
 */
public class TipoUsuario {
    private int ID_TipoUsuario;
    private String Nome;
    
    public int getIdTipoUsuario(){
        return ID_TipoUsuario;
    }
    public void setIdTipoUsuario(int id){
        this.ID_TipoUsuario = id;
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
}