public class Eletroposto {
    private int id;
    private String local; // cidade ou estrada
    private int vagasDisponiveis;
    private double tempoCarregamento;

    public Eletroposto(int id, String local, int vagasDisponiveis, double tempoCarregamento){
        this.id = id;
        this.local = local;
        this.vagasDisponiveis = vagasDisponiveis;
        this.tempoCarregamento = tempoCarregamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void setVagasDisponiveis(int vagasDisponiveis) {
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public double getTempoCarregamento() {
        return tempoCarregamento;
    }

    public void setTempoCarregamento(double tempoCarregamento) {
        this.tempoCarregamento = tempoCarregamento;
    }

    public boolean temVagaDisponivel() {
        return vagasDisponiveis > 0;
    }

    public void ocuparVaga() {
        if (temVagaDisponivel()) vagasDisponiveis--;
    }

    public void liberarVaga() {
        vagasDisponiveis++;
        System.out.println("Liberando vaga e continuando viagem!");
    }
}
