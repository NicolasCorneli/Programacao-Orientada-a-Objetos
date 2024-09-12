package exercicio1;

public class Carro {
    private Motor motor;
    
    public Carro(){
        this.motor = new Motor(1,"Gasolina");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
