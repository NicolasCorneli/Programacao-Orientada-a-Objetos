import java.time.LocalDate;
import java.util.ArrayList;

public class Projeto {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Funcionario> funcionarios;
    private String nome;
    private LocalDate dataInicio;

    public Projeto(String nome){
        this.nome = nome;
        this.dataInicio = LocalDate.now();
        this.tarefas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();

    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void alocarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }   

}
