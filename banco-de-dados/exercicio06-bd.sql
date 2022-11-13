-- CRIAÇÃO DO BANCO DE DADOS E DAS TABELAS --
CREATE DATABASE biblioteca;
USE biblioteca;

CREATE TABLE aluno(
	id int not null auto_increment primary key,
    nome varchar(50),
    matricula int,
    email varchar(50),
    endereco varchar(100),
    telefone varchar(11));
    
CREATE TABLE emprestimo(
	codigo int not null auto_increment primary key,
    data_hora datetime,
    matric_aluno int,
    data_devolucao date,
    
    constraint fk_matric_aluno foreign key (matric_aluno) 
    references aluno(id));
    
CREATE TABLE livro(
	cod_livro int not null auto_increment primary key,
    titulo varchar(100),
    autor varchar(50),
    cod_sessao int,
    
    constraint fk_cod_sessao foreign key (cod_sessao)
    references sessao(codigo));
    
CREATE TABLE sessao(
	codigo int not null auto_increment primary key,
    descricao varchar(20),
    localizacao varchar(20));
    
CREATE TABLE livro_emprestimo(
	cod_livro int,
    cod_emprestimo int);
    
-- ALTERAÇÕES SOLICITADAS PELO EXERCÍCIO --
ALTER TABLE aluno ADD data_nascimento varchar(10);
ALTER TABLE aluno CHANGE telefone contato varchar(12);

ALTER TABLE livro ADD isbn int(13);
ALTER TABLE livro DROP COLUMN isbn;
