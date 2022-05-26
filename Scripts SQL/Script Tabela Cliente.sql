Create Table Cliente (
	 ID_Cliente Int Auto_Increment
    ,Nome			Varchar(100) Not Null
    ,Email			Varchar(100) Not Null
    ,DT_Nasc                    Date         Not Null
    ,Telefone                   Varchar(11)  Not Null
    ,TP_Cliente                 Varchar(10)  Not Null
    ,CpfCnpj                    Varchar(14)  Not Null
    ,Cep			Varchar(8)
    ,Endereco                   Varchar(100)
    ,Bairro			Varchar(50)
    ,Cidade			Varchar(50)
    ,Estado			Varchar(2)
    
    ,Primary Key (ID_Cliente)
)

Insert Into Cliente (Nome, Email, DT_Nasc, Telefone, TP_Cliente, CpfCnpj, Cep, Endereco, Bairro, Cidade, Estado)
	Values ('Samuel Carvalho', 'samuelcarvalho2000@gmail.com', '2000-04-29', '11973757445', 'Física', '49176399800', '03668070', 'Rua Olinda Peixoto', 'Vila Ré', 'São Paulo', 'SP')

