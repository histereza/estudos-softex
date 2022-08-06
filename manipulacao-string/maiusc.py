#codigo01 - validação de dados
nome = (input('Nome: '))
idade = int(input('Idade: '))
sexo = input('Sexo: ').upper()[0] #converte a string em letras maiúsula e pega apenas a primeira letra
if sexo in 'MF':
    print('Dados: ', nome, idade, sexo)
else:
    print('Você deve digitar somente M ou F para sexo.')
