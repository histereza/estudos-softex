USE loja;

CREATE TABLE compra(
	id_compra int not null auto_increment primary key,
    num_itens int not null,
    valor_total decimal(10,2),
    desconto decimal(10,2));
    
-- TRIGGER --
CREATE TRIGGER tr_desconto BEFORE INSERT ON compra FOR EACH ROW 
SET new.desconto = (new.valor_total - (new.valor_total * 0.15));

INSERT INTO compra (num_itens, valor_total) values (2, 70.00), (8, 450.00), (12, 560.00);

SELECT * FROM compra;

