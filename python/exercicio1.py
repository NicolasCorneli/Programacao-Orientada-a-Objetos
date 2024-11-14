class Aluno:
    def __init__(self,nome,idade,nota):
        self.__nome = nome
        self.__idade = idade
        self.__nota = nota
    
    def getNome(self):
        return self.__nome
    
    def setNome(self,nome):
        self.__nome = nome
    
    def getIdade(self):
        return self.__idade
    
    def setIdade(self,idade):
        self.__idade = idade
    
    def getNota(self):
        return self.__nota
    
    def setNota(self,nota):
        self.__nota = nota
    
a1 = Aluno("Braga",21,9)
print(a1.getNome())
print(a1.getIdade())
print(a1.getNota())
