
Drop Database HSSolution

Create Database HSSolution

Use HSSolution

Create Table TipoUsuario
(
     ID_TipoUsuario Int
    ,Nome 	    Varchar(100) Not Null
    ,Primary Key(ID_TipoUsuario)
)

Insert Into TipoUsuario
    Values (1, 'Administrador'), (2, 'Atendente')

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
    ,Constraint UC_Usuario Unique (Login)
    ,Constraint UC_Email Unique (Email)
    ,Constraint FK_ID_TipoUsuario Foreign Key (ID_TipoUsuario) References TipoUsuario (ID_TipoUsuario)
)

Create Table TipoCliente
(
     ID_TipoCliente Int
    ,Nome           Varchar(50) Not Null
    ,Primary Key (ID_TipoCliente)
)

Insert Into TipoCliente
	Values(1, 'Física'),(2, 'Jurídica')

Create Table Cliente (
	 ID_Cliente Int Auto_Increment
    ,Nome           Varchar(100) Not Null
    ,Email          Varchar(100) Not Null
    ,DT_Nasc        Date         Not Null
    ,Telefone       Varchar(20)  Not Null
    ,ID_TipoCliente Int          Not Null
    ,CpfCnpj        Varchar(14)  Not Null
    ,Cep            Varchar(8)
    ,Endereco       Varchar(100)
    ,Bairro         Varchar(50)
    ,Cidade         Varchar(50)
    ,Uf             Varchar(2)
    ,Numero         Varchar(20)
    ,Complemento    Varchar(50)
    
    ,Primary Key (ID_Cliente)
    ,Constraint FK_ID_TipoCliente Foreign Key (ID_TipoCliente) References TipoCliente (ID_TipoCliente)
)

Create Table TipoProduto 
(
	ID_TipoProduto		Int Auto_Increment
	,Categoria		Varchar(100) Not Null

	,Primary Key (ID_TipoProduto)
)

Create Table Produto 
(
	 ID_Produto			Int Auto_Increment
	,ID_TipoProduto			Int Not Null
	,Nome				Varchar(100) Not Null
	,VL_Pago			Numeric(10,5) Not Null
	,VL_Venda			Numeric(10,5) Not Null
	,Quantidade			Int Null
	,ID_UsuarioCadastro		Int Not Null

	,Primary Key (ID_Produto)
	,Constraint FK_ID_TipoProduto   Foreign Key (ID_TipoProduto)     References TipoProduto(ID_TipoProduto)
	,Constraint FK_ID_Usuario       Foreign Key (ID_UsuarioCadastro) References Usuario(ID_Usuario)
)

Create Table PedidoStatus 
(
	 ID_PedidoStatus Int Not Null
	,Descricao	Varchar(50)
    
    ,Primary Key(ID_PedidoStatus)
)

Insert PedidoStatus 
	Values (1,'Em Processamento'),(2,'Pagamento Pendente'),(3,'Finalizado')
    
Create Table FormaPagamento
(
	 ID_FormaPagamento	Int
	,Descricao		Varchar(50) NOT NULL

	,Primary Key (ID_FormaPagamento)
)

Insert FormaPagamento 
	Values (1,'Dinheiro'),(2,'Debito'),(3,'Pix'),(4,'Crédito'),(5, 'Outro')

Create Table Pedido 
(
	 ID_Pedido              Int Auto_Increment
	,ID_Cliente		Int Not Null
	,ID_FormaPagamento	Int Null
	,ID_PedidoStatus        Int Not Null
	,ID_Usuario		Int Not Null
	,DT_Venda		DateTime Null
	,VL_Total		Float

	,Primary Key  (ID_Pedido)
	,Constraint FK_ID_PedidoStatus   Foreign Key (ID_PedidoStatus)   References PedidoStatus (ID_PedidoStatus)
	,Constraint FK_ID_Cliente_Pedido        Foreign Key (ID_Cliente)        References Cliente(ID_Cliente)
	,Constraint FK_ID_FormaPagamento Foreign Key (ID_FormaPagamento) References FormaPagamento (ID_FormaPagamento)
)

Create Table ItemPedido
(
	 ID_ItemPedido		Int Auto_Increment
	,ID_Pedido		Int Not Null
	,ID_Produto		Int Not Null
	,Quantidade		Int Not Null
	,SubTotal		Float Not Null

	,Primary Key (ID_ItemPedido)
	,Constraint FK_ID_Pedido     Foreign Key (ID_Pedido) References Pedido (ID_Pedido)
	,Constraint FK_ID_Produto    Foreign Key(ID_Produto) References Produto (ID_Produto)
)

Select P.ID_Pedido,C.Nome,FP.Descricao,PS.Descricao,P.DT_Venda,PR.Nome,IP.Quantidade,IP.SubTotal From Pedido As P Inner Join Cliente As C On P.ID_Cliente = C.ID_Cliente Inner Join ItemPedido As IP On P.ID_Pedido = IP.ID_Pedido	Inner Join Produto as PR On IP.ID_Produto = PR.ID_Produto Inner Join FormaPagamento As FP On P.ID_FormaPagamento = FP.ID_FormaPagamento	Inner Join PedidoStatus As PS On PS.ID_PedidoStatus = P.ID_PedidoStatus	Where P.DT_Venda >= '2019-02-01' && P.DT_Venda <= '2022-12-31' Order By P.ID_Pedido

Select   P.ID_Pedido             As 'Numero Pedido'
	,C.Nome                  As 'Nome Cliente'
        ,FP.Descricao
        ,PS.Descricao
        ,P.DT_Venda
        ,PR.Nome 		As 'Nome Produto' 
        ,IP.Quantidade
        ,IP.SubTotal            As Total
	From Pedido As P
        Inner Join Cliente As C
		On P.ID_Cliente = C.ID_Cliente
	Inner Join ItemPedido As IP
		On P.ID_Pedido = IP.ID_Pedido
	Inner Join Produto as PR
		On IP.ID_Produto = PR.ID_Produto
	Inner Join FormaPagamento As FP
		On P.ID_FormaPagamento = FP.ID_FormaPagamento
	Inner Join PedidoStatus As PS
		On PS.ID_PedidoStatus = P.ID_PedidoStatus
	Where P.DT_Venda >= '2019-02-01' && P.DT_Venda <= '2022-12-31'
    Order By P.ID_Pedido

    
