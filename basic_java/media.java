public class media{
    public static void main(String[] args){
        aluno bruno = new aluno();
        bruno.Nome = "Bruno";
        bruno.G1 = 7;
        bruno.G2 = 10;
        bruno.calcular_media();

        aluno nicolas = new aluno();
        nicolas.Nome = "Nicolas";
        nicolas.G1 = 8;
        nicolas.G2 = 9;
        nicolas.calcular_media();
        
        if (bruno.Media >= 7){
            bruno.exibir();
        }
        if (nicolas.Media >= 7){
            nicolas.exibir();
        }

    }
}
