public class Cliente {
    private String nome;
    private int documento;
    private String contato;

    public Cliente(String nome, int documento, String contato){
        this.nome = nome;
        this.documento = documento;
        this.contato = contato;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    
    
}
