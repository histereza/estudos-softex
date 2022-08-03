class Calculo():
    def __init__(self, valor1, valor2):
        self.v1 = valor1
        self.v2 = valor2

    def incremento(self):
        self.res = self.v1 + self.v2
        print(f'Resultado: {self.res}')

    def decremento(self):
        self.resdec = self.v1 - self.v2
        print(f'Resultado: {self.resdec}')

    def divisao(self):
        self.resdiv = self.v1 / self.v2
        print(f'Resultado: {self.resdiv}')


obj1 = Calculo(10, 2)
obj1.incremento()
obj1.decremento()
obj1.divisao()

obj2 = Calculo(20, 5)
obj2.incremento()
obj2.decremento()
obj2.divisao()

obj3 = Calculo(80, 4)
obj3.incremento()
obj3.decremento()
obj3.divisao()
