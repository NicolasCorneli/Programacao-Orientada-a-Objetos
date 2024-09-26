package exercicio02;

public class Principal {
    public static void main(String[] args){
        Veiculo v1 = new Veiculo("Toyota","SUV",2022);
        Carro c1 = new Carro("Celta","Preto",1975,10);

        v1.exibir();
        System.out.println("                                                ");
        c1.exibir();
    }
    
}
