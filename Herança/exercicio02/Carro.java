package exercicio02;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano,int numPortas){
        super(marca,modelo,ano);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Numero de portas: "+getNumPortas());
    }

}
