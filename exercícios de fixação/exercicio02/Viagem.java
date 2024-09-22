public class Viagem {
    private Veiculo veiculo;
    private Motorista motorista;
    private String origem;
    private String destino;
    private double distancia;

    public Viagem(Veiculo veiculo, Motorista motorista, String origem, String destino, double distancia){
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    

}
