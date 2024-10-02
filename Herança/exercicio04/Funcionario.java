package exercicio04;
public class Funcionario {
    protected double salario;

    public Funcionario(double salario){
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibir(){
        System.out.println("Salario: "+salario);
    }
    
}
