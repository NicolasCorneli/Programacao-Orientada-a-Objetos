import java.util.ArrayList;

public class Viagem{
    private Motorista motorista;
    private VeiculosEletricos veiculo;
    private double distancia;
    private String destino;
    private ArrayList<Eletroposto> paradasEletroposto;
    private ArrayList<Eletroposto> verificaEletroposto;

    public Viagem(Motorista motorista, VeiculosEletricos veiculo, double distancia, String destino) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.distancia = distancia;
        this.destino = destino;
        this.paradasEletroposto = new ArrayList<>();
        motorista.registrarViagem(this);
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public VeiculosEletricos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculosEletricos veiculo) {
        this.veiculo = veiculo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Eletroposto> getParadasEletroposto() {
        return paradasEletroposto;
    }

    public void setParadasEletroposto(ArrayList<Eletroposto> paradasEletroposto) {
        this.paradasEletroposto = paradasEletroposto;
    }

    public ArrayList<Eletroposto> getVerificaEletroposto() {
        return verificaEletroposto;
    }

    public void setVerificaEletroposto(ArrayList<Eletroposto> verificaEletroposto) {
        this.verificaEletroposto = verificaEletroposto;
    }

    public void adicionarParada(Eletroposto e) {
        if (e.temVagaDisponivel()) {
            this.paradasEletroposto.add(e);
            e.ocuparVaga();
            System.out.println("Parada no eletroposto: " + e.getLocal());
            veiculo.recarregarBateria(veiculo.getCapacidadeBateria());
        } else {
            System.out.println("Eletroposto sem vagas disponíveis.");
        }
    }

    public void realizarViagem(ArrayList<Eletroposto> listaEletropostos) {
        System.out.println("Iniciando viagem para " + this.destino + " com " + motorista.getNome());
        if (veiculo.getAutonomiaAtual() >= this.distancia) {
            veiculo.consumirBateria(this.distancia);
            System.out.println("Viagem concluída com sucesso.");
        } else {
            double distanciaRestante = this.distancia;
            double autonomiaRestante = veiculo.getAutonomiaAtual();
            verificaEletroposto = new ArrayList<>();
            while (distanciaRestante > 0){
                if (veiculo.getAutonomiaAtual() < distanciaRestante) {
                    veiculo.consumirBateria(veiculo.getAutonomiaAtual());
                    distanciaRestante -= autonomiaRestante;
                    for (Eletroposto e : listaEletropostos) {
                        if (verificaEletroposto.contains(e)){
                            continue;
                        }else{
                            adicionarParada(e);
                            e.liberarVaga();
                            verificaEletroposto.add(e);
                            break;
                        }
                    }
                }else {
                    veiculo.consumirBateria(distanciaRestante);
                    distanciaRestante = 0;
                    System.out.println("Viagem concluída com sucesso.");
                }
            }
        }
    }
}
