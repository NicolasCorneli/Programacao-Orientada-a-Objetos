package exercicio01;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome,idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Matricula: "+getMatricula());
    }
    
}
