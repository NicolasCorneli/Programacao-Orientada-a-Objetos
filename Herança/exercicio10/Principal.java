package exercicio10;
class Equipamento {
    public void ligar() {
        System.out.println("Ligado");
    }
}

class Computador extends Equipamento {
}

public class Principal {
    public static void main(String[] args) {

        Computador c1 = new Computador();

        c1.ligar(); 

    }
}
