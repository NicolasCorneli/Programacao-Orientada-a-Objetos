package exercicio07;
public class Mamifero extends Animal {
    private String alimentacao;

    public Mamifero(String nomeCientifico, int idade, String habitat, String alimentacao){
        super(nomeCientifico, idade, habitat);
        this.alimentacao = alimentacao;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Alimentação: "+getAlimentacao());
    }
    
}
