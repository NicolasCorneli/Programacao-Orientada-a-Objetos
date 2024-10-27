public class Motorista {
    private String nome;
    private int id;
    private int numeroHabilitacao;
    private String nivelExperiencia;

    public Motorista(String nome, int id, int numeroHabilitacao, String nivelExperiencia){
        this.nome = nome;
        this.id = id;
        this.numeroHabilitacao = numeroHabilitacao;
        setNivelExperiencia(nivelExperiencia);
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
        String experiencia = nivelExperiencia.toLowerCase();
        if (experiencia.equals("iniciante") || experiencia.equals("intermediário") || experiencia.equals("avançado")) {
            this.nivelExperiencia = experiencia;
        } else {
            System.out.println("Digite um nível de experiência válido: iniciante, intermediário ou avançado.");
        }
    }
}
