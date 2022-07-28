class numeroComplexo:
    def __init__(self, n1, n2, n3, n4, n5, n6):
        self.num1 = complex(n1, n2)
        self.num2 = complex(n3, n4)
        self.num3 = complex(n5, n6)

    def realImag(self):
        print("PARTES REAIS:")
        print(self.num1.real, self.num2.real, self.num3.real)
        print("PARTES IMAGINARIAS:")
        print(self.num1.imag, self.num2.imag, self.num3.imag)

    def soma(self):
        soma = self.num1 + self.num2 + self.num3
        print(f"Soma {soma}")

    def subtracao(self):
        subtracao = self.num1 - self.num2 - self.num3
        print(f"Subtracao: {subtracao}")

    def multiplicacao(self):
        multiplicacao = self.num1 * self.num2 * self.num3
        print(f"Multiplicação: {multiplicacao}")

    def divisao(self):
        divisao = self.num1 / self.num2 / self.num3
        print(f"Divisão: {divisao}")

    def tudo(self):
        self.realImag()
        self.soma()
        self.subtracao()
        self.multiplicacao()
        self.divisao()


numerocompleto = numeroComplexo(4, 2, 5, 3, 6, 4)
print(numerocompleto.tudo())
