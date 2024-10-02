package exercicio06;
public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }


    public void exibir() {
        super.exibir();
        System.out.println("Matrícula: " + matricula);
    }

}
