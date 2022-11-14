USE loja;
ALTER TABLE compra ADD COLUMN data_compra DATE;

CREATE PROCEDURE bomdia(date_report date) 
SELECT COUNT(id_compra) AS Número_de_Compras_Hoje FROM compra WHERE data_compra = date_report;

CALL bomdia('2022-06-10');