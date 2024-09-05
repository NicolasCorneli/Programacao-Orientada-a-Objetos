package exercicio2;
import java.util.Scanner;

public class contabancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public contabancaria(String titular, double saldo, int numeroConta){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;

    }
    
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        if (saldo > 0)
        this.saldo = saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantia para depositar: ");
        valor = scanner.nextDouble();
        if (valor > 0)
        saldo = valor;

        scanner.close();
    }

    public void sacar(double valor){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma quantia para sacar: ");
        valor = scanner.nextDouble();
        if (saldo <= valor)
        saldo = saldo - valor;

        scanner.close();
    }
}
