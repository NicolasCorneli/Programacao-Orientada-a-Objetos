package exercicio08;
public class Veiculo {
    protected double capacidadeTanque;

    public Veiculo(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
        
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public void exibirCapacidadeTanque(){
        System.out.println("Capacidade do tanque: "+getCapacidadeTanque());
    }

}
