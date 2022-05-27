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
    ,Constraint UC_Usuario Unique (Login,Email)
    ,Constraint FK_ID_TipoUsuario Foreign Key (ID_TipoUsuario) References TipoUsuario (ID_TipoUsuario)
    ,Primary Key (ID_Usuario)
)

Create Table Cliente (
	 ID_Cliente Int Auto_Increment
    ,Nome           Varchar(100) Not Null
    ,Email          Varchar(100) Not Null
    ,DT_Nasc        Date         Null
    ,Telefone       Varchar(11)  Not Null
    ,TP_Cliente     Varchar(10)  Not Null
    ,CpfCnpj        Varchar(14)  Not Null
    ,Cep            Varchar(8)
    ,Endereco       Varchar(100)
    ,Bairro         Varchar(50)
    ,Cidade         Varchar(50)
    ,Estado         Varchar(2)
    
    ,Primary Key (ID_Cliente)
)



    
    
