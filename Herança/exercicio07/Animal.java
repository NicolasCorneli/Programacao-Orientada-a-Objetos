package exercicio07;
public class Animal extends SerVivo{
    protected String habitat;

    public Animal(String nomeCietifico, int idade, String habitat){
        super(nomeCietifico, idade);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    public void exibir(){
        super.exibir();
        System.out.println("Habitat: "+getHabitat());
    }
}
