import java.util.ArrayList;

public class Motorista {
    private String nome;
    private int id;
    private int numeroHabilitacao;
    private String nivelExperiencia;
    private ArrayList<Viagem> historicoViagens;

    public Motorista(String nome, int id, int numeroHabilitacao, String nivelExperiencia) {
        this.nome = nome;
        this.id = id;
        this.numeroHabilitacao = numeroHabilitacao;
        setNivelExperiencia(nivelExperiencia);
        this.historicoViagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroHabilitacao() {
        return numeroHabilitacao;
    }

    public void setNumeroHabilitacao(int numeroHabilitacao) {
        this.numeroHabilitacao = numeroHabilitacao;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public ArrayList<Viagem> getHistoricoViagens() {
        return historicoViagens;
    }

    public void setHistoricoViagens(ArrayList<Viagem> historicoViagens) {
        this.historicoViagens = historicoViagens;
    }

    public void registrarViagem(Viagem viagem) {
        this.historicoViagens.add(viagem);
    }

    public void listarViagens() {
        for (Viagem viagem : historicoViagens) {
            System.out.println("Motorista: "+ this.nome);
            System.out.println("Destino: " + viagem.getDestino() + ", Distância: " + viagem.getDistancia() +
                               ", Veículo: " + viagem.getVeiculo().getModelo());
            System.out.println("Paradas para recarga:");
            for (Eletroposto e : viagem.getParadasEletroposto()) {
                System.out.println("- Eletroposto: " + e.getLocal());
            }
        }
    }

}
