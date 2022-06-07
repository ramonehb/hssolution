/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Elco
 */
public class TipoCliente {
    private int ID_TipoCliente;
    private String Nome;
    
    public int getIdTipoCliente(){
        return ID_TipoCliente;
    }
    public void setIdTipoCliente(int id){
        this.ID_TipoCliente = id;
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
}
