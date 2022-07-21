# programa que recebe notas, faltas, calcula a média e informa se o aluno está aprovado ou reprovado
nome = str(input("Digite o nome do aluno: "))
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a primeira nota: "))
faltas = int(input("Digite a quantidade de faltas: "))
media = (nota1 + nota2) / 2

if (faltas > 3) or (media < 7):
    print("Nome do aluno: " + nome)
    print("Situação: REPROVADO")
else:
    print("Nome do aluno: " + nome)
    print("Situação: APROVADO")
