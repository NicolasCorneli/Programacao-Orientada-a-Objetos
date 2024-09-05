package exercicio4;
import java.util.Scanner;

public class produto {
    private String nome;
    private int quantidadeEstoque;
    private double preco;

    public produto(String nome, int quantidadeEstoque, double preco){
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void adicionarEstoque(int quantidade){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade do estoque: ");
        quantidade = scanner.nextInt();
        if (quantidade > 0){
            quantidadeEstoque = quantidade;
        }
        scanner.close();
    }

    public void vender(int quantidade){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o quanto quer vender: ");
        quantidade = scanner.nextInt();

        if (quantidade <= quantidadeEstoque){
            quantidadeEstoque = quantidade;
        }

        scanner.close();

    }
    
}
