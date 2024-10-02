package exercicio06;

public class Principal {
    public static void main(String[] args) {
        Professor p1 = new Professor("Carlos Silva", 45,"Matemática");
        p1.exibir();

        Aluno a1 = new Aluno("João Souza", 20, 20232054);
        System.out.println("                             ");
        a1.exibir();
    }
}
