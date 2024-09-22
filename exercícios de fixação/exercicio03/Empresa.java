import java.util.ArrayList;

public class Empresa {
    private ArrayList<Projeto> projetos;

    public Empresa(){
        projetos = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto nomeProjeto){
        projetos.add(nomeProjeto);
    }

    public void alocarFuncionariosAProjetos(Funcionario f, Projeto p){
        for (Projeto x : projetos){
            if (x.getNome() == p.getNome()){
                p.alocarFuncionario(f);
                System.out.println("Funcionário " + f.getNome() + " alocado ao projeto " + p.getNome());
            }
        }
    }

    public void adicionarTarefasAProjetos(Tarefa t, Projeto p){
        for (Projeto x : projetos){
            if (x.getNome() == p.getNome()){
                p.adicionarTarefa(t);
            }
        }
    }

    public void relatorioProjeto(Projeto p) {
        for (Projeto x : projetos) {
            if (x.getNome() == p.getNome()) {
                System.out.println("Nome do projeto: " + p.getNome());
                System.out.println("Data de Início: " + p.getDataInicio());
    
                System.out.println("Tarefas:");
                for (Tarefa t : p.getTarefas()) {
                    System.out.println("- " + t.getNome());
                }
    
                System.out.println("Funcionários no projeto:");
                for (Funcionario f : p.getFuncionarios()) {
                    System.out.println("- " + f.getNome());
                }
            }
        }
    }
    
}
