anoValido = False
ano = 0
while (anoValido == False):
    try:
        nome = input("Nome: ")
        ano = int(input("Ano de Nascimento: "))
        if (ano >= 1922):
            idade = 2022 - ano
            anoValido = True
            print(f"{nome} fará {idade} anos em 2022.")
        else:
            print("Digite um ano válido.")
    except:
        print("Você não digitou um ano.")
