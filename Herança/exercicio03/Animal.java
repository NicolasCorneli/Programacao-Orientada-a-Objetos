package exercicio03

public class Animal{
    protected String animal;

    public Animal(String animal){
        this.animal = animal;
    }

    public String getCachorro() {
        return animal;
    }

    public void setCachorro(String animal) {
        this.animal = animal;
    }
    
    public void exibir(){
        System.out.println("Animal: "+animal);
    }
}
