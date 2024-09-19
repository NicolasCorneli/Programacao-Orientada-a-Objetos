package exercicio1;

public class Biblioteca {
    private Livro[] livros;
    private Emprestimo[] emprestimos;
    private int numeroLivros;
    private int numeroEmprestimos;

    public Biblioteca(int qL, int qE){
        this.livros = new Livro[qL];
        this.emprestimos = new Emprestimo[qE];
        this.numeroLivros = qL;
        this.numeroEmprestimos = qE;
    }
    
    public void adicionarLivro(Livro livro){
        if (numeroLivros < livros.length){
            livros[numeroLivros] = livro;
            numeroLivros++;
        }else{
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void registrarEmprestimo(Livro livro, Usuario usuario, String data_emprestimo){
        if (numeroEmprestimos < emprestimos.length){
            Emprestimo emprestimo = new Emprestimo(livro, usuario, data_emprestimo);
            emprestimos[numeroEmprestimos] = emprestimo;
            numeroEmprestimos++;
            remove(livros[])
        }else{
            System.out.println("Capacidade máxima atingida");
        }
    }

    public void livrosEmprestados(){
        System.out.println("Livros Emprestados:");
        for (int i = 0; i < numeroEmprestimos; i++){
            System.out.println(emprestimos[i]);
        }
    }

    public void livrosDisponiveis(){
        System.out.println("Livros Disponiveis:");
        for (int i = 0; i < numeroLivros; i++){
            System.out.println(livros[i]);
        }
    }
}
