package exercicio07;
public class SerVivo {
    protected String nomeCientifico;
    protected int idade;
    
    public SerVivo(String nomeCientifico,int idade){
        this.nomeCientifico = nomeCientifico;
        this.idade = idade;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void exibir(){
        System.out.println("Nome Cientifico: "+getNomeCientifico());
        System.out.println("Idade: "+getIdade());
    }
}
