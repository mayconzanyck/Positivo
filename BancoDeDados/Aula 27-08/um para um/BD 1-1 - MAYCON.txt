#Criar o banco de dados
#ctrl + enter
CREATE DATABASE DB_UM_PARA_UM;


#Seleção do banco de dados
USE DB_UM_PARA_UM;


#Criação das tabelas
CREATE TABLE MARIDOS (
	#integer(tipo de campo inteiro +-), pk(chave primaria), not_null(não pode ser nulo/ obrigatorio), auto_increment(criar automaticamente o id e autoincrementa, numera sozinho).
	id_marido INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    #varchar(até quarenta caracteres), not_null(obrigatorio).
	nome_marido VARCHAR(40) NOT NULL,
    #datetime(gravar a data e a hora).
	data_nasc_marido DATETIME
);


CREATE TABLE ESPOSAS (
	#integer(tipo de campo inteiro), pk(chave primaria), not_null(obrigatorio), auto_increment(autoincrementa).
	id_esposa INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
    #coloca fk no final para identificar que é um campo diferente puxado de outra tabela, inteiro, obrigatorio, unique(id_marido unico, por ser um para um).
	id_marido_fk INTEGER NOT NULL UNIQUE,
    #tamanho até 40, obrigatório.
	nome_esposa VARCHAR(40) NOT NULL,
    #date(somente a data).
	data_nasc_esposa DATE,
    #data, obrigatorio.
	dt_casa_marido_esposa DATE NOT NULL,
    #chave estangeira id_marido_fk que faz referencia ao id_marido da tabela maridos.
	FOREIGN KEY(id_marido_fk) REFERENCES MARIDOS
    #on update(se alterar o id do marido, automaticamente altera no id_marido_fk), on delete(se apagar um marido, apaga a esposa tambem).
    (id_marido) on update cascade on delete cascade
);


#describe(visualizar as tabelas criadas).
describe maridos;
describe esposas;


#insert into(inserir registros na tabela), values(valores).
insert into maridos(nome_marido,data_nasc_marido) values
('Leandro','1985-03-31'),
('João','1970-05-15'),
#sempre no ultimo registro ;.
('José','1950-12-30');
#select * from(mostrar os registros dos maridos).
#select(comando para fazer pesquisas).
#from(de onde deseja ver).
select * from maridos;


#inserir registros, valores
insert into esposas(nome_esposa,data_nasc_esposa,
id_marido_fk,dt_casa_marido_esposa) values
('Carolina','1982-10-09','1','2007-06-09'),
('Maria','1973-06-18','2','2000-01-15'),
('Maricota','1955-07-21','3','1975-03-05');

#mostrar os registros das esposas
select * from esposas;


#inserir registro de esposa sem marido cadastrado ele nao sera incluido(pois nao tem marido n10, ele nao existe).
insert into esposas(nome_esposa,data_nasc_esposa,
id_marido_fk,dt_casa_marido_esposa) values
('Jo','1990-12-31','10','2010-01-20');


/*inserir registro de esposa com id de chave primária 
de marido duplicado(da erro pois ele é unique, nao pode cadastrar duas esposas em um marido)*/
insert into esposas(nome_esposa,data_nasc_esposa,
id_marido_fk,dt_casa_marido_esposa) values
('Jo','1990-12-31','2','2010-01-20');


# listar maridos e esposas relacionando chave primária com a chave estrangeira(buscando as duas ao mesmo tempo).
#where(enquanto id_marido_fk = id_marido, selecionando os iguais).
select dt_casa_marido_esposa,nome_esposa,
nome_marido from esposas,maridos
where id_marido_fk = id_marido;


#apagar chave primária garantindo o on delete cascade.
#apagar na tabela maridos, manda apagar o id 3.
delete from maridos
where id_marido = 3;
