package exercicio03

public class Cachorro extends Animal {
    private String cachorro;

    public Cachorro(String animal, String cachorro){
        super(animal);
        this.cachorro = cachorro;
    }

    public String getCachorro() {
        return cachorro;
    }

    public void setCachorro(String cachorro) {
        this.cachorro = cachorro;
    }

    public void exibir(){
        super.exibir();
        System.out.println("Cachorro: "+getCachorro());
    }
    
}
