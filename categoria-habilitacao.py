rodas = int(input("Informe a quantidade de rodas do veículo: "))
peso = float(input("Informe o peso bruto do veículo (em kg): "))
pessoas = int(
    input("Informe a quantidade de pessoas que o veículo comporta: "))

if (rodas <= 3):
    print("Categoria A")
elif (rodas == 4) and (peso <= 3500) and (pessoas <= 8):
    print("Categoria B")
elif (rodas >= 4):
    if (peso > 3500) and (peso <= 6000):
        print("Categoria C")
    elif (pessoas > 8):
        print("Categoria D")
    elif (peso > 6000):
        print("Categoria E")
else:
    print("Opção inválida.")
