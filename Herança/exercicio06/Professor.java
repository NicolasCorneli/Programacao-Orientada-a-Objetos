package exercicio06;
public class Professor extends Pessoa{
    protected String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Disciplina: "+getDisciplina());
    }
    
    
}
