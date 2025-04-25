create database empresa;
use empresa;
CREATE TABLE clientes(
	id int NOT NULL AUTO_INCREMENT,
	nome varchar (40) NOT NULL,
	sexo enum ('M', 'F'),
	nascimento date,
	cidade varchar (20) DEFAULT 'Curitiba',
	uf char (2) DEFAULT 'PR',
	PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;

INSERT INTO clientes (id, nome, sexo, nascimento, cidade, uf)
VALUES ('1', 'Ana', 'F', '1990-06-15', 'Curitiba', 'PR');

INSERT INTO clientes (nome, sexo, nascimento, cidade, uf)
VALUES ('Beatriz', 'F', '1990-07-15', 'Campo Largo', 'PR');

INSERT INTO clientes VALUES
(default, 'Elaine', 'F', '1995-09-21', default, default),
(default, 'Fábio', 'M', '1995-10-22', 'Ponta Grossa', default),
(default, 'Gilberto', 'M', '1996-11-23', 'Santo André', 'SP');

INSERT INTO clientes(id, nome, sexo, nascimento, cidade, uf)
VALUES (default, 'Carlos', 'M', '1990-08-15', default, default);

INSERT INTO clientes (nome, sexo, nascimento, cidade, uf)
VALUES ('Henrique', 'M', null, 'Ortigueira', 'PR');

select * from clientes;
describe clientes;

alter table clientes drop column nascimento;
alter table clientes drop column cidade;
alter table clientes drop column uf;
describe clientes;


alter table clientes
add column idade smallint unsigned,
add column peso float,
add column bairro varchar (20),
add column telefone char(11);
describe clientes;

alter table clientes
modify column idade tinyint unsigned;
describe clientes;

select * from clientes;

UPDATE clientes SET 
    idade = 22,
    peso = 60,
    bairro = 'Centro',
    telefone = '9121-3040'
WHERE id = 1;

UPDATE clientes SET 
    idade = 34,
    peso = 55,
    bairro = 'Jardim Botânico',
    telefone = '9221-4030'
WHERE id = 2;

select * from clientes;


create table produtos(
	id int NOT NULL AUTO_INCREMENT,
	nome varchar(40) not null, 
	unidades_estoque int not null,
	preco float(6,2) not null,
	funcionario varchar(30) not null,
	observacao varchar(100),
	PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;
describe produtos;


insert into produtos values
(default,'Sabão em pó', 100, 9,'Alcir Jt.', null),
(default,'Sabão em barra', 277, 4.5, 'Maria Rita Amorim',
                        'Algumas barras estão avariadas'),
(default,'Vanish em pó 1 Kg', 70, 45, 'Alcir Jr.', null);
select * from produtos;
select * from clientes;

delete from produtos where id=1;
insert into produtos values
(1,'Sabão em pó', 100, 9,'Alcir Jr.',NULL);
select * from produtos;

insert into clientes values
(default,'Beatriz', 'F', 34, 55, 'Jardim Botânico', '9221-4030');
select * from clientes;

/**
 Delete:apagar registro duplicado da Beatriz 
 **/
delete from clientes where id=8;

ALTER TABLE clientes 
RENAME TO  clientes_old;
ALTER TABLE produtos 
RENAME TO  produtos_old;

ALTER TABLE clientes_old 
RENAME TO  clientes;
ALTER TABLE produtos_old 
RENAME TO  produtos;

Truncate clientes;
select * from clientes;

insert into clientes values
(default,'Marcelo', 'M', 52, 90, 'Novo Mundo', '99111-1111'),
(default,'João Pedro', 'M', 60, 77.5, 'Água Verdde', '99222-2222'),
(default,'Angélica', 'F', 28, 68, 'Rebouças', '9933-3333');
select * from clientes;


alter table clientes drop column bairro;
Alter table clientes add column email varchar(50);
describe clientes;


Update clientes SET
 email= 'marcelo@gmail.com' where id=1;
Update clientes SET
 email= 'jp22@outlook.com' where id=2;
Update clientes SET
 email= 'angel@hotmail.com' where id=3;

select * from clientes;

insert into clientes values
 (default,'Vitória', 'F', 65, 55, 'Centro', '994444444');
 
select * from clientes; 
Update clientes SET telefone= '99444-4445' where id=4;
Update clientes SET email= 'vick@live.com' where id=4;
select * from clientes;
select * from produtos;

Alter table produtos add column setor varchar(20);
describe produtos;

Update produtos SET
/*setor= 'limp pesada' where id= 1 or id= 2 or id= 3;*/
Update produtos SET setor= 'Limpeza' where id=1;
Update produtos SET setor= 'Limpeza' where id=2;
Update produtos SET setor= 'Limpeza' where id=3;
Update produtos SET unidades_estoque= '257' where id=2;
Update produtos SET preco= 40 where id=3;
select * from produtos;
