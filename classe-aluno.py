class Aluno:
    def __init__(self, nome, idade, turma):
        self._nome = nome
        self._idade = ''
        self._turma = turma
        if 0 <= idade <= 120:
            self._idade = idade
        else:
            print("Idade incorreta.")
    
    #getter e setter nome        
    def get_nome(self):
        return self._nome
        
    def set_nome(self, novoNome):
        self._nome = novoNome
    
    #getter e setter idade
    def get_idade(self):
        if self._idade == '':
            print(f'A idade inicial de {self.get_nome()} foi configurada incorretamente. Por favor, faça um ajuste.')
        return self._idade
            
    def set_idade(self, novaIdade):
        if 0 <= novaIdade <= 120:
            self._idade = novaIdade
        else:
            print("Idade incorreta.")
    
    #getter e setter turma
    def get_turma(self):
        return self._turma
        
    def set_turma(self, novaTurma):
        self._turma = novaTurma
        
maria = Aluno('maria', -1, 3)

print(maria.get_nome())
maria.set_nome('Maria da Silva')
print(maria.get_nome())

print(maria.get_idade())
maria.set_idade(15)
print(maria.get_idade())

print(maria.get_turma())
maria.set_turma('1º B')
print(maria.get_turma())

