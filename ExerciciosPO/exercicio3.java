package exercicio3;
import java.util.Scanner;


public class pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    
    public pessoa(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        nome = scanner.nextLine();

        scanner.close();
    }

    public int getIdade(){
        return idade;
        }
    
    public void setIdade(int idade){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int teste = scanner.nextInt();
        if (teste > 0)
        idade = scanner.nextInt();

        scanner.close();
    }

    public String getCpf(){
        return cpf;
    }

    public void mostrarDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Cpf:"+ cpf);
    }

}
