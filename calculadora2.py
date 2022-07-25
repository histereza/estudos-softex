def calculadora2():
    operacao = int
    while (operacao != 0):
        print("1: Soma \n2: Subtração \n3: Multiplicação \n4: Divisão \n0: Sair")
        operacao = int(input("Escolha uma operação: "))
        if (operacao == 0):
            break
        else:
            valor1 = int(input("Insira o primeiro valor: "))
            valor2 = int(input("Insira o segundo valor: "))

            if (operacao == 1):
                res = valor1 + valor2
                print(valor1, " + ", valor2, " = ", res)
            elif (operacao == 2):
                res = valor1 - valor2
                print(valor1, " - ", valor2, " = ", res)
            elif (operacao == 3):
                res = valor1 * valor2
                print(valor1, " x ", valor2, " = ", res)
            elif (operacao == 4):
                res = valor1 / valor2
                print(valor1, " / ", valor2, " = ", res)
            else:
                print("Essa opção não existe.")


calculadora2()
