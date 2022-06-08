/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Felipe
 */
public class TipoProduto {
    private int IdTipoProduto;
    private String Nome;
    
    public int getIdTipoProduto(){
        return IdTipoProduto;
    }
    public void setIdTipoProduto(int id){
        this.IdTipoProduto = id;
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
}
