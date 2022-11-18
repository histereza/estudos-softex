USE loja;

CREATE TABLE clientes (
	id_cliente int not null auto_increment primary key,
    nome varchar(50),
    cpf varchar(11),
    telefone varchar(11),
    email varchar(50),
    compras int,
    data_compra datetime,
    
    CONSTRAINT fk_compras FOREIGN KEY (compras) REFERENCES compra(id_compra));
    
INSERT INTO clientes(nome, cpf, telefone, email, compras, data_compra)
VALUES ('maria', '0000000000', '00000000000', 'maria@gmail.com', 2,'2022-06-10');
    
-- CRIANDO FUNÇÃO -- 
DELIMITER $$
CREATE FUNCTION fn_contar_clientes(pesquisa_data date)
RETURNS int
DETERMINISTIC
BEGIN 
DECLARE num_clientes int;
SELECT COUNT(id_cliente) FROM clientes WHERE data_compra = pesquisa_data INTO num_clientes;
RETURN num_clientes;
END; $$


SELECT fn_contar_clientes('2022-06-10') AS 'Total de clientes';

