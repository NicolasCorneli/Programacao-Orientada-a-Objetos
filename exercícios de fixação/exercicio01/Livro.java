package exercicio1;

public class Livro {
    private String titulo;
    private String autor;
    private int isbn;
    public int length;

    public Livro(String titulo,String autor,int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    

}
