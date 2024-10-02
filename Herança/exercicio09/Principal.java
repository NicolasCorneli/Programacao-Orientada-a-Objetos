package exercicio09;
class Documento {
    String titulo;
    String conteudo;
}

class Artigo extends Documento {
    String autor;
}

public class Principal {
    public static void main(String[] args) {
        Artigo artigo = new Artigo();

        artigo.titulo = "POO";
        artigo.conteudo = "Herança";
        artigo.autor = "Alan Kay";

        System.out.println("Título: " + artigo.titulo);
        System.out.println("Conteúdo: " + artigo.conteudo);
        System.out.println("Autor: " + artigo.autor);
    }
}
