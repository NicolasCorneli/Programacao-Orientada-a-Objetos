public class Principal {
    public static void main(String[] args){
        Empresa a1 = new Empresa();

        Funcionario x = new Funcionario("Fernando", "Chefe");
        Funcionario y = new Funcionario("Luis", "Estagiário");

        Tarefa q = new Tarefa("Limpeza", "Limpar a sala", 2);
        Tarefa u = new Tarefa("Mercado", "Ir ao mercado mais próximo, comprar vinho", 1);

        Projeto l = new Projeto("Projeto L");
        a1.adicionarProjeto(l);
        Projeto v = new Projeto("Projeto V");
        a1.adicionarProjeto(v);
        

        a1.alocarFuncionariosAProjetos(x,l);
        a1.adicionarTarefasAProjetos(u, l);
        a1.adicionarTarefasAProjetos(q,l);

        a1.alocarFuncionariosAProjetos(y, v);;
        a1.adicionarTarefasAProjetos(q,v);

        a1.relatorioProjeto(l);
        a1.relatorioProjeto(v);
    }
    
}
