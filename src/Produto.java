/**
 *
 * @author Felipe
 */
public class Produto {
    private int ID_Produto;
    private String Nome;
    private String TipoProduto;
    private int Quantidade;
    private double VL_Pago;
    private double VL_Venda;
            
    public Produto(){}
    
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
    
    public String getTipoProduto(){
        return TipoProduto;
    }
    public void setTipoProduto(String tipoProduto){
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
}
