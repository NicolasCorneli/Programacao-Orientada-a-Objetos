class ContaBancaria:
    def __init__(self, saldo):
        self.__saldo = saldo
    
    def getSaldo(self):
        return self.__saldo
    
    def setSaldo(self, saldo):
        self.__saldo = saldo
    
    def depositar(self, valor):
        self.setSaldo(self.getSaldo() + valor)
    
    def sacar(self, valor):
        if valor > self.getSaldo():
            print("Saldo insuficiente")
        else:
            self.setSaldo(self.getSaldo() - valor)
            print("Saque realizado com sucesso")

cb1 = ContaBancaria(100)
print(cb1.getSaldo()) 
cb1.sacar(30)
print(cb1.getSaldo())  
cb1.depositar(50)
print(cb1.getSaldo()) 
