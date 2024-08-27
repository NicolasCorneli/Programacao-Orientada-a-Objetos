public class aluno{
    String Nome = " ";
    float Media = 0;
    float G1 = 0;
    float G2 = 0;
    
    public void calcular_media(){
        Media = (G1+G2) / 2;
    }

    public void exibir(){
        System.out.println(Nome);

    }
}
