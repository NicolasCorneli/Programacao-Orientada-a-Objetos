public class Controle {

    int[] matricula = {1,2,3,4,5,6,7,8,9,10};
    String[] nome = {"João","Maria","Pedro","Clara","José","Carla","Fabio","Mara","Cesar","Ana"};
    int[] idade = {14,18,15,16,17,14,17,13,16,17};
    double[] altura = {1.75,1.54,1.62,1.60,1.65,1.62,1.62,1.74,1.61,1.68};

    public double calcularMediaIdade() {
        int soma = 0;
        for (int x = 0; x < idade.length; x++) {
            soma = soma + idade[x];
        }
        return (double) soma / idade.length;
    }

    public void exibirAlunosMaisJovens() {
        int menor1 = 1000;
        String aluno1 = "";
        int menor2 = 1000;
        String aluno2 = "";
        for (int x = 0; x < idade.length; x++) {
            if (menor1 > idade[x]) {
                aluno2 = aluno1;
                menor2 = menor1;
                aluno1 = nome[x];
                menor1 = idade[x];
            } else if (menor2 > idade[x] && idade[x] != menor1) {
                aluno2 = nome[x];
                menor2 = idade[x];
            }
        }
        System.out.println("Os 2 alunos mais novos são: " + aluno1 + " e " + aluno2);
    }

    public double percentualAlunos16() {
        int quantidade_maior_16 = 0;
        for (int x = 0; x < idade.length; x++) {
            if (idade[x] > 16) {
                quantidade_maior_16++;
            }
        }
        return (double) quantidade_maior_16 / idade.length * 100;
    }

    public void alturaAlunos() {
        double soma = 0;
        double media = 0;
        int quantidade = 0;
        for (int x = 0; x < altura.length; x++) {
            soma = soma + altura[x];
        }
        media = soma / altura.length;
        for (int x = 0; x < idade.length; x++) {
            if (idade[x] < 16 && altura[x] > media) {
                quantidade++;
            }
        }
        System.out.println("A quantidade de alunos com menos de 16 anos que têm altura superior à média é: " + quantidade);
    }

    public static void main(String[] args) {
        Controle controle = new Controle();
        double media = controle.calcularMediaIdade();
        System.out.println("A média de idade é: " + media);
        
        controle.exibirAlunosMaisJovens();
        
        double percentual = controle.percentualAlunos16();
        System.out.println("O percentual de alunos com mais de 16 anos é: " + percentual + "%");
        
        controle.alturaAlunos();
    }
}
