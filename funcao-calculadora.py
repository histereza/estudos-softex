def calculadora(numero1, numero2, operacao):
    if (operacao == 1):
        resultado = numero1 + numero2
        return resultado
    elif (operacao == 2):
        resultado = numero1 - numero2
        return resultado
    elif (operacao == 3):
        resultado = numero1 * numero2
        return resultado
    elif (operacao == 4):
        resultado = numero1 / numero2
        return resultado
    else:
        resultado = 0
        return resultado


print(calculadora(1, 2, 1))
