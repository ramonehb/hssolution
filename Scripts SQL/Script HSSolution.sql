Create DataBase HSSolution

Use HSSolution

Create Table Usuario 
(
	 ID_Usuario Int Auto_Increment
    ,Nome 			Varchar(100) Not Null
    ,Login 			Varchar(20) Not Null 
    ,Senha 			Varchar(64) Not Null
    ,Email			Varchar(64) Not Null 
    ,Telefone                   Varchar(20) Null
    ,FL_Habilitado              Bit
    
    ,Constraint UC_Usuario Unique (Login,Email)
    ,Primary Key (ID_Usuario)
)

Insert Into Usuario (Nome, Login, Senha, Email, Telefone, FL_Habilitado)
	Values ('Felipe Narcizo', 'felipe', '321', 'felipe.narcizo@hssolution.com.br', '1199873749488', 1)
    
Select * From Usuario