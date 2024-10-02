package exercicio08;
public class Carro extends Veiculo {
    private String nome;

    public Carro(double capacidadeTanque, String nome){
        super(capacidadeTanque);
        this.nome = nome;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirCapacidadeTanque(){
        super.exibirCapacidadeTanque();
        System.out.println("Nome do carro: "+getNome());
    }
}
