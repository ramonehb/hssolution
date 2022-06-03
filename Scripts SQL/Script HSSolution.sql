Create Database HSSolution

Use HSSolution

Create Table TipoUsuario
(
     ID_TipoUsuario Int
    ,Nome 	    Varchar(100) Not Null
    ,Primary Key(ID_TipoUsuario)
)

Insert Into TipoUsuario(ID_TipoUsuario, Nome) 
    Values (1, 'Administrador')
Insert Into TipoUsuario(ID_TipoUsuario, Nome)
    Values (2, 'Atendente')

Create Table Usuario 
(
     ID_Usuario Int Auto_Increment
    ,Nome           Varchar(100) Not Null
    ,Login          Varchar(20) Not Null 
    ,Senha          Varchar(64) Not Null
    ,Email          Varchar(64) Not Null 
    ,Telefone       Varchar(20) Null
    ,FL_Habilitado  Bit
    ,ID_TipoUsuario Int

    ,Primary Key (ID_Usuario)
    ,Constraint UC_Usuario Unique (Login,Email)
    ,Constraint FK_ID_TipoUsuario Foreign Key (ID_TipoUsuario) References TipoUsuario (ID_TipoUsuario)
)

Create Table TipoCliente
(
     ID_TipoCliente Int
    ,Nome           Varchar(50) Not Null
    ,Primary Key (ID_TipoCliente)
)

Insert Into TipoCliente(ID_TipoCliente, Nome)
	Values(1, 'Física'),2, 'Jurídica')
Create Table ClienteEndereco
(
    ID_Endereco Int Auto
)

Create Table Cliente (
	 ID_Cliente Int Auto_Increment
    ,Nome           Varchar(100) Not Null
    ,Email          Varchar(100) Not Null
    ,DT_Nasc        Date         Not Null
    ,Telefone       Varchar(20)  Not Null
    ,ID_TipoCliente Int          Not Null
    ,CpfCnpj        Varchar(14)  Not Null
    
    ,Primary Key (ID_Cliente)
    ,Constraint FK_ID_TipoCliente Foreign Key (ID_TipoCliente) References TipoCliente (ID_TipoCliente)
    
)

Create Table Tipo_Produto 
(
	,ID_TipoProduto		Int
	,Categoria		Varcgar(100) Not Null

	,Primary Key (ID_Cliente)
)

Create Table Produto 
(
	 ID_Produto			Int Auto_Increment
	,ID_TipoProduto			Int Not Null
	,Nome				Varchar(100) Not Null
	,VL_Pago			Numeric(10,5) Not Null
	,VL_Venda			Numeric(10,5) Not Null
	,Lucro				As (IsNull(VL_Venda, 0) - IsNull(VL_Pago, 0 ))
	,Quantidade			Int Null
	,ID_UsuarioCadastro		Int Not Null

	,Primary Key (ID_Produto)
	,Constraint FK_ID_TipoProduto   Foreign Key (ID_TipoProduto)     References Tipo_Produto(ID_TipoProduto)
	,Constraint FK_ID_Usuario       Foreign Key (ID_UsuarioCadastro) References Usuario(ID_Usuario)
)
Create Table PedidoStatus 
(
	ID_PedidoStatus Int Not Null,
	Descricao	Varchar(50)
)

Insert PedidoStatus 
	Values (1,'Em Processamento'),(2,'Pagamento Pendente'),(3,'Finalizado')

Create Table Pedido 
(
	 ID_Pedido              Int Auto_Increment
	,ID_Cliente		Int Not Null
	,ID_FormaPagamento	Int Null
	,ID_PedidoStatus        Int Not Null
	,ID_Usuario		Int Not Null
	,DT_Venda		DateTime Null
	,VL_Total		Numeric(10,5) Null

	,Primary Key  (ID_Pedido)
	,Constraint FK_ID_PedidoStatus   Foreign Key (ID_PedidoStatus)   References PedidoStatus (ID_PedidoStatus)
	,Constraint FK_ID_Cliente        Foreign Key (ID_Cliente)        References Cliente(ID_Cliente)
	,Constraint FK_ID_FormaPagamento Foreign Key (ID_FormaPagamento) References FormaPagamento (ID_FormaPagamento)
)

Create Table ItemPedido
(
	 ID_ItemPedido		Int Auto_Increment
	,ID_Pedido		Int Not Null
	,ID_Produto		Int Not Null
	,Quantidade		Int Not Null
	,SubTotal		Numeric(10,5) Not Null

	,Primary Key (ID_ItemPedido),
	,Constraint FK_ID_Pedido     Foreign Key (ID_Pedido) References Pedido (ID_Pedido)
	,Constraint FK_ID_Produto    Foreign Key(ID_Produto) References Produto (ID_Produto)
)

Create Table FormaPagamento
(
	 ID_FormaPagamento	Int
	,Descricao		Varchar(50) NOT NULL

	,Primary Key (ID_FormaPagamento)
)

Insert FormaPagamento	
	Value (1,'Dinheiro'),(2,'Cartão Debito'),(3,'Cartão Crédito'),(4,'Pix')




    
    
