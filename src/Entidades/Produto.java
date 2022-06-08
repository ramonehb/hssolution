package Entidades;

import java.util.Date;

/**
 *
 * @author Felipe
 */
public class Produto {
    private int ID_Produto;
    private String Nome;
    private TipoProduto TipoProduto;
    private int ID_UsuarioCadastro;
    private int Quantidade;
    private double VL_Pago;
    private double VL_Venda;
            
    public Produto(){}
    
    public Produto(TipoProduto tipoProduto){
        this.TipoProduto = new TipoProduto();
    }
    
    //Mostrar valor
    public int getIdProduto(){
        return ID_Produto;
    }
    public void setIdProduto(int id){
        this.ID_Produto = id;
    }
    
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public TipoProduto getTipoProduto(){
        return TipoProduto;
    }
    public void setTipoProduto(TipoProduto tipoProduto){
        this.TipoProduto = tipoProduto;
    }
    
    public int getQuantidade(){
        return Quantidade;
    }
    public void setQuantidade(int quantidade){
        this.Quantidade = quantidade;
    }
    
    public double getVL_Pago(){
        return VL_Pago;
    }
    public void setVL_Pago(double vlPago){
        this.VL_Pago = vlPago;
    }
    
    public double getVL_Venda(){
        return VL_Venda;
    }
    public void setVL_Venda(double vlVenda){
        this.VL_Venda = vlVenda;
    }
    
     public int getIdUsuarioCadastro(){
        return ID_UsuarioCadastro;
    }
    public void setIdUsuarioCadastro(int id){
        this.ID_UsuarioCadastro = id;
    }
}
