import java.util.ArrayList;

public class Viagem {
    private Motorista motorista;
    private VeiculosEletricos veiculo;
    private double distancia;
    private String destino;
    private ArrayList<Eletroposto> paradasEletroposto;

    public Viagem(Motorista motorista, VeiculosEletricos veiculo, double distancia, String destino) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.distancia = distancia;
        this.destino = destino;
        this.paradasEletroposto = new ArrayList<>();
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

    public void realizarViagem() {
        System.out.println("Iniciando viagem para " + destino + " com " + motorista.getNome());
        if (veiculo.getAutonomiaAtual() >= distancia) {
            veiculo.consumirBateria(distancia);
            System.out.println("Viagem concluída com sucesso.");
        } else {
            double distanciaRestante = distancia;
            for (Eletroposto parada : paradasEletroposto) {
                double autonomiaAntesParada = veiculo.getAutonomiaAtual();
                if (autonomiaAntesParada < distanciaRestante) {
                    double kmAntesParada = autonomiaAntesParada;
                    veiculo.consumirBateria(kmAntesParada);
                    distanciaRestante -= kmAntesParada;
                    adicionarParada(parada);
                } else {
                    veiculo.consumirBateria(distanciaRestante);
                    distanciaRestante = 0;
                    System.out.println("Viagem concluída com sucesso.");
                }
            }
            if (distanciaRestante > 0) {
                System.out.println("Não foi possível concluir a viagem devido à falta de autonomia.");
            }
        }
    }
}
