package exercicio1;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String data_emprestimo;
    private String data_devolucao;

    public Emprestimo(Livro livro, Usuario usuario, String dataE){
        this.livro = livro;
        this.usuario = usuario;
        this.data_emprestimo = dataE;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }


}
