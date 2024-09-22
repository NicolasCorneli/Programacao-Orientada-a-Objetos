public class Tarefa {
    private String nome;
    private String descricao;
    private int duracaoEstimada;
    private String estado;

    public Tarefa(String nome, String descricao, int duracaoEstimada){
        this.nome = nome;
        this.descricao = descricao;
        this.duracaoEstimada = duracaoEstimada;
        estado = "Novo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoEstimada() {
        return duracaoEstimada;
    }

    public void setDuracaoEstimada(int duracaoEstimada) {
        this.duracaoEstimada = duracaoEstimada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
}
