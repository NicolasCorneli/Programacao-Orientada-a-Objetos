public class Biblioteca {
    private Livro[] livros;
    private Emprestimo[] emprestimos;
    private Usuario[] usuarios;
    private int qntdEmprestimos;
    private int qntdLivros;
    private int qntdUsuarios;
    
    
    public Biblioteca(){
        this.livros = new Livro[10];
        this.emprestimos = new Emprestimo[10];
        this.usuarios = new Usuario[10];
        this.qntdLivros = 0;
        this.qntdEmprestimos = 0;
        this.qntdUsuarios = 0;
        this.qntdUsuarios = 0;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public int getQntdUsuarios() {
        return qntdUsuarios;
    }

    public void setQntdUsuarios(int qntdUsuarios) {
        this.qntdUsuarios = qntdUsuarios;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public Emprestimo[] getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(Emprestimo[] emprestimos) {
        this.emprestimos = emprestimos;
    }

    public int getQntdEmprestimos() {
        return qntdEmprestimos;
    }

    public void setQntdEmprestimos(int qntdEmprestimos) {
        this.qntdEmprestimos = qntdEmprestimos;
    }

    public int getQntdLivros() {
        return qntdLivros;
    }

    public void setQntdLivros(int qntdLivros) {
        this.qntdLivros = qntdLivros;
    }

    public void adicionarLivro(String titulo, String autor, int isbn){
        if (getQntdLivros() < livros.length){
            livros[qntdLivros] = new Livro(titulo, autor, isbn);
            setQntdLivros(getQntdLivros() + 1);

        }else{
            System.out.println("Biblioteca cheia!");
        }
    }
    public void registrarEmprestimo(Livro livro, Usuario usuario, String dataEmprestimo,String dataDevolucao){
        if (getQntdEmprestimos() < emprestimos.length){
            emprestimos[qntdEmprestimos] = new Emprestimo(livro, usuario, dataEmprestimo, dataDevolucao);
            
            setQntdEmprestimos(getQntdEmprestimos() + 1);

        }else{
            System.out.println("Quantidade limite de emprestimos atingida!");
        }
    }
    public void cadastarUsuario(String nome){
        if (getQntdUsuarios() < usuarios.length){
            usuarios[qntdUsuarios] = new Usuario(nome, qntdUsuarios);
        }else{
            System.out.println("Quantidade máxima de usuários atingida!");
        }
    }

    public void livrosEmprestados(){
        for (int x = 0; x < emprestimos.length; x++){
            if (livros[x] != null){
                System.out.println("Livros emprestados: " + emprestimos[x].getLivro());
            }
        }
    }

    public void livrosDisponiveis(){
        for (int x = 0; x < livros.length; x++){
            if (livros[x] != null){
                System.out.println("Livros disponiveis: " + livros[x].getTitulo());
            }
        }
    }
    
    
}
